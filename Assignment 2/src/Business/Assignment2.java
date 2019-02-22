
package Business;
import java.util.*;

public class Assignment2 {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product product=new Product();
        Supplier supplier=new Supplier();
        int choice;
        boolean bool;
        do{
            
        //Main Display Menu     
            
        System.out.println(" ");    
        System.out.println("Please enter your choice:");
        System.out.println("1: Create Product");
        System.out.println("2: View Product");
        System.out.println("3: Update Product");
        System.out.println("4: Quit");
        System.out.println(" ");
        
        //choice=sc.nextLine().charAt(0);
        choice=sc.nextInt();
          //     if (choice>='a'||choice<='z'||choice>='A'||choice<='Z'){
        //System.out.println("invalid choice");
        //}
        //else{        
        //}
        //Show Create
        switch(choice){
            case 1: Scanner sc1=new Scanner(System.in);
                    System.out.println("Create your Product here");
                    System.out.println("Enter Name");
                    product.setName(sc1.next());
                    bool=false;
                    
                   while(bool!=true)
                   {
                       System.out.println("Enter Price");
                       
                    try{
                    product.setPrice(sc1.nextFloat());
                    bool=true;
                    }
                    
                    catch(Exception e){
                        System.out.println("Error: The value entered is not numeric");
                        sc1.nextLine();
                    }
                   }
                   
                   bool=false;
                   
                   while(bool!=true)
                   {
                       System.out.println("Enter Avaiability Number");
                       
                    try{
                    product.setAvailNum(sc1.nextInt());
                    bool=true;
                    }
                    
                    catch(Exception e){
                     System.out.println("Error: The value entered is not numeric");
                     sc1.nextLine();
                     }
                   }
                    System.out.println("Enter Description");
                    product.setDescription(sc1.next());
                    
                    System.out.println("Enter Supplier Name");
                    supplier.setSName(sc1.next());
                    
                    System.out.println("Enter Supplier Address");
                    supplier.setSLocation(sc1.next()); 
                    
                break;
                //Show View 
            case 2: System.out.println("View Your Product here");
                    System.out.println("Name is:"+product.getName());
                    System.out.println("Price is:"+product.getPrice());
                    System.out.println("Availability Number is:"+product.getAvailNum());
                    System.out.println("Description is:"+product.getDescription());
                    System.out.println("Supplier Name is:"+supplier.getSName());
                    System.out.println("Supplier Location is:"+supplier.getSLocation());
                break;
                //Show Update
            case 3: Scanner sc2=new Scanner(System.in);
            
                    System.out.println("Update your Product here");
                    System.out.println("Current Name is "+product.getName());
                    System.out.println("Enter new Name");
                    product.setName(sc2.next());
                    
                    bool=false;
                    
                    System.out.println("Current Price is "+product.getPrice());
                    
                    while(bool!=true)
                   {
                       System.out.println("Enter new Price");
                       
                    try{
                    product.setPrice(sc2.nextFloat());
                    bool=true;
                    }
                    
                    catch(Exception e){
                        System.out.println("Error: The value entered is not numeric");
                        sc2.nextLine();
                    }
                    }
                     
                    bool=false;
                    
                    System.out.println("Current Availability Number is "+product.getAvailNum());
                    
                    while(bool!=true)
                    {
                        System.out.println("Enter new Avaiability Number");
                        
                    try{
                    product.setAvailNum(sc2.nextInt());
                    bool=true;
                    }
                    
                    catch(Exception e){
                     System.out.println("Error: The value entered is not numeric");
                     sc2.nextLine();
                     }
                    }
                    
                    System.out.println("Current Description is "+product.getDescription());
                    System.out.println("Enter new Description");
                    product.setDescription(sc2.next());
                    
                    System.out.println("Current Supplier Name is "+supplier.getSName());
                    System.out.println("Enter new Supplier Name");
                    supplier.setSName(sc2.next());
                    
                    System.out.println("Current Supplier Location is "+supplier.getSLocation());
                    System.out.println("Enter new Supplier Address");
                    supplier.setSLocation(sc2.next()); 
                break;
                //Quit
            case 4: System.out.println("Bye!");
                break;    
            default: System.out.println("Invalid choice!");
                break;
                }//switch case
   
            } while (choice!= 4);//while
        }//main
}//class
