package PtTuyenTinh;

import javax.swing.*;

public class equationView extends JFrame {
    private final JTextField textFieldA;
    private final JTextField textFieldB;
    private final JButton ketqua;
    private final JTextArea textArea;


    public equationView() {
        //tên chương trình
        setTitle("phương trình tuyến tính");

        //khởi tạo các lable hằng số và tên
        JLabel dangpt = new JLabel("phương trình tuyến tính có dạng ax + b = 0");
        JLabel HangSoA = new JLabel("Nhập Hằng Số a:");
        JLabel HangSoB = new JLabel("Nhập Hằng Số b:");
        HangSoA.setBounds(20, 50, 100, 20);
        HangSoB.setBounds(200, 50, 100, 20);
        dangpt.setBounds(10, 20, 430, 20);
        add(dangpt);
        add(HangSoA);

        add(HangSoB);
        //tạo các ô nhập hằng số
        textFieldA = new JTextField();
        textFieldB = new JTextField();
        textFieldA.setBounds(120, 50, 50, 20);
        textFieldB.setBounds(300, 50, 50, 20);
        //thêm 2 ô nhập hằng số
        add(textFieldA);
        add(textFieldB);
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

    public JTextField getTextFieldA() {
        return textFieldA;
    }

    public JTextField getTextFieldB() {
        return textFieldB;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JButton getKetqua() {
        return ketqua;
    }

//
//    public void setTextFieldA(JTextField textFieldA) {
//        this.textFieldA = textFieldA;
//    }
//

//    public void setTextFieldB(JTextField textFieldB) {
//        this.textFieldB = textFieldB;
//    }
//

//    public void setTextFieldC(JTextField textFieldC) {
//        this.textFieldC = textFieldC;
//    }
//

//    public void setBtnKetQua(JButton btnKetQua) {
//        this.btnKetQua = btnKetQua;
//    }

//    public void setTextArea(JTextArea textArea) {
//        this.textArea = textArea;
//    }
}

