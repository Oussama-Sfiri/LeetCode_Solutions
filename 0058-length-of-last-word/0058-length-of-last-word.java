class Solution {
    public int lengthOfLastWord(String str) {
       int i = str.length() - 1, length = 0;

       while (i >= 0 && str.charAt(i) == ' ') i--;

       while (i >= 0 && str.charAt(i) != ' ') {
           length++;
           i--;
       }

       return length;
    }
}