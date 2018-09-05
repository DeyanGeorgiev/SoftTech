package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P17_ChangeToUppercase {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        System.out.println(removeTagsToUpper(input));
    }


    public static String removeTagsToUpper(CharSequence htmlString) {

        Pattern patt = Pattern.compile("<upcase>(.+?)</upcase>");

        Matcher m = patt.matcher(htmlString);

        StringBuffer sb = new StringBuffer(htmlString.length());

        while (m.find()) {
            String text = m.group(1);

            m.appendReplacement(sb, Matcher.quoteReplacement(text).toUpperCase());
        }

        m.appendTail(sb);

        return sb.toString();
    }


}

