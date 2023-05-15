package com.array;

class Penshop {
	private int capLength;
	private String brand;
	private Refill refill;
	public int getCapLength() {
		return capLength;
	}
	public void setCapLength(int capLength) {
		this.capLength = capLength;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Refill getRefill() {
		return refill;
	}
	public void setRefill(Refill refill) {
		this.refill = refill;
	}
}
	class Refill {
		private String inkcolor;
		private int length;
		private Nib nib;
		
	public String getInkcolor() {
			return inkcolor;
		}

		public void setInkcolor(String inkcolor) {
			this.inkcolor = inkcolor;
		}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public Nib getNib() {
			return nib;
		}

		public void setNib(Nib nib) {
			this.nib = nib;
		}
}
	class Nib {
			private String materialType;
			private  int width;
			public String getMaterialType() {
				return materialType;
			}
			public void setMaterialType(String materialType) {
				this.materialType = materialType;
			}
			public int getWidth() {
				return width;
			}
			public void setWidth(int width) {
				this.width = width;
			}
}
public class Pen {
	
	
public static void main(String[] args) {
		Penshop p = new Penshop();
		p.setBrand("Cello");
		p.setCapLength(5);
		p.setRefill(new Refill());
		System.out.println(p.getBrand());
		System.out.println(p.getCapLength());
		
		Refill r = new Refill();
		r.setInkcolor("Blue");
		r.setLength(12);
		r.setNib(new Nib());
		System.out.println(r.getInkcolor());
		System.out.println(r.getLength());
		
		Nib n = new Nib();
		n.setMaterialType("Plastic");
		n.setWidth(3);
		System.out.println(n.getMaterialType());
		System.out.println(n.getWidth());
		
	}

}
