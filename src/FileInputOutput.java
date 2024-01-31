import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInputOutput {

    public static void main(String[] args) {
////       1) Open the given file inside src called moviesDataSet.csv
//        FileInputStream myFile = null;
//        try {
//            myFile = new FileInputStream("src/moviesDataset.csv");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        Scanner fileReader = new Scanner(myFile);
//        while(fileReader.hasNextLine()){
//            String data = fileReader.nextLine();
//            System.out.println(data);
//            }
//        fileReader.close();
//        System.out.println("=====================================");
//
//        FileInputStream fileTwo = null;
//        try {
//            fileTwo = new FileInputStream("src/moviesDataset.csv");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        Scanner fileReaderTwo = new Scanner(fileTwo);
//        while(fileReaderTwo.hasNextLine()) {
//            String data = fileReaderTwo.nextLine();
//            String[] arrayOfStrings = data.split(",");
//            for (int i = 2; i < arrayOfStrings.length; i+=6){
//                System.out.println(arrayOfStrings[i]);
//            }
//        }
//        fileReaderTwo.close();

        FileInputStream myInputFile = null;

        try {
            myInputFile = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> years = new ArrayList<>();
        Scanner fileReader = new Scanner(myInputFile);
        while (fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            String[] arrayOfStrings = data.split(",");
            for (int i = 4; i < arrayOfStrings.length; i += 6) {
                years.add(arrayOfStrings[i]);
            }
        }
        fileReader.close();

            PrintWriter fileWriter;
            FileOutputStream myOutputFile = null;
            int n;
            try {
                myOutputFile = new FileOutputStream("src/movieYear.csv");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            fileWriter = new PrintWriter(myOutputFile);
            for (int i = 0; i< years.size(); i++){
                try {
                    n = Integer.parseInt(years.get(i));
                    fileWriter.println(years.get(i));
                }
                catch(NumberFormatException e) {
                    System.out.println(e);
                }
            }
            fileWriter.close();



//       2) Read each row in the dataset
//       3) Print each row to the screen
//       4) Print only the name of the movie
//       5) Add exception handling (try & catch) when needed
//       6) Close the files after finishing the processing
//       7) Commit your code and push it to the GitHub

    }
}
