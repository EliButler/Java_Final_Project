import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MadLib implements Class1Interface, Class2Interface{
    public ArrayList<String> my_list = create_list();

    //creating a list
    public ArrayList<String> create_list(){
        ArrayList<String> my_list = new ArrayList<>();
        my_list.add("mike");
        my_list.add("eli");
        my_list.add("butler");

        return my_list;
    }

    // CLASS 1 INTERFACE
    public String getNoun(){
        String test = "Test Noun";
        Collections.shuffle(my_list);
        return my_list.get(0);
    }

    public String getAdjective(){
        String test = "Test Adjective";
        return test;
    }

    public ArrayList getAllNouns(){
        ArrayList<String> test = new ArrayList<>();
        return test;
    }

    public ArrayList getAllAdjectives(){
        ArrayList<String> test = new ArrayList<>();
        return test;
    }

    //  CLASS 2 INTERFACE
    public String getVerb(){
        String test = "Test Verb";
        return test;
    }

    public String getAdverb() {
        String test = "Test Adverb";
        return test;
    }

    public ArrayList getAllVerbs(){
        ArrayList<String> test = new ArrayList<>();
        return test;
    }

    public ArrayList getAllAdverbs(){
        ArrayList<String> test = new ArrayList<>();
        return test;
    }

    public static void main(String[] args) {
        MadLib my_list = new MadLib();
        String result = my_list.getNoun();
        System.out.println(result);
    }

}


