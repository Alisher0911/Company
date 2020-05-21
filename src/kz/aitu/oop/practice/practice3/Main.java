package kz.aitu.oop.practice.practice3;

import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create new object Project
        Project project = new Project();

        try {
            //load the Driver class
            Class.forName("com.mysql.jdbc.Driver");
            //create the connection object
            Connection con  = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false", "root", "idealcode");
            //create the statement object
            Statement stmt = (Statement) con.createStatement();

            //SQL query to select all FrontEnd Developers from Database(table employee)
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM employee WHERE type_id = 1");
            while(rs1.next()) {
                //upcasting
                Developer d1 = new FrontEnd(rs1.getInt("id"), rs1.getString("firstName"), rs1.getString("lastName"), rs1.getDouble("payment"));
                //downcasting
                FrontEnd f = (FrontEnd) d1;
                //add new FrontEnd Developer to ArrayList FrontEnd Developers
                project.addFront(f);
                //add new FrontEnd Developer to one common ArrayList that consists of all employees
                project.addEmployee(f);
            }

            //SQL query to select all BackEnd Developers from Database(table employee)
            ResultSet rs2 = stmt.executeQuery("SELECT * FROM employee WHERE type_id = 2");
            while(rs2.next()) {
                //upcasting
                Developer d2 = new BackEnd(rs2.getInt("id"), rs2.getString("firstName"), rs2.getString("lastName"), rs2.getDouble("payment"));
                //downcasting
                BackEnd b = (BackEnd) d2;
                //add new BackEnd Developer to ArrayList BackEnd Developers
                project.addBack(b);
                //add new BackEnd Developer to one common ArrayList that consists of all employees
                project.addEmployee(b);
            }

            //SQL query to select all Product Managers from Database(table employee)
            ResultSet rs3 = stmt.executeQuery("SELECT * FROM employee WHERE type_id = 3");
            while(rs3.next()) {
                //upcasting
                Employee e1 = new ProductManager(rs3.getInt("id"), rs3.getString("firstName"), rs3.getString("lastName"), rs3.getDouble("payment"));
                //downcasting
                ProductManager p = (ProductManager) e1;
                //add new Product Manager to ArrayList Product Managers
                project.addManager(p);
                //add new Product Manager to one common ArrayList that consists of all employees
                project.addEmployee(p);
            }

            //SQL query to select all Testers from Database(table employee)
            ResultSet rs4 = stmt.executeQuery("SELECT * FROM employee WHERE type_id = 4");
            while(rs4.next()) {
                //upcasting
                Employee e2 = new Tester(rs4.getInt("id"), rs4.getString("firstName"), rs4.getString("lastName"), rs4.getDouble("payment"));
                //downcasting
                Tester t = (Tester) e2;
                //add new Tester to ArrayList Testers
                project.addTester(t);
                //add new Tester to one common ArrayList that consists of all employees
                project.addEmployee(t);
            }

            //close connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        //infinite loop
        while (true) {
            try {
                //Ask the user to choose a number to see the information
                System.out.println();
                System.out.println("Choose:");
                System.out.println("1. Show all employees");
                System.out.println("2. Show only Frontend Developers");
                System.out.println("3. Show only Backend Developers");
                System.out.println("4. Show only Product Managers");
                System.out.println("5. Show only Testers");
                System.out.println("6. Show total cost of the project");
                System.out.println("7. Exit");
                System.out.println("");
                System.out.print("> ");
                Scanner in = new Scanner(System.in);
                int choice = in.nextInt();
                switch (choice) {
                    case 1:     //if input is 1, then it shows all employees with their works
                        System.out.println(project);
                        project.implement();
                        break;
                    case 2:     //if input is 2, then it shows only Frontend Developers
                        System.out.println(project.showFrontEnd());
                        break;
                    case 3:     //if input is 3, then it shows only Backend Developers
                        System.out.println(project.showBackEnd());
                        break;
                    case 4:     //if input is 4, then it shows only Product Managers
                        System.out.println(project.showProductManager());
                        break;
                    case 5:     //if input is 5, then it shows only Testers
                        System.out.println(project.showTester());
                        break;
                    case 6:     //if input is 6, then it shows total cost for the project
                        System.out.println(project.CostOfProject());
                        break;
                    case 7:     //if input is 7, then the program will be executed
                        System.out.println("The program is finished!");
                        System.exit(0);
                    default:    //if input is another number, it will ask you to input an existing number
                        System.out.println("Incorrect choice, try again!");
                        continue;
                }
            } catch (InputMismatchException e) {         //Exception is occured when user inputs not a number
                System.out.println("Incorrect input, try again!");
                continue;
            }
        }
    }
}
