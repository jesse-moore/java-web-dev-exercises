package studios;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class CountingCharacters {

    public static void main(String[] args) {

//        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String testString = readFile();
        char[] charactersInString = testString.toCharArray();
        Map<String, Integer> charMap = new HashMap<>();
        for (int i = 0; i < charactersInString.length; i++) {
            Character character = charactersInString[i];
            String charString = character.toString().toLowerCase();
            if(charString.matches("\\W")) {
                continue;
            }
            if(charMap.get(charString)==null){
                charMap.put(charString, 1);
            } else {
                Integer count = charMap.get(charString);
                charMap.put(charString, count+1);
            }
        }
        for (Map.Entry<String, Integer> keyValue : charMap.entrySet()) {
            System.out.println(keyValue.getKey() + ": " + keyValue.getValue());
        }
    }

    public static String readFile() {
        try {
            File myObj = new File("text.txt");
            Scanner myReader = new Scanner(myObj);
            String returnString = "";
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                returnString += data;
            }
            myReader.close();
            return returnString;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "";
        }
    }
}
