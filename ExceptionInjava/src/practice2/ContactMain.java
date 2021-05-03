package practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ContactMain {

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        int t = 1;
        while (t == 1) {
            try {
                
           
            Scanner sc = new Scanner(System.in);
            System.out.println("age: ");
            int age = sc.nextInt();

            System.out.println("phone: 0034xxxxxxxxx");
            String code = "0034";
            System.out.print(code);
            String phone = code + sc.next();

            System.out.println("firstname");
            String firstName = sc.next();

            System.out.println("lastname");
            String lastName = sc.next();

            System.out.println("address");
            String address = sc.next();
            
            Contact contact=new Contact(firstName, lastName, address,
                    phone, age);
            contacts.add(contact);
            System.out.println("enter 1 to add more contacts otherwise stop it");
            t=sc.nextByte(); 
            
            } 
            catch (Exception e) {
                t = 1;
                System.out.println("restart program");
            }
        }
        
        System.out.println("detalis of contacts");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
        
        System.out.println("");
        System.out.println("-----------after sort depend on firstname then lastname");
        Collections.sort(contacts);
        
        for (Contact contactOrden : contacts) {
            System.out.println(contactOrden);
        }
    }

}
