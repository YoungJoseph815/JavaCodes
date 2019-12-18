package practice;

public class starNameRepeating {

    public static void main(String[] args) {


        String word="*";
        String name="Ahmetjan";

        nameRepeating(word);
        nameRepeating(name);


    }

    public static void nameRepeating(String str){


        for (int i=0;i<5;i++){

            for (int j=0; j<=i;j++){

                System.out.print(str+" ");
            }

                System.out.println();
        }
    }

}
