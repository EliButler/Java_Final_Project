import java.util.ArrayList;
//adj = adjective
//noun = noun
//verb = verb
//verbed = verbed
//verbing = verbing
//nouns = plural
//adverb = adverb
//femaleName = female name
public class The_Raven extends MadLib{
//    public ArrayList<String> Raven = createRaven();


    //The Raven Stanzas
    private ArrayList<String> createRaven(){
        ArrayList<String> Raven = new ArrayList<String>();

        String line1 = "Once upon a midnight  adj, while I ";
        String line2 = " pondered adj and adj, ";
        String line3 = "Over many a quaint and curious noun of forgotten noun ";
        String line4 = "While I verbed, nearly napping suddenly there came a  noun.";
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

        Raven.add(line1);
        Raven.add(line2);
        Raven.add(line3);
        Raven.add(line4);
        Raven.add(line5);
        Raven.add(line6);
        Raven.add(line7);
        Raven.add(line8);
        Raven.add(line9);
        Raven.add(line10);
        Raven.add(line11);
        Raven.add(line12);
        Raven.add(line13);
        Raven.add(line14);

        return Raven;
    }
//    private String line1 = "Once upon a midnight  adj, while I ";
//    private String line2 = " pondered adj and adj, ";
//    private String line3 = "Over many a quaint and curious noun of forgotten noun ";
//    private String line4 = "While I verbed, nearly napping suddenly there came a  noun.";
//    private String line5 = "As of noun gently rapping, rapping at my place door.";
//    private String line6 = "'Tis some noun , 'I muttered, 'tapping at my place door.";
//    private String line7 = "Only this, and nothing more.'";
//    private String line8 = "Ah, distinctly I remember it was in the adj December,";
//    private String line9 = "And each separate verbing ember wrought its noun upon the floor";
//    private String line10 = "Eagerly I verbed the morrow;- adverb I had sought to borrow";
//    private String line11 = "From my nouns surcease of sorrow - sorrow for the adj Lenore-";
//    private String line12 = "For the adj and adj maiden whom the angels";
//    private String line13 = "named femaleName - ";
//    private String line14 = "Nameless here evermore";
//
//    Raven.add(line1);
//    Raven.add(line2);
//    Raven.add(line3);
//    Raven.add(line4);
//    Raven.add(line5);
//    Raven.add(line6);
//    Raven.add(line7);
//    Raven.add(line8);
//    Raven.add(line9);
//    Raven.add(line10);
//    Raven.add(line11);
//    Raven.add(line12);
//    Raven.add(line13);
//    Raven.add(line14);



//    public ArrayList<String> editRave(){
//        Raven.get(0).replace("noun", getNoun());
//
//        return Raven;
//    }

    public static void main(String[] args) {
        The_Raven a = new The_Raven();
        System.out.println(a.createRaven());
    }


}
