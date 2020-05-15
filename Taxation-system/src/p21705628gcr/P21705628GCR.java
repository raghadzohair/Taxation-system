/*
 * Name; Raghad zohair ID: 1705628  CourseNumber: CPCS202 Secion: GCR .
 * Email: RYAHYA0010@stu.kau.edu.sa .
 *Assigned Date : Sunday 22/10/2017  Delivery Date and time:  Sunday 12/11/2017 at 11:00 PM .
 *Assignment # 2 (Taxation system) .
 */
package p21705628gcr;

/**
 *
 * @author Raghad
 */
import java.util.Scanner;
public class P21705628GCR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //declear a variable
        int con, n;
        long id;
        double salary, tax;
        //design
        System.out.println("||*************************************************||");
        System.out.println("\t Welcome to Taxation System");
        System.out.println("||*************************************************||");
        
        
        System.out.println("Please select the correct choice\n  1.America\n  2.Australia");
        System.out.print("Please Enter the choice ");
        int num1 = input.nextInt();
        System.out.println();
        System.out.println("-------------------------------");
        
        
        if(num1 !=1 && num1 !=2){
            System.out.println("It should be Either 1 or 2 :\nTry Again ");
            System.out.println("-------------------------------");
            System.out.print("Thanks for Using Taxation System");
            System.exit(0);
        }  
        else if(num1 == 1){
            System.out.print("Enter; Taxpayer Identification Number (ITIN): ");
            id = input.nextLong();
            String idNew =id+"";
            if(idNew.length() !=9){
                System.out.println("There must be 9 numbers.\nTry Again");
                System.out.println("-------------------------------");
                System.out.print("Thanks for Using Taxation System");
                System.exit(0); 
            }
            if((id/100000000) !=9){
                System.out.println("Number must  begin with 9.\nTry Again ");
                System.out.println("-------------------------------");
                System.out.print("Thanks for Using Taxation System");
                System.exit(0);
            }
            char s1 = idNew.charAt(3);
            char s2 = idNew.charAt(4);
            String snew = ""+s1+s2;
            //convert to int
            con = Integer.parseInt(snew);
            if(!(con>=70 && con<=88 || con>=90 && con<=92 || con>=94 && con<=99)){
                System.out.println("Incorrect Number Format\nTry Again");
                System.out.println("-------------------------------");
                System.out.print("Thanks for Using Taxation System");
                System.exit(0);
            }
            System.out.println("-------------------------------");
            System.out.print("Enter your Full Name: ");
            input.nextLine();
            String name = input.nextLine();
            n = name.indexOf(' ');
            String firstName = name.substring(0, n);
            String lastName = name.substring(n + 1);
            char f = firstName.charAt(0);
            char l = lastName.charAt(0);
            String fl = ""+f+l ;
            String twoLetter = fl.toUpperCase();

            System.out.println("Welcome your ID is "+twoLetter+idNew);
            
            System.out.print("Please, Enter your yearly Salary: ");
            salary = input.nextDouble();
            tax = 1.0;
            if ( salary>=0  && salary<=8700 )
                tax = (salary*10)/100.0 ;
            if ( salary>=8701 && salary<=35350 )
                tax = (salary*15)/100.0 ;
            if ( salary>=35351 && salary<=85650 )
                tax = (salary*25)/100.0 ;
            if ( salary>=85651 && salary<=178650 )
                tax = (salary*28)/100.0 ;
            if ( salary>=178651 && salary<=388350 )
                tax = (salary*33)/100.0 ;
            if ( 388351<=salary )
                tax = (salary*35)/100.0 ;
            
            System.out.printf("Dear Citizen !!Your Tax-Payable amount is %.1f$",tax);
            System.out.println();
            System.out.println("\t-------------------------------");
            System.out.print("Thanks for Using Taxation System");
            
        }
        else if(num1 == 2){
            System.out.print("Enter; Tax File Number(TFN): ");
            id = input.nextInt();
            String idNew =id+"";
            if(idNew.length() !=9){
                System.out.println("There must be 9 numbers.\nTry Again");
                System.out.println("-------------------------------");
                System.out.print("Thanks for Using Taxation System");
                System.exit(0); 
            }
            System.out.println("-------------------------------");
            System.out.print("Enter your Full Name: ");
            input.nextLine();
            String name = input.nextLine();
            n = name.indexOf(' ');
            String firstName = name.substring(0, n);
            String lastName = name.substring(n + 1);
            char f = firstName.charAt(0);
            char l = lastName.charAt(0);
            String fl = ""+f+l ;
            String twoLetter = fl.toUpperCase();


            System.out.println("Welcome your ID is "+twoLetter+idNew);
            
            System.out.print("Please, Enter your yearly Salary: ");
            salary = input.nextDouble();
            tax = 1.0;
            if ( salary>=0  && salary<=6000 )
                tax = (salary*0)/100.0 ;
            if ( salary>=6001 && salary<=37000 )
                tax = (salary*15)/100.0 ;
            if ( salary>=37000 && salary<=80000 )
                tax = (salary*30)/100.0 ;
            if ( salary>=85651 && salary<=178650 )
                tax = (salary*37)/100.0 ;
            if ( 180001<=salary )
                tax = (salary*45)/100.0 ;
            
            System.out.printf("Dear Citizen !!Your Tax-Payable amount is %.1f$",tax);
            System.out.println();
            System.out.println("\t-------------------------------");
            System.out.print("Thanks for Using Taxation System");

        }
    }
    
}
