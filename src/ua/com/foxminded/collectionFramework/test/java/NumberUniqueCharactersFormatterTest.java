import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;

public class NumberUniqueCharactersFormatterTest {

    @Test
    public void shouldReturnFormattedNumberUniqueCharacters() throws Exception {
        LinkedHashMap<Character, Integer> numberUniqueCharacters = new LinkedHashMap<Character, Integer>();
        numberUniqueCharacters.put('H', 1);
        numberUniqueCharacters.put('e', 1);
        numberUniqueCharacters.put('l', 3);
        numberUniqueCharacters.put('o', 2);
        numberUniqueCharacters.put(' ', 1);
        numberUniqueCharacters.put('w', 1);
        numberUniqueCharacters.put('r', 1);
        numberUniqueCharacters.put('d', 1);
        numberUniqueCharacters.put('!', 1);

        String expected = "\"H\" - 1" + "\n" +
                "\"e\" - 1" + "\n" +
                "\"l\" - 3" + "\n" +
                "\"o\" - 2" + "\n" +
                "\" \" - 1" + "\n" +
                "\"w\" - 1" + "\n" +
                "\"r\" - 1" + "\n" +
                "\"d\" - 1" + "\n" +
                "\"!\" - 1" + "\n";

        NumberUniqueCharactersFormatter numberUniqueCharactersFormatter = new NumberUniqueCharactersFormatter();
        String actual = numberUniqueCharactersFormatter.format(numberUniqueCharacters);
        Assert.assertEquals(expected, actual);
    }
}