import java.util.Scanner;

public class Palindrome_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take Input String from Users.
        System.out.println("Enter Your Any String: ");
        String input = scanner.nextLine();

        //Call the isPalindrome function to Check Here the string is Palindrome or not.
        boolean isPalindrome = isPalindrome(input);

        //if it is palindrome then display result as palindrome.
        if (isPalindrome){
            System.out.println("\"" +input+ "\" is a palindrome");

        }else { // Otherwise display results as not palindrome.
            System.out.println("\"" +input+ "\" is not a Palindrome.");
        }

        scanner.close();


    }

    //This is the method of check is the string is Palindrome or not.
    public static boolean isPalindrome(String str){

        //Convert the input string to the lower case for case-insensitive and remove all the non-alphabetic word from the input string.
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        //Set the two pointers for starting and ending of the string.
        int i = 0;
        int j = str.length()-1;

        // Iterated the string from both ends towards the middle
        while (i<j){

            // if characters current position don't match then it is not palindrome.
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            // change the pointers towards the middle.
            i++;
            j--;
        }

        //if this while loop is complete without return false then it is palindrome.
        return true;

    }


}
