import java.util.ArrayList;
import java.lang.String;
//adj = adjective
//noun = noun
//verb = verb
//verbed = verbed
//verbing = verbing
//nouns = plural
//adverb = adverb
//femaleName = female name
public class The_Raven extends MadLib{
    public ArrayList<String> Raven = createRaven();
    public ArrayList<String> madlibRaven = editRave();


    //The Raven Stanzas
    private ArrayList<String> createRaven(){
        ArrayList<String> myRaven = new ArrayList<String>();

        String line1 = "Once upon a midnight  adj , while I ";
        String line2 = " pondered adj and adj , ";
        String line3 = "Over many a quaint and curious noun of forgotten noun ";
        String line4 = "While I verbed , nearly napping suddenly there came a  noun.";
        String line5 = "As of noun gently rapping, rapping at my place door.";
        String line6 = "'Tis some noun , 'I muttered, 'tapping at my place door.";
        String line7 = "Only this, and nothing more.'";
        String line8 = "Ah, distinctly I remember it was in the adj December,";
        String line9 = "And each separate verbing ember wrought its noun upon the floor";
        String line10 = "Eagerly I verbed the morrow;- adverb I had sought to borrow";
        String line11 = "From my nouns surcease of sorrow - sorrow for the adj Lenore-";
        String line12 = "For the adj and adj maiden whom the angels";
        String line13 = "named femaleName - ";
        String line14 = "Nameless here evermore";

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

    public String wordReplace(String wordtype, String phrase){
        int index = phrase.indexOf(wordtype);
        if (index != -1){
            String myString = "";
            switch (wordtype){
                case "adj":
                    phrase.replace("adj", getAdjective());
                    break;

            }
            return phrase;
        }
        else return 0;
    }

    public ArrayList<String> editRave(){
        ArrayList<String> madlibRaven = new ArrayList<String>();
        for (String i : Raven) {
            String temp = wordReplace("adj", i);
            madlibRaven.add(temp);
//            String a = i.replace("adj", getAdjective());
//            String b = i.replace("noun", getNoun());
//            String c = i.replace("adverb", getAdverb());
//            String d = i.replace("verb", getVerb());
//            String e = i.replace("verbing", getVerbing());
//            String f = i.replace("verbed", getVerbed());
//            madlibRaven.add(a);
//            madlibRaven.add(b);
//            madlibRaven.add(c);
//            madlibRaven.add(d);
//            madlibRaven.add(e);
//            madlibRaven.add(f);
        }

        return madlibRaven;
    }

    public ArrayList<String> getRaven(){
        return Raven;
    }

    public ArrayList<String> getMadlibRaven(){
        return madlibRaven;
    }

    public static void main(String[] args) {
        The_Raven a = new The_Raven();
        System.out.println(a.getRaven());
        System.out.println(a.madlibRaven);
    }


}
