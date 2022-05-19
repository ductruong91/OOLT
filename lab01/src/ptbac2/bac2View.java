package ptbac2;


import javax.swing.*;

import java.awt.*;

public class bac2View extends JFrame {
    private JTextField textFieldA1;
    private JTextField textFieldB1;
    private JTextField textFieldC1;


    private JButton ketqua;
    private JTextArea textArea;


    public bac2View() {
        //tên chương trình
        setTitle("phương trình tuyến tính");

        //khởi tạo các lable hằng số và tên
        JLabel dangpt = new JLabel("phương trình tuyến tính có dạng ax + b = c");
        dangpt.setBounds(10, 20, 430, 20);
        add(dangpt);
        JLabel HangSoA1 = new JLabel("Nhập Hằng Số a:");
        JLabel HangSoB1 = new JLabel("Nhập Hằng Số b:");
        JLabel HangSoC1 = new JLabel("Nhập Hằng Số c:");
        HangSoA1.setBounds(0, 50, 100, 20);
        HangSoB1.setBounds(150, 50, 100, 20);
        HangSoC1.setBounds(300, 50, 100, 20);

        add(HangSoA1);
        add(HangSoB1);
        add(HangSoC1);

        //tạo các ô nhập hằng số
        textFieldA1 = new JTextField();
        textFieldB1 = new JTextField();
        textFieldC1 = new JTextField();
        textFieldA1.setBounds(100, 50, 50, 20);
        textFieldB1.setBounds(250, 50, 50, 20);
        textFieldC1.setBounds(400, 50, 50, 20);
        //thêm 2 ô nhập hằng số
        add(textFieldA1);
        add(textFieldB1);
        add(textFieldC1);


        //tạo nút kết quả
        ketqua = new JButton("kết quả");
        ketqua.setBounds(130, 100, 100, 30);
        //thêm nút kết quả
        add(ketqua);
        //tạo textarea kết quả
        textArea = new JTextArea();
        textArea.setBounds(10, 150, 400, 100);
        //thêm kết quả
        add(textArea);


        // thiết lập bố cục (layout)
        setLayout(null);
        // thiết lập kích thước jframe
        setSize(450, 300);
        setVisible(true);

    }

    public JTextField getTextFieldA1() {
        return textFieldA1;
    }

    public JTextField getTextFieldB1() {
        return textFieldB1;
    }
    public JTextField getTextFieldC1() {
        return textFieldC1;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JButton getKetqua() {
        return ketqua;
    }
}
