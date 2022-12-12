public class Student {
    final int id_number;
    final String name_surname;
    final int year;
    String graduation;
    Lesson lessons[];
    int numLessons = 0;

    public Student(int id, String name,int year,String graduation){
        this.id_number = id;
        this.name_surname = name;
        this.year = year;
        setGraduaiton(graduation);

    }

    

   
public void setGraduaiton(String graduation){
    this.graduation=graduation;
}
public String getGraduation(){
    return graduation;
}




    public void addLesson(){
        



    }



}
