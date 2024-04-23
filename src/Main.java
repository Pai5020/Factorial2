import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factorial f = new factorial();
        boolean validinput = false;
        while (!validinput) {
            try {
                System.out.println("Enter a non negative integer : ");
                int num = sc.nextInt();

                if (num < 0) {
                    throw new IllegalArgumentException("Negative number not used");
                } else {
                    int result = f.fact(num);
                    System.out.println("factorial is : " + result);
                    validinput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid integer");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    }
