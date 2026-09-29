import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);

    public static int menuList(){
        
        int choice;

        System.out.println("0. EXIT");
        System.out.println("1. FIXEDSTACK");
        System.out.println("2. Growable stack");
        System.out.println("enter choice");
        choice = sc.nextInt();
        
        return choice;

        

    }

    public static int menuList2(){
    
        int choice;

        System.out.println("0 return to mainmenu");
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. peek");
        System.out.println("return to main menu");
        choice = sc.nextInt();
      
        return choice;
    }
    public static void main(String[] args) {
       
        int choice = menuList();
        
        CustomStack stack = new CustomStack();
        CustomGrowableStack stack1 = new CustomGrowableStack();
         
        while(true){
            int choice2 = menuList2();
            if(choice2 == 0){
                choice = menuList();
                if(choice == 0){
                    break;
                }
            }
        try{
       
            switch (choice2) {
             
            case 1 :
                System.out.println("Enter id");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter name");
                String name = sc.nextLine();
                Employee obj = new Employee(id,name);

                if(choice == 1){
                    
                    stack.push(obj);
                }else{
                    
                    stack1.push(obj);
                }
                break;
            
            case 2 :
                if(choice == 1){
                    stack.pop();

                }else{
                    stack1.pop();
                }
                break;
            case 3 :
                if(choice == 1){
                    stack.peek();

                }else{
                    stack1.peek();
                }
                break;

                
            default : 
                System.out.println("Enter valid choice");

                
        }
        }
        catch (StackIsFullException e) {
            e.display();
        }
        catch (StackIsEmptyException e) {
           e.display();
        }
        
    }
         
    }

        
       


}

