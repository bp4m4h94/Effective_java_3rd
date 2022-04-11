package item1_factory;

public class Accountant extends Employee {
    public static Accountant newAccountant() {
        return new Accountant();
    }

    @Override
    public String print() {
        return "Accountant";
    }
}
