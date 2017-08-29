Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.

class Solution {
    public String reverseWords(String s) {
        if (s == null) return null;
        String[] stringArr = s.split(" ");
        StringBuilder ret = new StringBuilder(reverseString(stringArr[0]));
        if (stringArr.length == 1) return ret.toString();
        for (int i = 1; i < stringArr.length; i++) {
            ret.append(" ").append(reverseString(stringArr[i]));
        }
        return ret.toString();
    }

    private String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}