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
