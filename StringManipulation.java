/**
 * StringManipulation
 */
public class StringManipulation {

    public static void main(String[] args) {
        String str = "Helleo.txt";
        // String str2 = "World";
        // String str3 = "Hello";
        // String s="1";
        // System.out.println(str.length());// length of string
        // System.out.println(str.concat(str2));// concatination
        // System.out.println(str.charAt(0));// char at index
        // System.out.println(str.indexOf("e"));// index of char
        // System.out.println(str.equals(str2));// equals
        // System.out.println(str.equals(str3));// equals
        // System.out.println(str.substring(0, 3));// substring
        // System.out.println(str.substring(3));// substring
        // System.out.println(str.toLowerCase());// to lower case
        // System.out.println(str.toUpperCase());// to upper case
        // System.out.println(str.trim());// trim
        System.out.println(str.replace("e", "a"));// replace
        // System.out.println(str.contains("e"));// contains
        // System.out.println(s.contains("1"));
        int len = str.length();
        String s = str.substring(len - 4);

        System.out.println(s.equals(".txt"));

    }
}