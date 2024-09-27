class Solution {
    public boolean isSubsequence(String s, String t) {
        // String finalT = "";
        // for(int i = 0; i < t.length(); i++){
        //     if(s.indexOf(t.charAt(i)) != -1){
        //         finalT += t.charAt(i);
        //     }
        // }
        // return s.equals(finalT);
        int sIndex = 0;
        int tIndex = 0;
        while(sIndex < s.length() && tIndex < t.length()){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == s.length();
    }
}