package com.company;

import javax.swing.JOptionPane;
import java.sql.SQLOutput;

public class showSumTowNumber {
    public static void main(String[] args) {


        String strnum1, strnum2;
        String stringNocification = "you've just intered ";
        strnum1 = JOptionPane.showInputDialog(null, "enter first number", "first number", JOptionPane.INFORMATION_MESSAGE);
        stringNocification += strnum1 + " and ";
        strnum2 = JOptionPane.showInputDialog(null, "enter second number", "second number", JOptionPane.INFORMATION_MESSAGE);
        stringNocification += strnum2;
        JOptionPane.showMessageDialog(null, stringNocification, "show tow number", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
