import java.util.Scanner;
public class myCalculator {
    int num1;
    int num2;
    char response;
    int result;
    Scanner scan = new Scanner(System.in);

   public myCalculator(){
    }

    public void add(){
        System.out.println("Enter first number to add: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number to add: ");
        num2 = scan.nextInt();
        result = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " = " + result);
    }

    public void subtract(){
        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();
        result = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " = " + result);
    }

    public void multiply(){
        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();
        result = num1 * num2;
        System.out.println("The multiply of " + num1 + " and " + num2 + " = " + result);
    }

    public void divide(){
        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();
        result = num1 / num2;
        System.out.println("The quotient of " + num1 + " and " + num2 + " = " + result);
    }

    public void modulo(){
        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();
        result = num1 % num2;
        System.out.println("The modulos of " + num1 + " and " + num2 + " = " + result);
    }

    public void exitCalculator(){
        System.exit(0);
    }


    public static void main(String args[]){
       myCalculator jarvis = new myCalculator();
       Scanner scan = new Scanner(System.in);
       char response;
        do {

            System.out.println("Select an operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo Arithmetic");
            System.out.println("6. Exit");
            System.out.println("---------------------------------------------------------------");
            response = scan.next().charAt(0);

            switch(response){
                case '1':
                    jarvis.add();
                    break;

                case '2':
                    jarvis.subtract();
                    break;
                case '3':
                    jarvis.multiply();
                    break;
                case '4':
                    jarvis.divide();
                    break;
                case '5':
                    jarvis.modulo();
                    break;
                case '6':
                    jarvis.exitCalculator();
                    break;

                default:
                    System.out.println("You entered an invalid operation. Please try again!!!");
            }
        } while(response != 6);


    }


}
