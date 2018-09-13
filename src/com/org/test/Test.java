package com.org.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<String> WILL_CALL_FREE_IDS = new LinkedHashSet<String>(Arrays.asList(
                "MC004", // WDW Will Call
                "MC005", // WDW Pick-Up
                "MC007", // WDW Deliver to Disney Site
                "11808"  // DLR PreSale - WillCall
            ));
        System.out.println(WILL_CALL_FREE_IDS);
        WILL_CALL_FREE_IDS.add("test");
        System.out.println(WILL_CALL_FREE_IDS);
        System.out.println(WILL_CALL_FREE_IDS);
        Set<String> WILL_CALL_FREE_IDS_2 = new HashSet<String>(Arrays.asList(
                "MC004", // WDW Will Call
                "MC005", // WDW Pick-Up
                "MC007", // WDW Deliver to Disney Site
                "11808"  // DLR PreSale - WillCall
            ));
        System.out.println(WILL_CALL_FREE_IDS_2);
        WILL_CALL_FREE_IDS_2.add("test");
        System.out.println(WILL_CALL_FREE_IDS_2);
        
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        System.out.println(myString+"\n");
        
        String myString2 = scanner.next();
        System.out.println(myString2);
        scanner.close();
    }

}
