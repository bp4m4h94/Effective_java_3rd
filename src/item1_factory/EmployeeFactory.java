package item1_factory;

public class EmployeeFactory {
    public static Employee create(String type) {
        switch (type) {
            case "admin": return new Admin();
            case "engineer": return new Engineer();
            case "accountant": return new Accountant();
            default:
                throw new RuntimeException("Wrong employee type");
        }
    }
}
