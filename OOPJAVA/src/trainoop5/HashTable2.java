package trainoop5;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashTable2 {

    public static void main(String[] args) {
        Hashtable<Range, ArrayList<Employee>> table = new Hashtable<>();
        Range range2535 = new Range(25, 35);
        Range range3545 = new Range(35, 45);
        Range range4555 = new Range(45, 55);

        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(new Employee("alan", 25, 3200));
        list1.add(new Employee("alex", 26, 2344));
        list1.add(new Employee("tamer", 32, 4000));
        table.put(range2535, list1);

        ArrayList<Employee> list2 = new ArrayList<>();
        list2.add(new Employee("manuel", 36, 2222));
        list2.add(new Employee("alejandro", 38, 3333));
        list2.add(new Employee("sergio", 44, 4500));
        table.put(range3545, list2);

        Employee e1 = new Employee("fernando", 52, 3466);
        Employee e2 = new Employee("cristano", 47, 4900);
        Employee e3 = new Employee("Iker", 52, 5500);

        ArrayList<Employee> list3 = new ArrayList<>();
        list3.add(e1);
        list3.add(e2);
        list3.add(e3);
        table.put(range4555, list3);

        ArrayList<Employee> list = table.get(range2535);
        list.add(new Employee("Rodrigo", 28, 3400));

        System.out.println("*********search one range to access one employe in this age**********");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        Range searchRange = null;
        for (Range key : table.keySet()) {
            if (key.inRange(age)) {
                searchRange = key;
                break;
            }
        }

        ArrayList<Employee> searchList = table.get(searchRange);
        System.out.println("*********search one range to access one employe in this age**********");
        System.out.println(searchList);
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("*****display all the lists key with value************");
        for (Map.Entry<Range, ArrayList<Employee>> entry : table.entrySet()) {
            Range key = entry.getKey();
            ArrayList<Employee> value = entry.getValue();
            System.out.println("Key: " + key + " --> " + value);
            System.out.println("-----------------");
        }

        System.out.println("*****display all the list key ************");
        for (Range key : table.keySet()) {
            List<Range> keys = new ArrayList<>();
            System.out.println("key: " + key);
            keys.add(key);
        }

        System.out.println("**************");
        System.out.println("*********search one age after i have the range confirm in last search **********");
        ArrayList<Employee> searchList1 = table.get(searchRange);
        System.out.println("Search in : " + searchList1.size());
        Employee e = null;
        for (Employee employee : searchList1) {
            if (age == employee.getAge()) {
                e = employee;
            }
        }
        System.out.println(e);

    }
}
