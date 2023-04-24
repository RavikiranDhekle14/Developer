package com.exceptionHandling;

 class ItemStockOverflowException extends Exception {
    public ItemStockOverflowException(String message) {
        super(message);
    }
}

 class ItemStockUnderflowException extends Exception {
    public ItemStockUnderflowException(String message) {
        super(message);
    }
}
public class Store {
    private static int noOfItemsAvailable;
    private static int maximumLevel;
    private static int minimumLevel;

    public Store(int noOfItemsAvailable, int maximumLevel, int minimumLevel) {
        this.noOfItemsAvailable = noOfItemsAvailable;
        this.maximumLevel = maximumLevel;
        this.minimumLevel = minimumLevel;
    }

    public void addItem(int count) throws ItemStockOverflowException {
        int newCount = noOfItemsAvailable + count;
        if (newCount > maximumLevel) {
            throw new ItemStockOverflowException("Cannot add items, stock overflow");
        }
        noOfItemsAvailable = newCount;
    }

    public void removeItem(int count) throws ItemStockUnderflowException {
        int newCount = noOfItemsAvailable - count;
        if (newCount < minimumLevel) {
            throw new ItemStockUnderflowException("Cannot remove items, stock underflow");
        }
        noOfItemsAvailable = newCount;
    }

    public int checkStock() {
        return noOfItemsAvailable;
    }
    public static void main(String[] args) {
    	ItemStockOverflowException isof = new ItemStockOverflowException(null);
    	isof.getMessage();
    	
    	Store s = new Store(maximumLevel, minimumLevel, noOfItemsAvailable);
    	Store store = new Store(23, 30, 6);
		try {
			store.addItem(noOfItemsAvailable);
		} catch (ItemStockOverflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}



