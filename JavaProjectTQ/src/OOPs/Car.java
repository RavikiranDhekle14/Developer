package OOPs;

public class Car {
		int cmodel;
		String cname;
		String ccolor;
		int cprize;
		
		public void carDetails(int model,String carname,String carcolor,int carprize) {
			cmodel = model;
			cname = carname;
			ccolor = carcolor;
			cprize = carprize;
		}
		public void display () {
			System.out.println(cmodel+ " " + cname + " " + ccolor + " " + cprize );
		}
		public static void main (String[] args) {
			Car car = new Car();
			car.carDetails(101,"Nexon","Black",700000);
			car.display();
			
			Car car2 = new Car();
			car2.carDetails(201,"Hexa","White",2000000);
			car2.display();
			
			Car car3 = new Car();
			car3.carDetails(301,"Harrior","Gray",1500000);
			car3.display();
		}
}
