package hashtable;

public class RepeatedWord {

    //returns the first word to be repeated in a given string
    public String repeatedWord(String sentence){
        Hashtable ht = new Hashtable();
        String[] splitString = sentence.toLowerCase().split("[\\p{Punct}\\s]+");

        for(int i = 0; i < splitString.length; i++){
            if(ht.contains(splitString[i])){
                return splitString[i];
            }
            ht.add(splitString[i], i);
        }

        return "no repeating words";
    }
}
