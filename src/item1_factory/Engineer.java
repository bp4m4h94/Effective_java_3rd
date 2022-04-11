package item1_factory;

public class Engineer extends Employee {
    public static Engineer newEngineer() {
        return new Engineer();
    }

    @Override
    public String print() {
        return "Engineer";
    }
}
