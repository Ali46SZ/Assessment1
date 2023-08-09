package org.stc;

public class Main {
    public static void main(String[] args) {
        String s = "abd(jnb)asdf";
        String s2 = "abdjnbasdf";
        String s3 = "dd(df)a(ghhh)";
        System.out.println(reverseSubStrings(s));
        System.out.println(reverseSubStrings(s2));
        System.out.println(reverseSubStrings(s3));
    }

    public static String reverseSubStrings(String str) {
        StringBuilder finalString = new StringBuilder();
        StringBuilder subString = new StringBuilder();
        boolean add = false;
        for (char ch : str.toCharArray()) {
            if (add == true && ch != ')') {
                subString.append(ch);
                continue;
            }
            if (ch == '(') {
                finalString.append(ch);
                add = true;
                continue;
            }
            if (ch == ')') {
                finalString.append(subString.reverse());
                finalString.append(ch);
                subString.setLength(0);
                add = false;
                continue;
            }
            finalString.append(ch);
        }
        return finalString.toString();
    }
}
