package practise_Sheng_2;
import  lists.classes.Employee;
import java.util.ArrayList;
import java.util.List;

public class Java_2 {
    public static void main(String[] args) {
        System.out.println("Hello world!again");
        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("Sheng","zhao",777));
        employeeList.add(new Employee("leo","z",888));
        employeeList.forEach(employee ->{ System.out.println(employee);});
        System.out.println(employeeList);

        List<String> play = new ArrayList();
        play.add("first");
        play.add("second");
        play.add("last");
        System.out.println((play));

        String x = args[0];
        String y = args[1];
        String z = args[2];

        String sum = x + y + z;
        System.out.println((sum));
        //pring hello w ! now

    }

}
