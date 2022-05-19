package com.company;

import javax.swing.*;

public class dayInMonth {

    public static void main(String[] args) {
        String string;
        int thang = 0;
        int nhuan;
        int nam = 0;


        string = JOptionPane.showInputDialog(null, "tháng", "nhập tháng:", JOptionPane.INFORMATION_MESSAGE);
        try {
            thang = Integer.parseInt(string);
            if (thang > 12 || thang < 1)
                JOptionPane.showMessageDialog(null, "nhập tháng không đúng");
        } catch (NumberFormatException e) {
            try {
                if (string.compareTo("Jan.") == 0 || string.compareTo("Jan") == 0) thang = 1;
                else if (string.compareTo("Feb.") == 0 || string.compareTo("Feb") == 0) thang = 1;
                else if (string.compareTo("Mar.") == 0 || string.compareTo("Mar") == 0) thang = 1;
                else if (string.compareTo("Apr.") == 0 || string.compareTo("Apr") == 0) thang = 1;
                else if (string.compareTo("May.") == 0 || string.compareTo("May") == 0) thang = 1;
                else if (string.compareTo("Jun.") == 0 || string.compareTo("Jun") == 0) thang = 1;
                else if (string.compareTo("Jul.") == 0 || string.compareTo("Jul") == 0) thang = 1;
                else if (string.compareTo("Aug.") == 0 || string.compareTo("Aug") == 0) thang = 1;
                else if (string.compareTo("Sep.") == 0 || string.compareTo("Sep") == 0) thang = 1;
                else if (string.compareTo("Oct.") == 0 || string.compareTo("Oct") == 0) thang = 1;
                else if (string.compareTo("Nov.") == 0 || string.compareTo("Nov") == 0) thang = 1;
                else if (string.compareTo("Dec.") == 0 || string.compareTo("Dec") == 0) thang = 1;
                else JOptionPane.showMessageDialog(null, "nhập tháng không đúng");
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null, "nhập tháng không đúng");
            }

        }
        switch (thang) {
            // các tháng 1, 3, 5, 7, 8, 10 và 12 có 31 ngày.
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                JOptionPane.showMessageDialog(null, "tháng " + thang +  "có 31 ngày");
                break;

            // các tháng 4, 6, 9 và 11 có 30 ngày
            case 4:
            case 6:
            case 9:
            case 11:
                JOptionPane.showMessageDialog(null, "tháng " + thang +  "có 30 ngày");
                break;

            // Riêng tháng 2 nếu là năm nhuận thì có 29 ngày, còn không thì có 28 ngày.
            case 2:
                string = JOptionPane.showInputDialog(null, "Năm", "nhập năm:", JOptionPane.INFORMATION_MESSAGE);
                try {
                    nam = Integer.parseInt(string);
                    if (nam < 0) {
                        JOptionPane.showMessageDialog(null, "nhập năm không đúng");
                    }
                    if (nam % 4 != 0 || (nam % 100 == 0 && nam % 400 != 0)) {
                        JOptionPane.showMessageDialog(null, "tháng 2 của năm " + nam + "có 28 ngày");
                    } else JOptionPane.showMessageDialog(null, "tháng 2 của năm " + nam + "có 29 ngày");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "nhập năm không đúng");
                }

            default:
                System.out.println("Nhập tháng không hợp lệ.");
        }


    }
}
