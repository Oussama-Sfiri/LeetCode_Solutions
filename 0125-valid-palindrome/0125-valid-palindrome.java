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
        for (int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            reversedStr = ch + reversedStr;
        }
        return str.toString().equals(reversedStr.toString());
    }
}