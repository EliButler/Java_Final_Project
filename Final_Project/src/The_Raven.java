import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;

//adj = adjective
//noun = noun
//nouns = nons
//verb = verb
//verbed = vbd
//verbing = vbing
//adverb = advrb
//noun = noun
//femaleName = female name
public class The_Raven extends MadLib{
    //7. creates an instance variable upon class instantiation
    final private ArrayList<String> Raven = createRaven();



    //The Raven Stanzas
    private ArrayList<String> createRaven(){
        //8. Creates ArrayList of strings composed of unedited poem
        ArrayList<String> myRaven = new ArrayList<>();

        String line1 = "Once upon a midnight adj, while I ";
        String line2 = "pondered adj and adj, ";
        String line3 = "Over many a quaint and curious noun of forgotten noun ";
        String line4 = "While I vbd, nearly napping suddenly there came a noun.";
        String line5 = "As of noun gently rapping, rapping at my place door.";
        String line6 = "'Tis some noun, 'I muttered, 'tapping at my place door.";
        String line7 = "Only this, and nothing more.'";
        String line8 = "Ah, distinctly I remember it was in the adj December,";
        String line9 = "And each separate vbing ember wrought its noun upon the floor";
        String line10 = "Eagerly I vbd the morrow;- advrb I had sought to borrow";
        String line11 = "From my nons surcease of sorrow - sorrow for the adj Lenore-";
        String line12 = "For the adj and adj maiden whom the angels";
        String line13 = "named femaleName - ";
        String line14 = "Nameless here evermore.";

        myRaven.add(line1);
        myRaven.add(line2);
        myRaven.add(line3);
        myRaven.add(line4);
        myRaven.add(line5);
        myRaven.add(line6);
        myRaven.add(line7);
        myRaven.add(line8);
        myRaven.add(line9);
        myRaven.add(line10);
        myRaven.add(line11);
        myRaven.add(line12);
        myRaven.add(line13);
        myRaven.add(line14);

        return myRaven;
    }

    private Boolean checkWord(String phrase){
        //6. checks to see if replacement word is in submitted phrase
        ArrayList<String> myChecks = new ArrayList<>(Arrays.asList("adj", "noun","nons", "verb", "vbd", "vbing", "advrb", "femaleName", "place"));
        for (String i : myChecks){
            if (phrase.contains(i)) {
                return true;
            }
        }
        return false;
    }

    private String wordReplace(String phrase){
        //5. calls checkword, if true, replaces word
        if (!checkWord(phrase)){
            return phrase;
        }
        //Checking and replacing adverbs
        //this has to come first so as not to change verbs
        if (checkWord(phrase)){
            phrase = phrase.replace("advrb", getAdverb());
        }
        //Checking and replacing adjectives
        if (checkWord(phrase)){
            phrase = phrase.replace("adj", getAdjective());
        }
        //Checking and replacing plural nouns
        if (checkWord(phrase)){
            phrase = phrase.replace("nons", getPluralNoun());
        }
        //Checking and replacing noun
        if (checkWord(phrase)){
            phrase = phrase.replace("noun", getNoun());
        }
        //Checking and replacing verbs ending in "ing"
        if (checkWord(phrase)){
            phrase = phrase.replace("vbing", getVerbing());
        }
        //Checking and replacing verbs ending in "ed"
        if (checkWord(phrase)){
            phrase = phrase.replace("vbd", getVerbed());
        }
        if (checkWord(phrase)){
            phrase = phrase.replace("verb", getVerb());
        }
        if (checkWord(phrase)){
            phrase = phrase.replace("femaleName", getFemaleName());
        }
        if (checkWord(phrase)){
            phrase = phrase.replace("place", getPlace());
        }

        return phrase;
    }

    private ArrayList<String> editRave(){
        //4. Creates a new arraylist, then line by line replaces the required words
        ArrayList<String> madlibRaven = new ArrayList<>();
        for (String i : Raven){
                String temp = wordReplace(i);
                madlibRaven.add(temp);
        }
        return madlibRaven;
    }

    public void getRaven(){
        for (String i : Raven){
            System.out.println(i);
        }
    }

    public void getMadlibRaven(){
        //3. Calls editRave method, and prints out each line.
        editRave();
        for ( String i : editRave()){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //1. Creating a new Raven object - Raven inherits from MadLib
        The_Raven a = new The_Raven();
//        System.out.println("The Raven");
//        a.getRaven();
        System.out.println("\nMad Lib Raven");
        //2. Calling method to display altered text
        a.getMadlibRaven();
    }
}
