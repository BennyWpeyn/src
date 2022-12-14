public class Lecturer {
    int identification_number;
    String name_surname;
    Lesson ListOfCourses[];
    int numCourses = 0 ;



    public Lecturer(int identification_number, String name_surname) {
        this.identification_number = identification_number;
        this.name_surname = name_surname;
        ListOfCourses = new Lesson[10];
    }


    protected void addCourse(Lesson ls){
        if(numCourses >= 9){
            System.out.println("This lecturer Access to max course number");
           return;
        }
        ListOfCourses[numCourses] = ls;
        numCourses++;
    }

    public void showCourses(Lecturer lec){

        for(int i = 0; i <= numCourses; i++){
        System.out.println(lec.ListOfCourses[i]);
        }
    }

}
