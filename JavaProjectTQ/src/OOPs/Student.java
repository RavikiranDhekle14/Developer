package OOPs;
public class Student {
    int studentId;
    String studentName;

    public void acceptDetails(int id, String name) {
    	studentId = id;
    	studentName = name;
    }
    public static void main(String[] args) {
    	Student student1 = new Student();
    	Student student2 = new Student();

    }
}