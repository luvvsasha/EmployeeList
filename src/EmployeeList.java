import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.List;

public class EmployeeList {

    public static void main(String[] args) {
        List<String> employeeList = new ArrayList<>();


        try (BufferedReader reader = new BufferedReader(new FileReader("list"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employeeList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }


        System.out.println("Size of the collection: " + employeeList.size());
        System.out.println();


        System.out.println("Printing the collection using a standard for loop:");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
        System.out.println();


        System.out.println("Printing the collection using the for-each loop:");
        for (String employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println();


        System.out.println("Printing the collection using the Iterator interface:");
        Iterator<String> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
