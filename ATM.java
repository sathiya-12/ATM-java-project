import java.util.Scanner;
public class ATM{
    public static void main(String[]args){
        int pin=123;
        int balance=10000;
        int Addamount=0;
        int Takeamount=0;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter your pin number :");
        int password=sc.nextInt();
        if (password==pin){
            System.out.println("Enter your name:");
            name=sc.nextLine();
            System.out.println(" Wellcome"+ name);
            while (true){
                System.out.println("Press 1 to check your balance ");
                System.out.println("Press 2 to check Add amount");
                System.out.println(" Press 3 to check Take amount");
                System.out.println(" Press 4 to check take resipt");
                System.out.println(" Press 5 to exit ");
                int opt=sc.nextInt();
                switch(opt){
                    case 1:
                        System.out.println(" Your current balance is :"+balance);
                        break;
                    case 2:
                        System.out.println("How much amount did you want to add to your acount:");
                        Addamount=sc.nextInt();
                        System.out.println("Sucessfully credited");
                        balance= balance + Addamount;
                        break;
                    case 3:
                        System.out.println("How much amount did you want to take :");
                        Takeamount=sc.nextInt();
                        if(Takeamount>balance){
                            System.out.println(" The Amount is infficient");
                            System.out.println("Take Amount less than balance");
                    }
                        else{
                            System.out.println(" The amount taken sucessfully");
                            balance=balance-Takeamount;
                            break;
                    }   
                    case 4:
                        System.out.println("Wellcome to all in one mini ATM");
                        System.out.println("Available Balance is "+balance);
                        System.out.println("Amount depsite is "+Addamount);
                        System.out.println("Amount Taken is "+Takeamount);
                        System.out.println("Thanks for coming");
                        break;
                    case 5:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println(" Invalid ");    
                }
                if (opt==5){
                    System.out.println("THank you !");
                }
            }
        }
                else{
                    System.out.println(" Wrong pin number !");
        }
    }
}