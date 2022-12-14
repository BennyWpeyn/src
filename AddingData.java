import java.util.ArrayList;
import java.util.Scanner;

public class AddingData {
    //create a arrraylist method of generic type "student"
ArrayList<Student> studentData(){
    Scanner sc2=new Scanner(System.in);

    System.out.println("pls enter your infos:");
    System.out.print("id:");
    int id=sc2.nextInt();

    System.out.print("name surname:");
    String name=sc2.nextLine();

    System.out.print("year:");
    int year=sc2.nextInt();

    System.out.print("graduation:");
    String grad=sc2.nextLine();

    Student std2=new Student(id, name, year);




//create 3 objects of Student class 
    Student s1=new Student(45,"berkecan",2);
    Student s2=new Student(62,"melike",4);
    Student s3=new Student(10,"nilsu",3);


    
//create the object of arraylist of generic type "student"
ArrayList<Student> studentlist=new ArrayList<Student>();


//adding student objects in the arraylist 
studentlist.add(s1);
studentlist.add(s2);
studentlist.add(s3);
studentlist.add(std2);

//return object reference variable "studentlist" of the array list to the method "studentValue"
return studentlist;

    }
}
