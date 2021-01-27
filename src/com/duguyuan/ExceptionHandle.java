package com.duguyuan;

import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            String input = in.nextLine();
            String[] numberStr = input.split(",");
            int result = Integer.parseInt(numberStr[0]) / Integer.parseInt(numberStr[1]);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
