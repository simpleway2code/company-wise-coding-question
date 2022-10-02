/*Check whether the number is Pallindrome or not. */

public class findPallindrome {

    // Function to check pallindrome
    public static int checkPallindrome(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum = (sum * 10) + rem;
            temp = temp / 10;
        }
        if (sum == n)
            return 1;
        else
            return 0;
    }

    // Main function
    public static void main(String[] args) {
        int n = 5665;

        // Function call
        int f = checkPallindrome(n);
        if (f == 1)
            System.out.println("The number is pallindrom");
        else
            System.out.println("The number is not pallindrom");
    }
}
