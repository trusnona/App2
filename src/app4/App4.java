/*login*/
package app4;

import java.util.*;

public class App4 {


    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("user : ");
        String name = scanner.nextLine();
        System.out.print("password : ");
        String pass = scanner.next();
        
        if(name.equals("admin") && pass.equals("admin1234")) {
            System.out.println("Complete");
        }else{
            System.out.println("Wrong");
        }
        
    }
     
}
    
   
