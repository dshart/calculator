import java.util.Scanner;
public class App {
    static final Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        double num1 = getDouble("Enter number 1: ");
        double num2 = getDouble("Enter number 2: ");
        
        Calculator myCalc = new Calculator();

        System.out.println("Enter..."); 
        System.out.println("1 for Add");
        System.out.println("2 for Sub");
        System.out.println("3 for  Mul");
        System.out.println("4 for Div");
        
        int mathAction = myScanner.nextInt();
        whichOne(mathAction, myCalc, num1, num2);
               
        String myResponse = "x";
        while (!myResponse.equals("N")) {
            System.out.println("Do you want to do any more calculations?  Y or N" );
            myResponse = myScanner.next();
        
            if (myResponse.equals("Y"))  {
                num1 = getDouble("Enter number 1: ");
                num2 = getDouble("Enter number 2: ");
                System.out.println("1-add, 2-sub, 3-mul, 4-div");
                mathAction = myScanner.nextInt();
                whichOne(mathAction, myCalc, num1, num2);
            } else if (myResponse.equals("N")) {
                System.out.println("Goodbye");


            }
        }
    }

    private static String getString(String prompt) {
        System.out.print(prompt);
        String myString = myScanner.nextLine();
        return myString;
    }

    private static double getDouble(String prompt) {
        System.out.print(prompt);
        double myDouble = myScanner.nextDouble();
        return myDouble;
    }

    private static void whichOne(int mathAction, Calculator myCalc, double num1, double num2) {

        switch (mathAction) {
            case 1:
                double mySum = myCalc.add(num1, num2);
                System.out.printf("The sum of %f and %f is %f\n", num1, num2, mySum);
                break;
            case 2:
                double myDifference = myCalc.subtract(num1, num2);        
                System.out.printf("The difference of %f and %f is %f\n", num1, num2, myDifference);
                break;
            case 3:
                double myProduct = myCalc.multiply(num1, num2);
                System.out.printf("The product of %f and %f is %f\n", num1, num2, myProduct);
                break;
            case 4:
                double myQuotient = myCalc.divide(num1, num2);
                if (myQuotient != 0)
                System.out.printf("The quotient of %f and %f is %f\n", num1, num2, myQuotient);
                break;
        }
    }
}   
   


   




