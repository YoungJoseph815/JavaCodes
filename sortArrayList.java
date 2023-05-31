package practice;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(13);
        list.add(5);
        list.add(8);
        System.out.println(list);
        sortArrLst((ArrayList<Integer>)list);
    }
    static void sortArrLst(ArrayList<Integer> arrayList){
        for (int i=0;i<arrayList.size();i++){
            for (int j=i+1; j<arrayList.size();j++) {
                if (arrayList.get(i) > arrayList.get(j)) {
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
        System.out.println(arrayList);
    }
}

//********Output***
// [13, 5, 8]
// [5, 8, 13]
