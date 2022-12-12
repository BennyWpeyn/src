import java.io.InputStream;
import java.util.*;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);

        Lesson lc = new Lesson(201, " BM giris", 4 );
        System.out.println(lc.course_cod +" "+ lc.course_name + " " + lc.credit  );
        System.out.println("\n");
        


        Student std = new Student(2011, "Zeynepgül", 2,"lisans");
        //System.out.println(std.Lessons[0].course_cod);
        
        int desicion;
        System.out.println("wanna add a student yes:1 no:0");
        System.out.println("your choice:");
        desicion=sc.nextInt();
        switch(desicion){
            case 1:
                 AddingData data2=new AddingData();
                 data2.studentData();
                 System.out.println("succesfully added");
                 break;
             case 0:
                  System.out.println("no added");
                  break;
            default:
                  System.out.println("no choice");
                  break;

        }




        
          AddingData data=new AddingData();
         ArrayList<Student>newlist=data.studentData();
         

          for(Student st:newlist){
            System.out.println("name surname:"+ st.name_surname);
            System.out.println("ıd:"+st.id_number);
            System.out.println("year:"+st.year);
            System.out.println("graduaiton:"+st.graduation);
            System.out.println("\n");

          }




    }
}
