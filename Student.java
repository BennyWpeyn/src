public class Student {
    final int id_number;
    final String name_surname;
    final int year;
    Lesson lessons[];
    int numLessons = 0;

    public Student(int id, String name,int year){
        this.id_number = id;
        this.name_surname = name;
        this.year = year;

    }

    public void addLesson(Lesson ls){
        lessons[numLessons] = ls;
        numLessons++;
    }


    public void showLessons(){
        for(int i = 0; i < numLessons ; i++){
            System.out.println(lessons[i].course_cod);
        }


    }

   

}
