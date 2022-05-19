package pt2an;

import javax.swing.*;

import java.awt.*;

public class equations2View extends JFrame {
    private JTextField textFieldA1;
    private JTextField textFieldB1;
    private JTextField textFieldC1;

    private JTextField textFieldC2;
    private JTextField textFieldA2;
    private JTextField textFieldB2;
    private JButton ketqua;
    private JTextArea textArea;


    public equations2View() {
        //tên chương trình
        setTitle("phương trình tuyến tính");

        //khởi tạo các lable hằng số và tên
        JLabel dangpt = new JLabel("phương trình tuyến tính có dạng a1x + b1 = c1 và a2x + b2x = c2");
        dangpt.setBounds(10, 20, 430, 20);
        add(dangpt);
        JLabel HangSoA1 = new JLabel("Nhập Hằng Số a1:");
        JLabel HangSoB1 = new JLabel("Nhập Hằng Số b1:");
        JLabel HangSoC1 = new JLabel("Nhập Hằng Số c1:");
        HangSoA1.setBounds(0, 50, 100, 20);
        HangSoB1.setBounds(150, 50, 100, 20);
        HangSoC1.setBounds(300, 50, 100, 20);

        add(HangSoA1);
        add(HangSoB1);
        add(HangSoC1);

        JLabel HangSoA2 = new JLabel("Nhập Hằng Số a2:");
        JLabel HangSoB2 = new JLabel("Nhập Hằng Số b2:");
        JLabel HangSoC2 = new JLabel("Nhập Hằng Số c2:");
        HangSoA2.setBounds(0, 80, 100, 20);
        HangSoB2.setBounds(150, 80, 100, 20);
        HangSoC2.setBounds(300, 80, 100, 20);
        add(HangSoA2);
        add(HangSoB2);
        add(HangSoC2);

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

        textFieldA2 = new JTextField();
        textFieldB2 = new JTextField();
        textFieldC2 = new JTextField();
        textFieldA2.setBounds(100, 80, 50, 20);
        textFieldB2.setBounds(250, 80, 50, 20);
        textFieldC2.setBounds(400, 80, 50, 20);
        //thêm 2 ô nhập hằng số
        add(textFieldA2);
        add(textFieldB2);
        add(textFieldC2);

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

    public JTextField getTextFieldA2() {
        return textFieldA2;
    }

    public JTextField getTextFieldB2() {
        return textFieldB2;

    }

    public JTextField getTextFieldC2() {
        return textFieldC2;
    }
    public JTextArea getTextArea() {
        return textArea;
    }

    public JButton getKetqua() {
        return ketqua;
    }
}