package com.lab;

class Volume{
	
	double cylinder_radius;
	double Cylinder_height;
	int cube_length;
	int cube_breadth;
	int cube_height;
	
	public double calculateVolume(double r, double h) {
		cylinder_radius=r;
		Cylinder_height=h;
		double volume = 3.14*r*r*h;
		return volume;	
	}
	public double calculateVolume(int l, int b, int h) {
		cube_length=l;
		cube_breadth = b;
		cube_height=h;
		int volume = l*b*h;
		return volume;	
	}
}
public class VolumeCalculator {
	public static void main(String[] args) {
		Volume v = new Volume();
		System.out.println("Volumn of cylinder: "+ v.calculateVolume(5, 10));
		System.out.println("Volumn of cube: "+ v.calculateVolume(10, 10, 10));
	}

}

