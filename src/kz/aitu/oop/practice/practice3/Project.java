package kz.aitu.oop.practice.practice3;

import java.util.ArrayList;

public class Project {
    public double priceOfProject;
    private ArrayList<FrontEnd> frontEndDevelopers;
    private ArrayList<BackEnd> backEndDevelopers;
    private ArrayList<ProductManager> managers;
    private ArrayList<Tester> testers;
    private ArrayList<Employee> employees;  //all employees

    //empty constructor
    public Project() {
        this.priceOfProject = 0;
        this.frontEndDevelopers = new ArrayList<FrontEnd>();
        this.backEndDevelopers = new ArrayList<BackEnd>();
        this.managers = new ArrayList<ProductManager>();
        this.testers = new ArrayList<Tester>();
        this.employees = new ArrayList<Employee>();
    }

    //constructor
    public Project(ArrayList<FrontEnd> frontEndDevelopers, ArrayList<BackEnd> backEndDevelopers, ArrayList<ProductManager> managers, ArrayList<Tester> testers, ArrayList<Employee> employees) {
        this.priceOfProject = 0;
        this.frontEndDevelopers = frontEndDevelopers;
        this.backEndDevelopers = backEndDevelopers;
        this.managers = managers;
        this.testers = testers;
        this.employees = employees;
    }

    //It shows what each employee does
    public void implement() {
        employees.forEach(emp -> emp.work());
    }

    //add FrontEnd Developer to ArrayList frontEndDevelopers
    public void addFront(FrontEnd frontEndDeveloper) {
        frontEndDevelopers.add(frontEndDeveloper);
    }

    //add BackEnd Developer to ArrayList backEndDevelopers
    public void addBack(BackEnd backEndDeveloper) {
        backEndDevelopers.add(backEndDeveloper);
    }

    //add Product Manager to ArrayList managers
    public void addManager(ProductManager manager) {
        managers.add(manager);
    }

    //add Tester to ArrayList testers
    public void addTester(Tester tester) { testers.add(tester); }

    //add all employees to one common ArrayList employees
    public void addEmployee(Employee employee) { employees.add(employee); }


    //calculates the sum of all employees, it is defined as total price of the project
    public String CostOfProject() {
        for (Employee i: employees){
            priceOfProject += i.getPayment();
        }
        return "Total cost of the project: " + priceOfProject;
    }


    //Show all Frontend Developers
    public String showFrontEnd() {
        String s = "";
        for (FrontEnd f: frontEndDevelopers) {
            s += f.toString() + "\n";
        }
        return s;
    }

    //Show all Backend Developers
    public String showBackEnd() {
        String s = "";
        for (BackEnd b: backEndDevelopers) {
            s += b.toString() + "\n";
        }
        return s;
    }

    //Show all Product Managers
    public String showProductManager() {
        String s = "";
        for (ProductManager p: managers) {
            s += p.toString() + "\n";
        }
        return s;
    }

    //Show all Testers
    public String showTester() {
        String s = "";
        for(Tester t: testers) {
            s += t.toString() + "\n";
        }
        return s;
    }

    //toString method
    @Override
    public String toString() {
        String s = "";    //empty String
        for (Employee i: employees) {   //foreach loop that reads all employees
            s += i.toString() + "\n";     //add info about employee to one String
        }
        return s;  //return String
    }
}
