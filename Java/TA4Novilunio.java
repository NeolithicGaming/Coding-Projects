import java.util.Scanner;

public class TA4Novilunio {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double useraccbalance;
    double userinterestrate;
    double yearlycompundbalance;
    double monthlycompoundbalance;
    double dailycompoundbalance;
    double monthlyinterestrate;
    double dailyinterestrate;
    int totalmonthyears=120;
    int totaldayyears=3650;
    int totalyears = 10;
    char yesorno = 'Y';

    while (yesorno =='Y') 
    {   
    System.out.print("Enter the bank account balance: ");
    useraccbalance = input.nextDouble();
    input.nextLine();
    System.out.print("Enter the interest rate (%): ");
    userinterestrate = input.nextDouble();
    input.nextLine();
    double interestrate= userinterestrate/100;

    yearlycompundbalance = useraccbalance;
    for(int x = 0; x < totalyears; x++)
    {
        yearlycompundbalance = yearlycompundbalance+(yearlycompundbalance*interestrate);
    }

    monthlycompoundbalance = useraccbalance;
    monthlyinterestrate = interestrate / 12;
    for(int y = 0; y < totalmonthyears; y++)
    {
        monthlycompoundbalance = monthlycompoundbalance+(monthlycompoundbalance*monthlyinterestrate);
    } 
   
    dailycompoundbalance = useraccbalance;
    dailyinterestrate = interestrate / 365;
    for(int z=0; z < totaldayyears; z++)
    {
        dailycompoundbalance = dailycompoundbalance+(dailycompoundbalance*dailyinterestrate);
    }
    System.out.println("Your account balance after 10 years with yearly compounding interest is: " +yearlycompundbalance);
    System.out.println("Your account balance after 10 years with monthly compounding interest is: " +monthlycompoundbalance);
    System.out.println("Your account balance after 10 years with daily compounding interest is: " +dailycompoundbalance);

    System.out.print("Do you want to continue using the program and do another calculation? (Y/N): ");
    String answer = input.nextLine();
    System.out.println("");
    if (answer == "Y") 
    {
        yesorno= 'Y';
    }
    if (answer == "y")
    {
        yesorno= 'Y';
    }
    if (answer == "N") 
    {
        yesorno= 'n';
    }
    if (answer == "n") 
    {
        yesorno= 'n';
    }

    } //end of while bracket
   } //end of public static void bracket
} //end of public class bracket