import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // initialized a Scanner class object
        Scanner s = new Scanner(System.in);

        // variables to do th comparison
        double min = 1E12, input;

        // for to iterate
        for(int i = 0; i < 10; i++){
            System.out.println("Enter a number : ");
            input  = s.nextDouble();
            if(input <= min){
                min = input;
            }
        }

        // if the number is greater than 10 print a message, but if the number is less than 10 print other message,
        // finally, if the result is equal to ten, print only the min
        if(min < 10){
            System.out.println("Number is less than 10! : " + min);
        } else if (min > 10){
            System.out.println("Number is greater than 10! : " + min);
        } else {
            System.out.println("Number is : " + min);
        }


    }
}