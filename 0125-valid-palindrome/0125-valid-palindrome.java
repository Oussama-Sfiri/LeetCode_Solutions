class Solution {
    public boolean isPalindrome(String s) {
        String lowerS = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        String reversedStr = "";
        for(int i = 0; i < lowerS.length(); i++){
            char c = lowerS.charAt(i);
            if(Character.isLetterOrDigit(c)){
                str.append(c);
            }
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

        // for (int i = 0; i < str.length(); i++){
        //     char ch= str.charAt(i);
        //     reversedStr = ch + reversedStr;
        // }
        // return str.toString().equals(reversedStr.toString());
    }
}