public class student {
    int id_number;
    String name_surname;
    int year;
    String graduation;
    lesson lessons;
    lesson x;
    int lesson_sayi = 0;

    public student(int id, String name, lesson ls){
        this.id_number = id;
        this.name_surname = name;
        x =ls ;
       // this.lessons[lesson_sayi].course_cod = ls.course_cod;
        //this.lessons[lesson_sayi].course_name = ls.course_name;
        //this.lessons[lesson_sayi].credit= ls.credit;
        lesson_sayi++;
        

    }

    


}
