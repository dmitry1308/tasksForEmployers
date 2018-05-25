import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Task 5 - Collection Framework:");
        NumberUniqueCharacters numberUniqueCharacters = new NumberUniqueCharacters();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true) {
            System.out.println("Enter line:");
            if ((line = bufferedReader.readLine()).equals("close")) {
                break;
            } else if (line.equals("")) {
                System.out.println("Empty line!");
            } else {
                LinkedHashMap mapOfNumberUniqueCharacters = numberUniqueCharacters.calculate(line);
                NumberUniqueCharactersFormatter numberUniqueCharactersFormatter = new NumberUniqueCharactersFormatter();
                System.out.println(numberUniqueCharactersFormatter.format(mapOfNumberUniqueCharacters));
            }
        }
    }
}
