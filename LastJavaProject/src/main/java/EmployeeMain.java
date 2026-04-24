import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    static void main() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Chief());
        employees.add(new Programmer());
        for(Employee s:employees){
            s.work();
        }
    }
}
