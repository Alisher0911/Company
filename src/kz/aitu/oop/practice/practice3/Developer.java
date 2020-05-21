package kz.aitu.oop.practice.practice3;

public abstract class Developer extends Employee {
    //every Developer has the position: Junior, Middle, Senior
    private String position;

    //the superclass constructor with a matching parameter list is called, has its own attribute
    public Developer(int id, String firstName, String lastName, double payment) {
        super(id, firstName, lastName, payment);
        if (this.getPayment() <= 100000) {
            this.position = "Junior";
        } else if (this.getPayment() <= 150000) {
            this.position = "Middle";
        } else {
            this.position = "Senior";
        }
    }

    //abstract method
    public abstract void work();

    //Overrides toString method, and calls superclass method, and has its own attribute
    @Override
    public String toString() {
        return super.toString() +
                ", position='" + position + '\'';
    }
}