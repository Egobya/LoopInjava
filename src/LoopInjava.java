import java.util.Scanner;
public class LoopInjava
{
    public static void main(String args[])
    {
        System.out.println("Calling the 'displayDetails' method\n");

        displayDetails();
    }

    public static void displayDetails()
    {
        int Customer_Id;
        String Customer_Name, TaxCode;
        double SalesAmount, TotalAmount, TaxAmount = 0.00;
        boolean record = false;
        String recordAgain;
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter Customer's ID: ");
        Customer_Id = keyboard.nextInt();

        System.out.println("Enter Customer's Name: ");
        keyboard = new Scanner(System.in);

        Customer_Name = keyboard.nextLine();


        System.out.println("Enter Customer's TaxCode: ");
        keyboard = new Scanner(System.in);
        TaxCode = keyboard.nextLine();


        System.out.println("Enter Customer's SalesAmount: ");
        keyboard = new Scanner(System.in);
        SalesAmount = keyboard.nextDouble();

        if (TaxCode.equalsIgnoreCase("NRM")) {
            TaxAmount = 0.06;
        } else if (TaxCode.equalsIgnoreCase("NPF")) {
            TaxAmount = 0.00;
        } else if (TaxCode.equalsIgnoreCase("BIZ")) {
            TaxAmount = 0.045;
        }

        TotalAmount = SalesAmount + SalesAmount * TaxAmount;

        do {
            System.out.println("Enter Customer's ID: ");
            Customer_Id = keyboard.nextInt();

            System.out.println("Enter Customer's Name: ");
            keyboard = new Scanner(System.in);

            Customer_Name = keyboard.nextLine();


            System.out.println("Enter Customer's TaxCode: ");
            keyboard = new Scanner(System.in);
            TaxCode = keyboard.nextLine();


            System.out.println("Enter Customer's SalesAmount: ");
            keyboard = new Scanner(System.in);
            SalesAmount = keyboard.nextDouble();
            System.out.println("Enter Customer's TaxCode:(BIZ,NPF,NRM) ");
            keyboard = new Scanner(System.in);
            TaxCode = keyboard.nextLine();

            if (TaxCode.equalsIgnoreCase("NRM") || TaxCode.equalsIgnoreCase("NPF") || TaxCode.equalsIgnoreCase(
                    "BIZ")) {

                if (TaxCode.equalsIgnoreCase("NRM")) {
                    TaxAmount = 0.06;
                } else if (TaxCode.equalsIgnoreCase("NPF")) {
                    TaxAmount = 0.00;
                } else if (TaxCode.equalsIgnoreCase("BIZ")) {
                    TaxAmount = 0.045;
                }


            } else {
                System.out.println("Please Enter Customer's TaxCode Correct next time!:(BIZ,NPF,NRM)  ");
                System.exit(0);

            }

            System.out.println("Enter Customer's SalesAmount: ");
            keyboard = new Scanner(System.in);
            SalesAmount = keyboard.nextDouble();


        }

        System.out.println("Do you wany to enter another record?(Y/N)");
        keyboard = new Scanner(System.in);
        if (recordAgain.equals("Y"))
            record = true;

        if (recordAgain.equals("N")) {
            record = false;

            {

                System.out.println("Customer ID :" + Customer_Id);
                System.out.println("Customers Name:" + Customer_Name);
                System.out.println("Sales Amount:" + SalesAmount);
                System.out.println("TaxCode:" + TaxCode);
                System.out.println("TaxAmount:" + TaxAmount);
                System.out.println("Total total Amount Due:" + TotalAmount);
            }


            System.out.println("Do you want to Enter  another Record ?(yes/No)");
            }

        while (keyboard.next().equalsIgnoreCase("Yes"));


    }


}


