import java.util.Hashtable; // Import the Hashtable class
import java.util.Set;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Hashtable<String, Integer> ht1 = new Hashtable<>();
        Hashtable<String, Integer> ht2 = new Hashtable<>();
        for (char c : magazine.toCharArray()){
            String key = String.valueOf(c);
            ht1.put(key, ht1.getOrDefault(key, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()){
            String key = String.valueOf(c);
            ht2.put(key, ht2.getOrDefault(key, 0) + 1);
        }
        Set<String> setOfKeys = ht2.keySet();
        for (String key : setOfKeys) {
            if (ht1.getOrDefault(key, 0) < ht2.get(key)) {
                return false;
            }
        }
        
        return true;
    }
}