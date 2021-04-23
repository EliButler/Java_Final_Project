import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;


public class My_Files {

    public ArrayList<String> Read_File(String file_name) throws IOException{
        //creating an empty arraylist
        ArrayList<String> fileArray = new ArrayList<String>();

        //Setting file path
        Path filePath = Paths.get("C:\\Users\\micro\\IdeaProjects\\Java_Final_Project\\Final_Project\\", "noun.txt");
        File inFile = filePath.toFile();

        //prevents file not found Exception
        if (Files.exists(filePath)){
            try (BufferedReader in = new BufferedReader(new FileReader(inFile))){
                String word = in.readLine();
                while (word != null){
                    fileArray.add(word);
                    word = in.readLine();
                }
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
        else{
            System.out.println(filePath.toAbsolutePath() + "does not exist.");
        }

        return fileArray;
    }
}
