import java.util.regex.Pattern;

public class StringSplit {
    public static void main(String args[]){
        String a = "helo 25 world 10 new 3.00";
        String[] aArray = a.split("\\s");

        int word =0, digit=0, floatNumber = 0;
        for (String i : aArray){
            if(Pattern.matches("[0-9](\\.[0-9]*)*?", i)){
                floatNumber++;
                continue;
            }
            if(Pattern.matches("\\d*", i)){
                digit++;
                continue;
            }
            word++;
        }
//        System.out.println(Pattern.matches("[a-zA-Z0-9]", test1)); // word
//        System.out.println(Pattern.matches("\\d*", test1)); //digit (int)
        System.out.println(word+" "+digit+" "+floatNumber);

    }


}
