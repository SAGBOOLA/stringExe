package string.exercise;

import java.util.Arrays;

public class StringExercise {
    public static void main(String[] args) {
        ex12();
    }

    public static void ex1(){
        String word = "Java";
        System.out.println(word.length());
    }

    public static void ex2(){
        String sentence = "Long example sentence";
        System.out.println(sentence.charAt(6));
    }

    public static void ex3(){
        String sentences = "Even longer example sentence";
        System.out.println(sentences.indexOf('o'));
    }

    public static void ex4(){
        String sentence = "Ok this is not as long";
        System.out.println(sentence.substring(11,22));
    }

    public static void ex5(){
        String word = "CAPS EQUALS SCREAMING";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
    }

    public static void ex6(){
        String words = "Java is the worst programming language";
        System.out.println(words.replace("worst","best"));
    }

    public static void ex7(){
        String word = "\tJ\ta\tv\ta\t";
        System.out.println(word.trim());
    }

    public static void ex8(){
        int a = 20;
        System.out.println(String.valueOf(a) + "20");
    }

    public static void ex9(){
        String word = "Oil and Water";
        String [] split = word.split(" and ");
        System.out.println(Arrays.toString(split));
    }

    public static void ex10(){
        String names = "Carl,Susie,Fredrick,Bob,Erik";
        String [] name = names.split(",");
        for (int i = 0; i< name.length; i++){
            System.out.println(name[i]);
        }

    }

    public static void ex11(){
        String sentence = "ThisShouldBeConverted";
        char [] word = sentence.toCharArray();
        for (char i = 0; i< word.length; i++){
            System.out.println(word[i]);
        }
    }

    public static void ex12(){
        char [] word = {'J','a','v','a'};
        String newWord = new String(word);
        System.out.println(newWord);
    }
}
