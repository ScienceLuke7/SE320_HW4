import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Q2 {
    
    /** 
     * @summary Reads the file "wordFile.csv" and displays all the 
     * words in the file that do not contain a duplicate
     * @param args
     */
    public static void main(String[] args) {
        TreeSet<String> wordTree = new TreeSet<String>();
        LinkedList<String> wordStringList = new LinkedList<String>();
        File wordFile = new File("wordFile.csv");

        try(Scanner wordScanner = new Scanner(wordFile)) {
            String lineOfWords = wordScanner.nextLine();
            String[] stringArray = lineOfWords.split(", ");
            for (String word : stringArray) {
                wordStringList.add(word);
            }
        }
        catch (FileNotFoundException fne) {
            System.out.println("Word File not found. Ending program");
        }

        for (String word : wordStringList) {
            int wordCount = 0;
            for(int i = 0; i < wordStringList.size(); i++) {
                if (wordStringList.get(i).equals(word)) {
                    wordCount++;
                }
            }
            if (wordCount == 1) {
                wordTree.add(word);
            }
        }

        System.out.println("\nwordTree: " + wordTree);

    }
}
