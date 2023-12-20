import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
//        Task:
//        The newly-improved calibration document consists of lines of text; each line originally contained a specific calibration value that the Elves now need to recover.
//        On each line, the calibration value can be found by combining the first digit and the last digit (in that order) to form a single two-digit number.
//        For example:
//        1abc2
//        pqr3stu8vwx
//        a1b2c3d4e5f
//        treb7uchet
//        In this example, the calibration values of these four lines are 12, 38, 15, and 77. Adding these together produces 142.
//
//        Consider your entire calibration document. What is the sum of all of the calibration values?



        String filePath = "C:\\Users\\sezgi\\Desktop\\AOC\\AOCD1\\Trebuchet.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            char lastNum = 0;
            char firstNum = 0;
            String wholeNumberStr;
            int wholeNumberInt = 0;
            int finalNumber = 0;

                    while ((line = reader.readLine()) != null) {

                        //check for first digit in string
                        for (int i = 0; i < line.length(); i++) {
                            char currentChar = line.charAt(i);
                            if (Character.isDigit(currentChar)){
                                firstNum = currentChar;
                                break;
                            }
                        }
                        //check for last digit in string
                        for (int x = line.length() - 1; x >= 0; x--) {
                            char currentChar2 = line.charAt(x);
                            if (Character.isDigit(currentChar2)) {
                                lastNum = currentChar2;
                                break;
                            }

                        }
                        wholeNumberStr = firstNum + "" + lastNum;
                        wholeNumberInt = Integer.parseInt(wholeNumberStr);
                        //add the new wholeNumber to the finalNumber
                        finalNumber = finalNumber + wholeNumberInt;
                        System.out.println(line);
                        System.out.println(wholeNumberInt);

                        //give out the final Number after adding the whole Number from b4
                        System.out.println(finalNumber);

                    }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}