package com.fastretailing.dcp.demoFor;

import java.util.Scanner;


public class InOut {
    public static void main(String[] args) {
        while (true) {

            // System.out.println("start:");
            // int age = sc.nextInt();
            System.out.println("请输入你的姓名：");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            // System.out.println("请输入你的工资：");
            // float salary = sc.nextFloat();
            System.out.println(underscoreName(name));
            // System.out.println("姓名：" + name + "\n" + "年龄：" + age + "\n" + "工资：" + salary);

        }
    }

    private static String underscoreName(String name) {
        StringBuilder result = new StringBuilder();
        if (name != null && name.length() > 0) {
            result.append(" ");
            result.append(name.substring(0, 1).toUpperCase());
            for (int i = 1; i < name.length(); i++) {
                String s = name.substring(i, i + 1);
                if (s.equals(s.toUpperCase()) && !Character.isDigit(s.charAt(0))) {
                    result.append(" ");
                }
                result.append(s.toLowerCase());
            }
            result.append(".");
        }
        return result.toString();
    }
}
