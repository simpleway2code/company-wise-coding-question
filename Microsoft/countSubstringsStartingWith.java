/*   So the input "Miss Mississippi" will break down to the following substrings:
*    M | Mi | Mis | Miss | Miss | Miss M | Miss Mi | Miss Mis | etc....
*    It will count if "is" is in each substring
*/

public class McountSubstringsStartingWith {
    public static int countSubstringsStartingWith(String sentence, String target) {
        int count = 0;
        int targetLength = target.length();
        int sentenceLength = sentence.length();
        if (targetLength > sentenceLength) {
            return count;
        }
        int index = sentence.indexOf(target);
        while (index >= 0) {
            count += sentenceLength - (index + targetLength - 1);
            index = sentence.indexOf(target, index + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        //One of the tests
        System.out.println(countSubstringsStartingWith("Miss Mississippi", "si"));
    }
}
