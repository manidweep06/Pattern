import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        // Key: Character, Value: Integer (Count)
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (map.containsKey(c)) {
                // If it exists, increment the current count
                map.put(c, map.get(c) + 1);
            } else {
                // If new, start at 1
                map.put(c, 1);
            }
        }

        // Print the map
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
        }
    }
}