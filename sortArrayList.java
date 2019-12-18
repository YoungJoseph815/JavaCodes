package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sortArrayList {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<Integer>();

        list.add(3);
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(0);
        list.add(2);



//        Iterator<Integer> iterator=list.iterator();
//
//        while(iterator.hasNext()){
//
//            System.out.print(iterator.next()+" ");
//        }
//
//        System.out.println();
//
//        for (int mylist:list){
//
//            System.out.print(mylist+" ");
//        }
//        System.out.println();

//
//        for (int i=0; i<list.size();i++){
//
//            System.out.print(list.get(i)+" ");
//        }
//

        sortArrayList((ArrayList<Integer>) list);






    }


   public static void sortArrayList(ArrayList<Integer> arrayList){

        int temp;

        for (int i=0; i<arrayList.size();i++){
            for (int j=i+1;j<arrayList.size();j++){

                if (arrayList.get(i)>arrayList.get(j)){

                    temp=arrayList.get(i);
                    arrayList.set(i,arrayList.get(j));
                    arrayList.set(j,temp);


                }
            }
        }

       System.out.println(arrayList);



   }
}
