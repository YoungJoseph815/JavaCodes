package practice;

import java.util.Arrays;

public class countingFrequencyOfNum {

    public static void main(String[] args) {
        frequency(new int[]{1,1,2,1,4,32,32,1,0,67,5,6,6,2});
    }

    static void frequency(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for (int element:
             arr) {
            map.put(element,map.getOrDefault(element,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println("Element: "+entry.getKey()+" \t "+"Frequency: "+entry.getValue());
        }

    }
}

//*********Output********
// Element: 32 	 Frequency: 2
// Element: 0 	 Frequency: 1
// Element: 1 	 Frequency: 4
// Element: 2 	 Frequency: 2
// Element: 67 	 Frequency: 1
// Element: 4 	 Frequency: 1
// Element: 5 	 Frequency: 1
// Element: 6 	 Frequency: 2
