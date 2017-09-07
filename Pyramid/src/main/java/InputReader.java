import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    public String readInput() { //read user input
        BufferedReader brui = new BufferedReader(new InputStreamReader(System.in));
        String userInput = null;
        try {
            userInput = brui.readLine();
        } catch (IOException ex) {
        }
        return userInput;
    }
}
