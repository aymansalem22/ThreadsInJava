
package trainoop5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;


public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<String,Employee> table1=new Hashtable<>();
        table1.put("company1",new Employee("Ana", 34, 1440) );
        table1.put("company2",new Employee("Sara", 31, 1240) );
        Employee e1=new Employee("Manuel", 22,1500);
        Employee e2=new Employee("alejandeo", 22,1500);
        table1.put("company3", e1);
       table1.put("company4", e2);
        System.out.println("----default way to get by key----");
        System.out.println(table1.get("company3"));
        System.out.println("");
         System.out.println("******* with for MAP****");
        for (Map.Entry<String, Employee> entry : table1.entrySet()) {
            String key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
            System.out.println("********************");
        }
        
        
        
        Hashtable<String,List<Employee>> table2=new Hashtable<>();
        table2.put("branch1",Arrays.asList(new Employee("sara", 33, 2222)));
         System.out.println("******with hashtable as arraylist of clasee emplyoee******");
         System.out.println(table2.get("branch1"));
         System.out.println("-------------");
         
         
       
         Hashtable<String,ArrayList<Employee>> table3=new Hashtable<>();
         ArrayList<Employee> list1=new ArrayList<>();
         ArrayList<Employee> list2=new ArrayList<>();
          ArrayList<Employee> list3=new ArrayList<>();
         list1.add(new Employee("alian", 31, 3333));
         list2.add(new Employee("alaa", 17, 1222));
         list3.add(new Employee("hassan", 18, 1274));
         table3.put("branch2",list1);
         table3.put("branch3",list2);
         table3.put("branch4",list3);
         
         
         ArrayList<Employee> list4=table3.get("branch2");
         list4.add(new Employee("issa", 44, 3422));
         list4.add(new Employee("ibrahim", 42,2444));
         list4.add(new Employee("ashraf", 17,2211));
         System.out.println("*********branch 2 with 4 employees********** ");
         System.out.println();
         System.out.println(table3.get("branch2"));
         System.out.println();
         
         
         System.out.println("**********to show all with keys by for Map***********");
        for (Map.Entry<String, ArrayList<Employee>> entry : table3.entrySet()) {
            String key = entry.getKey();
            ArrayList<Employee> value = entry.getValue();
            System.out.println("");
            System.out.println("Key: "+key+"--> \n"+value);
            System.out.println("--------------");
            
            
           
            
        }
        
        System.out.println();
         System.out.println("show only the keys for one table");
        for (String  key : table3.keySet()) {
            System.out.println("key: "+key);
        }
        
        
         System.out.println();
         System.out.println("show only the values for one table");
         int count=0;
        for (ArrayList<Employee> value : table3.values()) {
           count+=value.size();
            System.out.println(value);
        }
       
        System.out.println("number of employee in this table: "+count);
    }
 
}
