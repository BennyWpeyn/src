interface Areas {
    public void howMany();
    public void size();

}

class Lecturer_Officies implements Areas{
    public void howMany(){
        System.out.println("There are 15 lecturer officies.");
    }
    public void size(){
        System.out.println("The average width of the officies is 20m2 ");
    }
}