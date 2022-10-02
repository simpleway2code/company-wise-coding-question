// Given a string s and an integer k. You should construct k non-empty palindrome strings using all the characters in s.

// Return True if you can use all the characters in s to construct k palindrome strings or False otherwise.


public class Construct Strings {
    const canConstruct = function (s, k) {
        let oddCount = 0
        const map = {}
        for (const c of s) {
          map[c] = (map[c] || 0) + 1
          if (map[c] % 2 === 0) {
            oddCount--
          } else {
            oddCount++
          }
        }
        return oddCount <= k && s.length >= k
      }
      
}
