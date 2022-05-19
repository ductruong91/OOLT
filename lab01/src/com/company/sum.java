package com.company;

import javax.swing.JOptionPane;
public class sum{
    public static void main(String[] args) {
String strnum1,strnum2;
strnum1 = JOptionPane.showInputDialog(null, "nhập số thứ nhất", "số thứ nhất", JOptionPane.INFORMATION_MESSAGE);
Double num1 = Double.parseDouble(strnum1);
strnum2 = JOptionPane.showInputDialog(null, "nhập số thứ hai", "số thứ hai", JOptionPane.INFORMATION_MESSAGE);
Double num2 = Double.parseDouble(strnum2);
Double sum = num1 + num2;
Double max;
Double product = num1 * num2;
Double quotient = num1 / num2;
        JOptionPane.showMessageDialog(null,"max của 2 số"  + ((num1>=num2) ? num1 : num2));
        JOptionPane.showMessageDialog(null, "tich 2 so" + product);
        JOptionPane.showMessageDialog(null, "thuong 2 so" + quotient);

        JOptionPane.showMessageDialog(null,"tổng của 2 số là" + sum +"!");
        System.exit(0);
    }
}
