package com.org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        System.out.println(list.get(-1));
        
       // String text ="Hi <span class=\"screen-reader-text accessibleText\" style=\"\"> - Opens a Dialog</span>";
       // String text ="Hi <span class=\"accessibleText screen-reader-text\" style=\"\"> - Opens a Dialog</span>";
       // String text ="Hi <span class=\"screen-reader-text\" style=\"\"> - Opens a Dialog</span>";
        String text ="Hi <span class=\"accessibleText\" style=\"\"> - Opens a Dialog</span> continue";
       // String text ="Hi <span class=\"xyz\" style=\"\"> - Opens a Dialog</span>";
        System.out.println(text.replaceAll("(<span\\s*class=\"(accessibleText)?(\\s*)?(screen-reader-text)?(\\s*)?(accessibleText)?\".*</span>)", ""));
       
        
        
        /*final String regex = "(<span\\s?class=\"(accessibleText)?(\\s*)?(screen-reader-text)?(\\s*)?(accessibleText)?\"\\s?style=\"\">.*</span>)";
        final String string = "<span classs=\"samplae-class access_text\" style=\"\">testnbjhhj</span>";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }*/
    }

}
