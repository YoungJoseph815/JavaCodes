package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findEmail {

    public static void main(String[] args) {

        String text="Welcome to use those email address: bhdbf12@gmail.com, jn7dfd@hotmail.com,dnjdc@ahmatmail.com Thank you.";

        emailFinder(text);

    }

    public static void emailFinder(String str){

        Pattern pattern=Pattern.compile("([a-zA-Z0-9_.-]+)@([a-zA-Z0-9_.-]+[a-z])");
        Matcher matcher=pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
