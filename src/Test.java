import java.awt.*;

public class Test {
    public static void main(String[] args) {
       /* Integer i = 1;
        System.out.printf(i.toString());
        System.out.println(i);

        Point point = new Point(2,5);
        System.out.println(point.toString());
        System.out.println(point);*/


        Employee [] employees = new Employee[4];
        employees [0] = new Employee("Tomek", 28, 5000);
        employees [1] = new Employee("Magda", 21, 4000);
        employees [2] = new Employee("Marek", 30, 5500);
        employees [3] = new Employee("Dorota", 25, 12000);

        for (Employee employee: employees){
            System.out.println(employee);
        }

        Product product = new Product("Mleko", 2.45);
        System.out.println(product);
    }
}
