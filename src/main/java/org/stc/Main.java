package org.stc;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseInParenthesesStrings("abd(jnb)asdf"));
        System.out.println(reverseInParenthesesStrings("abdjnbasdf"));
        System.out.println(reverseInParenthesesStrings("dd(df)a(ghhh)"));
    }

    public static String reverseInParenthesesStrings(String str) {
        StringBuilder finalString = new StringBuilder();
        StringBuilder subString = new StringBuilder();
        boolean isInParentheses = false;
        for (char ch : str.toCharArray()) {
            if (isInParentheses && ch != ')') {
                subString.append(ch);
                continue;
            }
            if (ch == '(') {
                finalString.append(ch);
                isInParentheses = true;
                continue;
            }
            if (ch == ')') {
                finalString.append(subString.reverse());
                finalString.append(ch);
                subString.setLength(0);
                isInParentheses = false;
                continue;
            }
            finalString.append(ch);
        }
        return finalString.toString();
    }
}
