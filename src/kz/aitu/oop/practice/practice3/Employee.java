package kz.aitu.oop.practice.practice3;

//abstract class
public abstract class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double payment;

    //Constructor
    public Employee(int id, String firstName, String lastName, double payment) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.payment = payment;
    }

    //abstract method
    public abstract void work();

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }


    //Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPayment() {
        return payment;
    }

    //toString method
    @Override
    public String toString() {
        return "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", payment=" + payment;
    }


}
