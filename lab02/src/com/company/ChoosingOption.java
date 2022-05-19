package com.company;

import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
        //TODO
        int option = JOptionPane.showConfirmDialog(null, "doyou want to ...");
        JOptionPane.showMessageDialog(null, "you've chosen: " + (option == JOptionPane.YES_OPTION ? "yes" : "no"));
    }
}
