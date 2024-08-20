import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        Map<Integer, Integer> frequencyMap = findFrequencies(array);

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> findFrequencies(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        return frequencyMap;
    }
}

