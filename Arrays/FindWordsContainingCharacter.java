class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> solution = new ArrayList<>();
        int length = words.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    solution.add(i);
                    break;
                }
            }
        }
        return solution;
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(n)

https://leetcode.com/problems/find-words-containing-character/
You are given a 0-indexed array of strings words and a character x.
Return an array of indices representing the words that contain the character x.
Note that the returned array may be in any order.

Example 1:
Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
 */