package com.lab1;

interface MCQexam{
	public void writtentest();
	interface AptitudeExam {
		public void test();
		
	}
}
//interface AptitudeExam extends MCQexam{
//	public void test();
//	
//}





public class Interface implements  MCQexam, MCQexam.AptitudeExam {

	public static void main(String[] args) {
		Interface a  = new Interface();
		a.writtentest();
		a.test();
	}

	@Override
	public void test() {
		System.out.println("Exam is over");
	}

	@Override
	public void writtentest() {
		System.out.println("test is over");

	}

}
