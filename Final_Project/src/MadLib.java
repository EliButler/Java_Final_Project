import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class MadLib implements Class1Interface, Class2Interface{
    //ArrayList Instance variables
    final private ArrayList<String> Nouns = myNoun();
    final private ArrayList<String> Adjectives = myAdjective();
    final private ArrayList<String> Verbs = myVerbs();
    final private ArrayList<String> Adverbs = myAdverbs();
    final private ArrayList<String> FemaleNames = myFemaleNames();
    final private ArrayList<String> Verbed = modifyList("ed", Verbs);
    final private ArrayList<String> Verbing = modifyList("ing", Verbs);

    //CREATING WORDS ARRAYLISTS
    //Female Names
    private ArrayList<String> myFemaleNames (){
        return create_list("femaleNames.txt");
    }

    //Nouns Creation
    private ArrayList<String> myNoun (){
        return create_list("noun.txt");
    }

    //Adjective Creation
    private ArrayList<String> myAdjective(){
        return create_list("adjective.txt");
    }

    //Verbs Creation
    private ArrayList<String> myVerbs(){
        return create_list("verb.txt");
    }

    //Adverbs Creation
    private ArrayList<String> myAdverbs(){
        return create_list("adverb.txt");
    }



    //CREATING ARRAYLIST FROM FILE
    private ArrayList<String> create_list(String fileName) {
        //Creating My_Files object
        My_Files fileNouns = new My_Files();
        //Retrieving and assigning list
        return fileNouns.Read_File(fileName);
    }

    //MODIFYING ARRAY LIST
    private ArrayList<String> modifyList (String ending, ArrayList<String> myList){
        ArrayList<String> editList = new ArrayList<>();
        for (String temp : myList){
            int myLength = temp.length() - ending.length();
            if (ending.equals(temp.substring(myLength))){
                editList.add(temp);
            }
        }
        return editList;
    }

    //Female Names
    public String getFemaleName(){
        ArrayList<String> myList = FemaleNames;
        Collections.shuffle(myList);
        return myList.get(0);
    }

    public ArrayList<String> getAllFemaleNames(){
        return FemaleNames;
    }

    //SPECIAL CASES
    //Verbed - verbes ending in ed
    public String getVerbed(){
        ArrayList<String> myList = Verbed;
        Collections.shuffle(myList);
        return myList.get(0);
    }

    public ArrayList<String> getAllVerbed(){
        return Verbed;
    }

    //Verbing - verbs ending in ing
    public String getVerbing(){
        ArrayList<String> myList = Verbing;
        Collections.shuffle(myList);
        return myList.get(0);
    }

    public ArrayList<String> getAllVerbing(){
        return Verbing;
    }

    // CLASS 1 INTERFACE
    public String getNoun(){
        ArrayList<String> myList = Nouns;
        Collections.shuffle(myList);
        return myList.get(0);
    }

    public String getAdjective(){
        ArrayList<String> myList = Adjectives;
        Collections.shuffle(myList);
        return myList.get(0);
    }

    public ArrayList getAllNouns(){
        return Nouns;
    }

    public ArrayList getAllAdjectives(){
        return Adjectives;
    }

    //  CLASS 2 INTERFACE
    public String getVerb(){
        ArrayList<String> myList = Verbs;
        Collections.shuffle(myList);
        return myList.get(0);
    }

    public String getAdverb() {
        ArrayList<String> myList = Adverbs;
        Collections.shuffle(myList);
        return myList.get(0);
    }

    public ArrayList getAllVerbs(){
        return Verbs;
    }

    public ArrayList getAllAdverbs(){
        return Adverbs;
    }

    public static void main(String[] args) {
        MadLib a = new MadLib();
        System.out.print("Female Name 1: ");
        System.out.println(a.getFemaleName());
        System.out.print("Female Name 2: ");
        System.out.println(a.getFemaleName());
        System.out.print("Noun 1: ");
        System.out.println(a.getNoun());
        System.out.print("Noun 2: ");
        System.out.println(a.getNoun());
        System.out.print("Adjective 1: ");
        System.out.println(a.getAdjective());
        System.out.print("Adjective 2: ");
        System.out.println(a.getAdjective());
        System.out.print("Verb 1: ");
        System.out.println(a.getVerb());
        System.out.print("Verb 2: ");
        System.out.println(a.getVerb());
        System.out.print("Verbed 1: ");
        System.out.println(a.getVerbed());
        System.out.print("Verbed 2: ");
        System.out.println(a.getVerbed());
        System.out.print("Verbing 1: ");
        System.out.println(a.getVerbing());
        System.out.print("Verbing 2: ");
        System.out.println(a.getVerbing());
        System.out.print("Adverb 1: ");
        System.out.println(a.getAdverb());
        System.out.print("Adverb 1: ");
        System.out.println(a.getAdverb());
        System.out.println("LIST PRINT:");
        System.out.println(a.getAllFemaleNames());
        System.out.println(a.getAllNouns());
        System.out.println(a.getAllAdjectives());
        System.out.println(a.getAllVerbs());
        System.out.println(a.getAllAdverbs());
        System.out.println(a.getAllVerbed());
        System.out.println(a.getAllVerbing());
    }

}


