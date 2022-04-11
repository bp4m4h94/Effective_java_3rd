package item1_factory;

public class Employee {
    public static Employee newEmployee() {
        return new Employee();
    }


    public String print() {
        return "Employee";
    }

}
