public class swapLetters{

//This swaps every 2 letters in a given string
//

public static String codeString(String input) {
   String firstLetter = "";
   String secoundLetter = "";
   String result = "";
   for(int i = 0; i < input.length()-1; i+=2){

      firstLetter = input.substring(i, i+1);
      secoundLetter = input.substring(i+1, i+2);
      result = result + secoundLetter + firstLetter;

   }

   if(input.length() % 2 == 1)
      result += input.substring(input.length()-1, input.length());

   return result;
}


//Changes every two indexes from a given index
public static String codeString(String input, int n) {
        if (n <= input.length() / 2) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length() - n + 1; i = i + n) {
                result.append(new StringBuilder(input.substring(i, i + n)).reverse());
            }
            return result.toString();
        } else {
            return input;
        }
    }
    
public static void main(String[] args) {
        System.out.println(codeString("abllte"));
        System.out.println(codeString("evol"));
        System.out.println(codeString("abllte", 1));
        System.out.println(codeString("abllte", 2));
        System.out.println(codeString("abllte", 3));
        System.out.println(codeString("abllte", 4));
}
}
