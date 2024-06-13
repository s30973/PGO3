import java.util.ArrayList;

public class Tester extends Employee {
    ArrayList<String> test = new ArrayList<String>();

    public Tester(String firstName, String lastName, String address, String email, String pesel, int hired) {
        super(firstName, lastName, address, email, pesel, hired);
        test = new ArrayList<>();
    }

    public void addTestType(String type) {
        test.add(type);
        int salary = 300;
    }
    public int calculateSalary(int currentYear){
        int baseSalary = 3000;
        int yearsWorked = currentYear - rokZatrudnienia;

        return baseSalary+yearsWorked*1000 + test.size()*300;}
}
