import java.util.Hashtable; // Import the Hashtable class
import java.util.Set;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Create Hashtables for both magazine and ransomNote character counts
        Hashtable<String, Integer> ht1 = new Hashtable<>();
        Hashtable<String, Integer> ht2 = new Hashtable<>();
        
        // Populate ht1 with counts of characters from magazine
        for (char c : magazine.toCharArray()) {
            String key = String.valueOf(c);
            ht1.put(key, ht1.getOrDefault(key, 0) + 1);
        }
        
        // Populate ht2 with counts of characters from ransomNote
        for (char c : ransomNote.toCharArray()) {
            String key = String.valueOf(c);
            ht2.put(key, ht2.getOrDefault(key, 0) + 1);
        }
        
        // Get the set of keys (characters) from ht2 (ransomNote)
        Set<String> setOfKeys = ht2.keySet();
        
        // Check if every character in ransomNote has enough occurrences in magazine
        for (String key : setOfKeys) {
            // If magazine does not have the character or has fewer occurrences than needed, return false
            if (ht1.getOrDefault(key, 0) < ht2.get(key)) {
                return false;
            }
        }
        
        // If all characters in ransomNote are sufficiently present in magazine, return true
        return true;
    }
}