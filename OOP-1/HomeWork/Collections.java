package HomeWork;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> names = getEmployees();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            numbers.add(i);
        }
        ArrayList<String> info = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            info.add(numbers.get(i) + " - " + names.get(i));
        }
        for (String s : info) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> getEmployees() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Emma");
        employees.add("Bob");
        employees.add("Sofa");
        employees.add("Sergey");
        employees.add("Mark");
        return employees;
    }

}
