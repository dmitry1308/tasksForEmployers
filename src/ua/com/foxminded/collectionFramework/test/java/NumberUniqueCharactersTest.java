import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;

public class NumberUniqueCharactersTest {
    private NumberUniqueCharacters numberUniqueCharacters = new NumberUniqueCharacters();

    @Test
    public void shouldCreateNumberUniqueCharactersFromLine() {
        String line = "Hello world!";
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<Character, Integer>();
        expected.put('H', 1);
        expected.put('e', 1);
        expected.put('l', 3);
        expected.put('o', 2);
        expected.put(' ', 1);
        expected.put('w', 1);
        expected.put('r', 1);
        expected.put('d', 1);
        expected.put('!', 1);
        LinkedHashMap<Character, Integer> actual =
                numberUniqueCharacters.getCreateMapOfNumberUniqueCharacters(line.toCharArray());
        Assert.assertEquals(expected, actual);
    }
}