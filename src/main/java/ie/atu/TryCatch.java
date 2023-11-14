package ie.atu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
            System.out.println("Please enter a number between 0 - 9");
            Scanner myscan = new Scanner(System.in);

                String input = myscan.nextLine();

                int myNum = Integer.parseInt(input);


                if (myNum >= 0 && myNum <= 9){
                    System.out.println("You entered" + myNum);
                }
                else {
                    System.out.println("Not a valid munber");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Wrong");
            }

    }
}
