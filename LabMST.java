import java.util.*;
abstract class Person{
    String name;
    int Age;

    Person(String name, int Age) {
        this.name = name;
        this.Age = Age;
    }

    abstract void displayDetails();
}

class Student extends Person{
    int rollno;
    Student(String name,int rollno,int Age){
        super(name , Age);
        this.rollno = rollno;
    }
    void displayDetails(){
        System.out.println("Student Details: ");
        System.out.println("Name: " +name);
        System.out.println("Roll no: " +rollno);
        System.out.println("Age: " +Age);
    }
}
class Teacher extends Person{
    int SubCode;

    Teacher(String name,int SubCode,int Age) {
        super(name,Age);
        this.SubCode= SubCode;
    }
    void displayDetails(){
        System.out.println("Teacher Details: ");
        System.out.println("Name: " +name);
        System.out.println("SubCode: " +SubCode);
        System.out.println("Age: " +Age);
    }
}

public class LabMST{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        try{
        if(n==1){
            String name = sc.nextLine();
            int rollno = sc.nextInt();
            int Age = sc.nextInt();
            if(Age<0){
                System.out.println("Age cannot be a negative number.");
            }
            else{
            Person obj = new Student(name,rollno,Age);
            obj.displayDetails();
            }
        }
        else{
            String name = sc.nextLine();
            int Subcode = sc.nextInt();
            int Age = sc.nextInt();
            if(Age<0){
                System.out.println("Age cannot be a negative number.");
            }
            else{
            Person obj = new Teacher(name,Subcode,Age);
            obj.displayDetails();
            }
        }
        }
        catch (InputMismatchException e){
            System.out.println("Roll Code and Subject Code must be integers.");
        }
    }
}
