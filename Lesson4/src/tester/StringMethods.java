package tester;

import pCmodels.Laptop;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("String with no characters in it");
        String string  = new String();

        System.out.println("String as a  array of characters");
        char chars[] = { 'a', 'b', 'c' };
        String s = new String(chars);

        System.out.println("String(char chars[ ], int startIndex, int numChars)");
        char chars0[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String s0 = new String(chars0, 2, 3);
        System.out.println(s+" "+s0);

        System.out.println("contains the same character sequence as another String object using this constructor:");
        char c[] = {'J', 'a', 'v', 'a'};
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(" use string literal");
        String s3 = "lorem ipsum";

        System.out.println("String methods");
        s3.length();
        Laptop Dell = new Laptop();
        Dell.toString();
        System.out.println(Dell);// it is the same thing (System.out.println(Dell.toString))
        char fromS3 = s3.charAt(5);
        System.out.println(fromS3);
        char[] buf = new char[5];
        s3.getChars(2,7,buf,0);
        System.out.println(buf);
        s3.toCharArray();
        String s4 = s3;
        String s5 = "lorem IPSUM";
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s5));
        s5.startsWith("LOR");
        s5.endsWith("um");
        System.out.println("b".compareTo("a"));
        System.out.println(s5.indexOf('m'));
        System.out.println(s5.lastIndexOf('m'));
        System.out.println(s5.toLowerCase());
        System.out.println(s3.toUpperCase());


    }
}
