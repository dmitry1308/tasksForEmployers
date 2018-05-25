import java.util.HashMap;
import java.util.LinkedHashMap;

public class NumberUniqueCharacters implements StringOperation {
    private HashMap<String, LinkedHashMap> mapProcessedLine = new HashMap<String, LinkedHashMap>();


    @Override
    public LinkedHashMap calculate(String line) {
        if (mapProcessedLine.containsKey(line)) {
            return mapProcessedLine.get(line);
        }
        char[] arrayOfChars = line.toCharArray();
        LinkedHashMap<Character, Integer> numberUniqueCharacters = createMapOfNumberUniqueCharacters(arrayOfChars);
        mapProcessedLine.put(line, numberUniqueCharacters);
        return numberUniqueCharacters;
    }

    private LinkedHashMap<Character, Integer> createMapOfNumberUniqueCharacters(char[] arrayOfChars) {
        LinkedHashMap<Character, Integer> numberUniqueCharacters = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < arrayOfChars.length; i++) {
            char symbol = arrayOfChars[i];
            if (!numberUniqueCharacters.containsKey(symbol)) {
                numberUniqueCharacters.put(symbol, 1);
            } else {
                numberUniqueCharacters.put(symbol, numberUniqueCharacters.get(symbol) + 1);
            }
        }
        return numberUniqueCharacters;
    }
}
