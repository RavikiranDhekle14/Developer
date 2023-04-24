package OOPs;

public class Students {
	int sid;
	String sname;
	double sub1Marks;
	double sub2Marks;
	double sub3Marks;
	double percentage3subs;
	
	public void acceptDetails(int id, String name, double physics , double chemistry, double maths) {
		sid = id;
		sname = name;
		sub1Marks = physics;
		sub2Marks = chemistry;
		sub3Marks = maths;
	}
	
	public void percentageOf3subs() {
		percentage3subs = ((sub1Marks+sub2Marks+sub3Marks)/300.0)*100;
	}
	public void display() {
		System.out.println(sid+ " " +sname+ " " +percentage3subs);
	}
	public static void main(String[] args) {
		Students student = new Students();
		student.acceptDetails(111,"Amit",68.65,75.32,90.12);
		student.percentageOf3subs();
		student.display();
	}

}
