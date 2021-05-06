import javax.swing.plaf.synth.SynthMenuBarUI;
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
    //This prevents the place in poem from being two different places.
    private String place = getPlace();

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

    private int noDup(String test, String phrase){
        //Checking for first found subsring, if found returns beginning index
        //else returns -1
        return phrase.indexOf(test);
    }

    private String dupReplace(String test, String phrase, String replacement){
        //replaces the first search string with a replacement string in the given phrase
        //returns new phrase
        String myPhrase;
        //first index of test phrase
        int begin = noDup(test, phrase);
        //last index of test phrase
        int end = (test.length()) + (begin);
        //to prevent out of bound indices, if test string is at end of phrase
        if (end > phrase.length()){
            end = replacement.length();
        }
        else{
            end = test.length() + begin;
        }
        int myLength = phrase.length();
        //new phrase creation
        myPhrase = phrase.substring(0, begin) + replacement + phrase.substring(end, myLength);
        return myPhrase;
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
        if (checkWord(phrase)){
            int myLoc = noDup("advrb", phrase);
            if (myLoc != -1){
                phrase = dupReplace("advrb", phrase, getAdverb());

            }
            phrase = phrase.replace("advrb", getAdverb());
        }

        //Checking and replacing adjectives
        if (checkWord(phrase)){
            int myLoc = noDup("adj", phrase);
            if (myLoc != -1){
                phrase = dupReplace("adj", phrase, getAdjective());

            }
            phrase = phrase.replace("adj", getAdjective());
        }

        //Checking and replacing plural nouns
        if (checkWord(phrase)){
            int myLoc = noDup("nons", phrase);
            if (myLoc != -1){
                phrase = dupReplace("nons", phrase, getPluralNoun());

            }
            phrase = phrase.replace("nons", getPluralNoun());
        }
        //Checking and replacing noun
        if (checkWord(phrase)){
            int myLoc = noDup("noun", phrase);
            if (myLoc != -1){
                phrase = dupReplace("noun", phrase, getNoun());

            }
            phrase = phrase.replace("noun", getNoun());
        }

        //Checking and replacing verbs ending in "ing"
        if (checkWord(phrase)){
            int myLoc = noDup("vbing", phrase);
            if (myLoc != -1){
                phrase = dupReplace("vbing", phrase, getVerbing());

            }
            phrase = phrase.replace("vbing", getVerbing());
        }

        //Checking and replacing verbs ending in "ed"
        if (checkWord(phrase)){
            int myLoc = noDup("vbd", phrase);
            if (myLoc != -1){
                phrase = dupReplace("vbd", phrase, getVerbed());

            }
            phrase = phrase.replace("vbd", getVerbed());
        }
        //I left these unchanged because none of them are duplicates in the same phrase
        if (checkWord(phrase)){
            phrase = phrase.replace("verb", getVerb());
        }
        if (checkWord(phrase)){
            phrase = phrase.replace("femaleName", getFemaleName());
        }
        if (checkWord(phrase)){
            phrase = phrase.replace("place", place);
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
        //Prints unaltered version of the poem
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
        //2. Calling method to display altered text
        a.getMadlibRaven();
    }
}
