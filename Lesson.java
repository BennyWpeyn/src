public class Lesson extends Grades {
    int course_cod;
    String course_name;
    int credit;
    String course_location;
    String lecturer_info;
    Student students[];
    int population ;                            // the number of the student who takes the lessons;
    Grades grade;
    
    public Lesson(int course_cod, String course_name, int credit){
        this.course_cod = course_cod;
        this.course_name = course_name;
        this.credit = credit;
        grade = new Grades();
    }


}
