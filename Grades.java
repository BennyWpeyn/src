
public class Grades {
    // instance veriables
    private int midterm;
    private int finalexam;
    private double average;

    //adding grades
    public void addGrades(int midterm, int finalexam){
        this.midterm = midterm;
        this.finalexam = finalexam;
        calculateAverage();
    }

    //setting the midterm grade
    public void setMidterm(int midterm){
        this.midterm = midterm;
        calculateAverage();
    }
    //setting the final grade
    public void setFinalExam(int finalexam){
        this.finalexam = finalexam;
        calculateAverage();
    }
    
    private void calculateAverage(){
        average = midterm * 4 / 10 + finalexam * 6 / 10;
    }

    public double getAverage(){    // getter for average 
        return average;
    }
}
