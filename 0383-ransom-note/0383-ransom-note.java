import java.util.Hashtable; // Import the Hashtable class
import java.util.Set;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magaHash = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magaHash.put(c, magaHash.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magaHash.containsKey(c) || magaHash.get(c) <= 0) {
                return false;
            }
            magaHash.put(c, magaHash.get(c) - 1);
        }

        return true;

        // Hashtable<Character, Integer> ht1 = new Hashtable<>();
        // Hashtable<Character, Integer> ht2 = new Hashtable<>();
        // for (char c : magazine.toCharArray()){
        //     ht1.put(c, ht1.getOrDefault(c, 0) + 1);
        // }
        // for (char c : ransomNote.toCharArray()){
        //     ht2.put(c, ht2.getOrDefault(c, 0) + 1);
        // }
        // Set<Character> setOfKeys = ht2.keySet();
        // for (char key : setOfKeys) {
        //     if (ht1.getOrDefault(key, 0) < ht2.get(key)) {
        //         return false;
        //     }
        // }
        
        // return true;
    }
}