import java.util.Scanner;

/*
This program reverses a string
 */
public class ReverseString {
    public static void main(String[] args) {
        //instantiate scanner object
        Scanner input = new Scanner(System.in);

        //receive string from user
        System.out.print("Please enter a string: ");
        String str = input.nextLine();

        //Reverse
        System.out.print("\nThe Reversed string: ");
        for(int i = str.length()-1; i >= 0; i--){

            System.out.print( str.charAt(i));
        }
    }
}
