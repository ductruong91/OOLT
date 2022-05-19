package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("xin chao cac ban");
        System.exit(0);

    }

    public static class cls2 {
        public static void main(String[] args) {
            String result;
            result = JOptionPane.showInputDialog("please enter your name");
            JOptionPane.showMessageDialog(null,"xin chào "+result+"!");
            System.exit(0);
        }
    }
}
