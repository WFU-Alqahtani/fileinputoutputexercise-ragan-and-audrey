import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputOutput {

    public static void main(String[] args) {
//       1) Open the given file inside src called moviesDataSet.csv
        FileInputStream myFile = null;
        try {
            myFile = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner fileReader = new Scanner(myFile);
        while(fileReader.hasNextLine()){
            String data = fileReader.nextLine();
            System.out.println(data);
            }
        fileReader.close();
        System.out.println("=====================================");

        FileInputStream fileTwo = null;
        try {
            fileTwo = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner fileReaderTwo = new Scanner(fileTwo);
        while(fileReaderTwo.hasNextLine()) {
            String data = fileReaderTwo.nextLine();
            String[] arrayOfStrings = data.split(",");
            for (int i = 2; i < arrayOfStrings.length; i+=6){
                System.out.println(arrayOfStrings[i]);
            }
        }
        fileReaderTwo.close();


        }
//       2) Read each row in the dataset
//       3) Print each row to the screen
//       4) Print only the name of the movie
//       5) Add exception handling (try & catch) when needed
//       6) Close the files after finishing the processing
//       7) Commit your code and push it to the GitHub

    }
