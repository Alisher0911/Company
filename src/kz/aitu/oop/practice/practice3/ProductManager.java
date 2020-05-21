package kz.aitu.oop.practice.practice3;

public class ProductManager extends Employee {
    //the superclass constructor with a matching parameter list is called
    public ProductManager(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    //Override abstract method
    @Override
    public void work(){
        manage();
    }

    //What Product Managers do
    public void manage() {
        System.out.println(getFirstName() + " " + getLastName() + " should understand the project lifecycle with its stages and key events, such as: target audience search, launch, market recognition, and falling demand.");
    }

    //Overrides toString method, and calls superclass method
    @Override
    public String toString() {
        return "Product Manager {" + super.toString() + "}";
    }
}
