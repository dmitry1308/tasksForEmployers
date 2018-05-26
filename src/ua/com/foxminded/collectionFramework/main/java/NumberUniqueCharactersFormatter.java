import java.util.HashMap;
import java.util.Map;

public class NumberUniqueCharactersFormatter implements Formatter {

    @Override
    public String format(HashMap<Character, Integer> numberUniqueCharacters) {
        String finalLine = "";
        for (Map.Entry<Character, Integer> pair : numberUniqueCharacters.entrySet()) {
            finalLine += "\"" + pair.getKey() + "\"" + " - " + pair.getValue() + "\n";
        }
        return finalLine;
    }

}
