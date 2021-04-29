import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class My_Files {

    public ArrayList<String> Get_List(String file_name) {
        ArrayList<String> checkFile = Read_File(file_name);

        return checkFile;
    }

    public ArrayList<String> Read_File(String file_name) {
        //creating an empty arraylist
        ArrayList<String> fileArray = new ArrayList<String>();

        try {
            //Reading from file
            File myFile = new File(file_name);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                fileArray.add(data);
            }

        }
        catch (Exception e){
            //If reading from file fails, populate array with appropriate words:
            //NOUN CATCH
            if (file_name.equals("noun") || file_name.equals("noun.txt")){
                fileArray.add("car");
                fileArray.add("bus");
                fileArray.add("Texas");
                fileArray.add("bicycle");
                fileArray.add("Russia");
                fileArray.add("student");
                fileArray.add("smoke");
                fileArray.add("1985 Chevrolet Celebrity");
                fileArray.add("outside");
                fileArray.add("necklace");
            }

            //ADJECTIVE CATCH
            if (file_name.equals("adjective") || file_name.equals("adjective.txt")){
                fileArray.add("interesting");
                fileArray.add("dark");
                fileArray.add("black");
                fileArray.add("boring");
                fileArray.add("ugly");
                fileArray.add("beautiful");
                fileArray.add("mild");
                fileArray.add("worn");
                fileArray.add("tired");
                fileArray.add("thin");
            }
            //VERB CATCH
            if (file_name.equals("verb") || file_name.equals("verb.txt")){
                fileArray.add("libeling");
                fileArray.add("repoints");
                fileArray.add("garotted");
                fileArray.add("maintains");
                fileArray.add("disfranchising");
                fileArray.add("antagonises");
                fileArray.add("balkanize");
                fileArray.add("sums");
                fileArray.add("braved");
                fileArray.add("outeating");
            }
            //ADVERB CATCH
            if (file_name.equals("adverb") || file_name.equals("adverb.txt")){
                fileArray.add("refreshfully");
                fileArray.add("reductively");
                fileArray.add("fractiously");
                fileArray.add("imorally");
                fileArray.add("inattentively");
                fileArray.add("new");
                fileArray.add("irreducibly");
                fileArray.add("serenely");
                fileArray.add("psychically");
                fileArray.add("blisteringly");
            }
            //FEMALE NAME CATCH
            if (file_name.equals("femaleNames") || file_name.equals("femaleNames.txt")){
                fileArray.add("Margeaux");
                fileArray.add("Junie");
                fileArray.add("Augustine");
                fileArray.add("Cristal");
                fileArray.add("Moria");
                fileArray.add("Marcy");
                fileArray.add("Cecelia");
                fileArray.add("Madlen");
                fileArray.add("Paulina");
                fileArray.add("Ileane");
            }

        }

        return fileArray;
    }
}
//        //Creating a file object
//        File ab_path = new File(file_name);
//        //Getting the absolute path of the file
//        String ab_path_2 = ab_path.getAbsolutePath();
//        //Removing the file name from path string
//        ab_path_2 = ab_path_2.replace(file_name, "");
//        ab_path_2 = ab_path_2.replace("\\", "\\\");
//        System.out.println(ab_path_2);
////        Path filePath = Paths.get("C:\\Users\\micro\\IdeaProjects\\Java_Final_Project\\Final_Project\\", "noun.txt");
//        Path filePath = Paths.get(ab_path_2, file_name);
//        File inFile = filePath.toFile();
//
//        //prevents file not found Exception
//        if (Files.exists(filePath)){
//            try (BufferedReader in = new BufferedReader(new FileReader(inFile))){
//                String word = in.readLine();
//                while (word != null){
//                    fileArray.add(word);
//                    word = in.readLine();
//                }
//            }
//            catch (IOException e){
//                System.out.println(e);
//            }
//        }
//        else{
//            System.out.println(filePath.toAbsolutePath() + "does not exist.");
//        }
//
//        return fileArray;