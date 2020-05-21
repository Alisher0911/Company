package kz.aitu.oop.practice.practice3;

public class FrontEnd extends Developer implements DeveloperInterface{
    //the superclass constructor with a matching parameter list is called
    public FrontEnd(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    //Override abstract method
    @Override
    public void work(){
        develop();
    }

    //Override Interface method
    @Override
    public void develop() {
        writeLayout();
    }

    //What Frontend Developers do
    public void writeLayout() {
        System.out.println(getFirstName() + " " + getLastName() + " is responsible for the site layout");
    }

    //Overrides toString method, and calls superclass method
    @Override
    public String toString() {
        return "Frontend Developer {" + super.toString() + '}';
    }
}
