import java.util.*;

public class MaximumTimeFromGivenArray {

    static HashMap<Integer, Integer> getFrequencyMap(int arr[])
    {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
            else {
                hashMap.put(arr[i], 1);
            }
        }
        return hashMap;
    }
 
    // Function that returns true if the passed digit is present
    // in the map after decrementing it's frequency by 1
    static boolean hasDigit(HashMap<Integer, Integer> hashMap, int digit)
    {
 
        // If map contains the digit
        if (hashMap.containsKey(digit) && hashMap.get(digit) > 0) {
 
            // Decrement the frequency of the digit by 1
            hashMap.put(digit, hashMap.get(digit) - 1);
 
            // True here indicates that the digit was found in the map
            return true;
        }
 
        // Digit not found
        return false;
    }
 
    // Function to return the maximum possible time in 24-Hours format
    static String getMaxTime(int arr[])
    {
        HashMap<Integer, Integer> hashMap = getFrequencyMap(arr);
        int i;
        boolean flag;
        String time = "";
 
        flag = false;
 
        // First digit of hours can be from the range [0, 2]
        for (i = 2; i >= 0; i--) {
            if (hasDigit(hashMap, i)) {
                flag = true;
                time += i;
                break;
            }
        }
 
        // If no valid digit found
        if (!flag) {
            return "-1";
        }
 
        flag = false;
 
        // If first digit of hours was chosen as 2 then
        // the second digit of hours can be
        // from the range [0, 3]
        if (time.charAt(0) == '2') {
            for (i = 3; i >= 0; i--) {
                if (hasDigit(hashMap, i)) {
                    flag = true;
                    time += i;
                    break;
                }
            }
        }
 
        // Else it can be from the range [0, 9]
        else {
            for (i = 9; i >= 0; i--) {
                if (hasDigit(hashMap, i)) {
                    flag = true;
                    time += i;
                    break;
                }
            }
        }
        if (!flag) {
            return "-1";
        }
 
        // Hours and minutes separator
        time += ":";
 
        flag = false;
 
        // First digit of minutes can be from the range [0, 5]
        for (i = 5; i >= 0; i--) {
            if (hasDigit(hashMap, i)) {
                flag = true;
                time += i;
                break;
            }
        }
        if (!flag) {
            return "-1";
        }
 
        flag = false;
 
        // Second digit of minutes can be from the range [0, 9]
        for (i = 9; i >= 0; i--) {
            if (hasDigit(hashMap, i)) {
                flag = true;
                time += i;
                break;
            }
        }
        if (!flag) {
            return "-1";
        }
 
        // Return the maximum possible time
        return time;
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 0, 0, 0, 9 };
        System.out.println(getMaxTime(arr));
    }
}
