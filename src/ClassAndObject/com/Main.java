package ClassAndObject.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        int b=sc.nextInt();
        Rectangle rect=new Rectangle(a,b);
        System.out.println("Area = "+rect.area());
        System.out.println("Perimeter = "+rect.perimeter());

        StudentManagementSystem student=new StudentManagementSystem();
        student.studentId=1;
        student.grade= 7.56F;
        student.name="Dishpan";
        student.age=22;

        System.out.println(student.studentId);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.grade);
    }
}
