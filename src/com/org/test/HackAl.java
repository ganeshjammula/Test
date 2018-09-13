package com.org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackAl {

    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                if (input.hasNextInt()) {
                    int a = input.nextInt();
                    List<Integer> al = new ArrayList<>();
                    al.add(a);
                    for (int j = 0; j < n; j++) {
                        if (input.hasNextInt()) {
                            int b = input.nextInt();
                            al.add(b);
                        }
                    }
                    list.add(al);
                }


            }
        }


        if (input.hasNextInt()) {
            int q = input.nextInt();
            for (int i = 0; i < q; i++) {
                int x = input.nextInt();
                int y = input.nextInt();
                try {
                    System.out.println(list.get(x - 1).get(y));
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
            }


        }
    }

}
