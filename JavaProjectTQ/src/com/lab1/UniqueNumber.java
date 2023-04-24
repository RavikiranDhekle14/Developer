package com.lab1;

class Unique {
	 void uniqueElement (int arr[]) {
			int element = 1;
		for (int i=0; i<arr.length; i++) {
			boolean visited = false;
			for(int j=i+1; j < arr.length; j++)
			{
				if (arr[i] == arr[j])
				{
					visited=true;
					break;
				}
			}
			if (visited==false)
			{
				System.out.println(arr[i]+" ");	
			}
		}
				System.out.println();
	}

}

class UniqueNumber {

	public static void main(String[] args) {
		int arr[] = {1,6,7,9,3,6,4,5,8,7,9,2,3,1,5,4,6,4,3};
		
		Unique u= new Unique();
		u.uniqueElement(arr);
		
		System.out.println("Unique element: ");
	}
	
}

