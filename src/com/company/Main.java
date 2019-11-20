package com.company;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Analyze analyze = new Analyze();
            Board board = new Board();
            ObjectType getObjectType;
            int scan = -1;
            String s;
            String[] commands = {"start", "add", "delete", "move", "print", "fire", "exit"};
            while (1 == 1) {
                scan = -1;
                s = sc.nextLine();
                for (int i = 0; i < 7; i++) {
                    if (s.equalsIgnoreCase(commands[i])) {
                        scan = i;
                    } else if (i == 6 && scan == -1) {
                        System.out.println("Again");
                    }
                }
                if (scan == 0) {
                    analyze.start();
                } else if (scan == 1) {
                    analyze.add();
                } else if (scan == 2) {
                    analyze.delete();
                } else if (scan == 3) {
                    analyze.move();
                } else if (scan == 4) {
                    analyze.print();
                } else if (scan == 5) {
                    analyze.fire();
                } else if (scan == 6) {
                    analyze.exit();
                }
            }
        }
    }