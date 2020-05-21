package kz.aitu.oop.practice.practice3;

public class Tester extends Employee {
    //the superclass constructor with a matching parameter list is called
    public Tester(int id, String firstName, String lastName, double payment) {
        super(id, firstName, lastName, payment);
    }

    //Override abstract method
    @Override
    public void work() {
        tests();
    }

    //What Testers do
    public void tests() {
        System.out.println(getFirstName() + " " + getLastName() + " puts applications through the wringer to root out bugs, poor performance and funky interface issues");
    }

    //Overrides toString method, and calls superclass method
    @Override
    public String toString() {
        return "Tester {" + super.toString() + "}";
    }
}
