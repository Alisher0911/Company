package kz.aitu.oop.practice.practice3;

public class BackEnd extends Developer implements DeveloperInterface {
    //the superclass constructor with a matching parameter list is called
    public BackEnd(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    //Override abstract method
    @Override
    public void work(){
        develop();
    }

    //Override Interface method
    @Override
    public void develop() { writeServerSide(); }

    //What Backend Developers do
    public void writeServerSide() {
        System.out.println(getFirstName() + " " + getLastName() + " is responsible for the server side of the site");
    }

    //Overrides toString method, and calls superclass method
    @Override
    public String toString() {
        return "Backend Developer {" + super.toString() + '}';
    }
}
