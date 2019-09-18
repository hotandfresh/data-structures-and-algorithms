package hashtable;

import java.util.ArrayList;

public class LeftJoin {

    public ArrayList<ArrayList<String>> leftJoin(Hashtable ht1, Hashtable ht2){
        ArrayList<ArrayList<String>> result =  new ArrayList<>();

        for(int i = 0; i < ht1.HashArray.length; i++){
            if(ht1.HashArray[i] != null){
                if(ht2.contains((String)ht1.HashArray[i].key)){
                    ArrayList<String> innerResultList = new ArrayList<>();
                    innerResultList.add((String)ht1.HashArray[i].key);
                    innerResultList.add((String)ht1.HashArray[i].value);
                    innerResultList.add((String)ht2.HashArray[i].value);
                    result.add(innerResultList);
                } else {
                    ArrayList<String> innerResultList = new ArrayList<>();
                    innerResultList.add((String)ht1.HashArray[i].key);
                    innerResultList.add((String)ht1.HashArray[i].value);
                    innerResultList.add("NULL");
                    result.add(innerResultList);
                }
            }
        }
        return result;
    }
}
