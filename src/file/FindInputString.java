package file;

import java.io.File;
import java.io.FileNotFoundException;

public class FindInputString {

    /**
     * Main method of the class for the following question:
     *     Find Input String in the File.
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter Input String: ");
        String input = scanner.nextLine();

        File file = new File("src/file/file.txt");
        findInputStringInFile(file, input);

        scanner.close();
    }

    private static void findInputStringInFile(File file, String input) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(file);
            var lineCounter = 0;
            var isFound = false;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCounter++;
                if (line.contains(input)) {
                    System.out.println("Input String Found in File on Line: " + lineCounter);
                    isFound = true;
                    break;
                }
            }
            if (!isFound)
                System.out.println("String Not found on file.");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}