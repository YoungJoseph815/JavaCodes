public class GenericMethod {
  
  //Generic allows similar data types to be passed as parameters.

    public static void main(String[] args) {

        Integer[] num=new Integer[]{1,2,3,4,5};
        String[] str=new String[]{"Hello","World"};
        Character[] ch=new Character[]{'a','u','i','o','e'};

        getArrayElement(num);
        getArrayElement(str);
        getArrayElement(ch);

    }
    static <E> void getArrayElement(E[] array){
         for (E element: array){
             System.out.print(element+" ");
         }
             System.out.println();
    }
}

//*******Output*****
// 1 2 3 4 5 
// Hello World 
// a u i o e 

