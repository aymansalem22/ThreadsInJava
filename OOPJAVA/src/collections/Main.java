
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

 
    public static void main(String[] args) {
      int[] a = new int[100];
      List l1=new ArrayList();
      l1.add(3);
      l1.add(5);
      l1.add("ayman");
      l1.add(true);
      
      List<Integer> listInt=new ArrayList<>();
      listInt.add(3);
      listInt.add(5);
      System.out.println("*************************\n");
        for (Integer integer : listInt) {
            System.out.println(integer);
        }
        
        
        
      List<String> listStr=new ArrayList<>();
      listStr.add("ali");
      listStr.add("alian");
      listStr.add("ayman");
        System.out.println("*************************\n");
        for (String string : listStr) {
             System.out.println(string);
        }
      
        
        
        
        List<Person> persons=new ArrayList<>();
        persons.add(new Person("richard", 45));
        Person p1=new Person("omar",34);
        Person p2=new Person("alian",41);
        Person p3 = new Person("ali", 60);
        Person p4 = new Person("abrhim", 20);
        Person p5 = new Person("saeed", 42);
        Person p6 = new Person("ziad", 20);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        
        System.out.println(persons.get(0));
        
        for (Person person : persons) {
            System.out.println(person);
        }
        
        
        int sum=0;
        for (Person person : persons) {
            sum+=person.getAge();
        }
        System.out.println("the sum age of all persons are : "+sum);
       
        
        
        Person p7=new Person("mateo", 33);
        persons.set(1, p7);
        System.out.println("after replace p7 in p1 "+persons.get(1));
        
        
        System.out.println("***to know size of array persons");
        int size=0;
        for (int i = 0; i < persons.size(); i++) {
            size=i;
            System.out.println(i+" -->  "+persons.get(i));
        }
        System.out.println("size of the array is "+size);
        
        
        System.out.println("to remove for example p6");
        persons.remove(6);
          for (int i = 0; i < persons.size(); i++) {
            System.out.println(i+" -->  "+persons.get(i));
        }
          
          
          System.out.println("after overwrite equals to can delete when use newperson");
          persons.remove(new Person("ziad", 20));
              for (int i = 0; i < persons.size(); i++) {
            System.out.println(i+" -->  "+persons.get(i));
        }
        
              
          System.out.println("********");
        System.out.println("show the list and order it");    
              
        List<Integer> listint=new ArrayList<>();
        listint.add(80);
        listint.add(70);  
        listint.add(60);
        listint.add(600);
         listint.add(1200);
        listint.add(50);
        System.out.println("without orden \n"+listint);
        
        Collections.sort(listint);
        System.out.println("with orden \n"+listint);
         Collections.reverse(listint);
         System.out.println("with reverse \n"+listint);
        
         
         
         String [] names={"ahmad","omar","Ali","Mohamed"};
         List<String> nameList=new ArrayList<String>();
         for (String name : names) {
            nameList.add(name);
        }
         System.out.println("firstway to print");
         System.out.println(nameList);
         
          System.out.println("secondway to print");
          List<String> nameList2=Arrays.asList(names);
          System.out.println(nameList2);
          Collections.sort(nameList2);
          System.out.println("with sort : \n"+nameList2);
           System.out.println();
          System.out.println("****sort objects persons depend age and name******\n");
         // do overide compareto to can compare between persons depend age and name
           Collections.sort(persons);
            for (int i = 0; i < persons.size(); i++) {
            System.out.println(i + "-> " + persons.get(i));
        }
    }
    
}
