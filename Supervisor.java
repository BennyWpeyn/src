public class Supervisor extends Lecturer{

    
    // this is for the warning that the programme gave when i dont write constructer
    public Supervisor(int identification_number, String name_surname) {
        super(identification_number, name_surname);
        
    }// i dont know why

    protected void addCourse(Lesson ls) {
        
        super.addCourse(ls);
    }
    
    


}
