import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;
import java.util.RandomAccess;

//adj = adjective
//noun = noun
//verb = verb
//verbed = verbed
//verbing = verbing
//nouns = plural
//adverb = adverb
//noun = noun
//femaleName = female name
public class The_Raven extends MadLib{
    public ArrayList<String> Raven = createRaven();



    //The Raven Stanzas
    private ArrayList<String> createRaven(){
        ArrayList<String> myRaven = new ArrayList<String>();

        String line1 = "Once upon a midnight  adj , while I ";
        String line2 = "pondered adj and adj , ";
        String line3 = "Over many a quaint and curious noun of forgotten noun ";
        String line4 = "While I verbed , nearly napping suddenly there came a noun.";
        String line5 = "As of noun gently rapping, rapping at my place door.";
        String line6 = "'Tis some noun , 'I muttered, 'tapping at my place door.";
        String line7 = "Only this, and nothing more.'";
        String line8 = "Ah, distinctly I remember it was in the adj December,";
        String line9 = "And each separate verbing ember wrought its noun upon the floor";
        String line10 = "Eagerly I verbed the morrow;- adverb I had sought to borrow";
        String line11 = "From my nouns surcease of sorrow - sorrow for the adj Lenore-";
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
        ArrayList<String> myChecks = new ArrayList<>(Arrays.asList("adj", "noun", "verb", "verbed", "verbing", "adverb", "femaleName", "place"));
        for (String i : myChecks){
            if (phrase.contains(i));
            return true;
        }
        return false;
    }

    public String wordReplace(String phrase){
        if (!checkWord(phrase)){
            return phrase;
        }
        //Checking and replacing adjectives
        if (checkWord(phrase)){
            phrase = phrase.replace("adj", getAdjective());
        }
        //Checking and replacing nouns
        if (checkWord(phrase)){
            phrase = phrase.replace("noun", getNoun());
        }
        //Checking and replacing verbs
        if (checkWord(phrase)){
            phrase = phrase.replace("verb", getVerb());
        }
        //Checking and replacing verbed
        if (checkWord(phrase)){
            phrase = phrase.replace("verbed", getVerbed());
        }
        if (checkWord(phrase)){
            phrase = phrase.replace("femaleName", getFemaleName());
        }
        if (checkWord(phrase)){
            phrase = phrase.replace("place", getPlace());
        }

        return phrase;
    }

    public ArrayList<String> editRave(){
        ArrayList<String> madlibRaven = new ArrayList<String>();
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
        editRave();
        for ( String i : editRave()){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        The_Raven a = new The_Raven();
        System.out.println("The Raven");
        a.getRaven();

        System.out.println("\nMad Lib Raven");
        a.getMadlibRaven();
    }
}
