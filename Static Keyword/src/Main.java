class Student {
    public String name;
    public int rollno;
    public static String collegeName;

    static {
        collegeName = "SurTech";
    }

    public Student() {
        name = "";
        rollno = 0;
    }

    public void printInformation() {
        System.out.println(name + "," + rollno + "," + collegeName);
    }

    public static void printSpecificObjectInformation(Student obj) {
        System.out.println(obj.name + "," + obj.rollno + "," + collegeName);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Joy";
        s1.rollno = 5;

        Student s2 = new Student();
        s2.name = "Achal";
        s2.rollno = 10;
        s2.collegeName = "Techno Saltlake";


        s1.printInformation();
        s2.printInformation();
        
        Student.printSpecificObjectInformation(s1);
        Student.printSpecificObjectInformation(s2);

    }
}
