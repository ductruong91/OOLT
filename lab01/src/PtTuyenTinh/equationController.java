package PtTuyenTinh;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class equationController {
    private float hsA;
    private float hsB;
    //khai báo biến có kiểu equationView
    private final equationView view;

    public equationController(equationView view) {
        this.view = view;
        view.getKetqua().addActionListener(this::chay);
    }

    //kiểm tra và lấy giá trị của Hang số A trong ô tex A
    private boolean giatriHangSoA() {
        boolean giatri = false;
        try {    //try là hàm xử lí ngoại lệ( đang chạy trong try mà không đúng thì nó sẽ xử lí trong catch)
            if (!"".equals(view.getTextFieldA().getText()))  //s1.equals(s2) là so sánh 2 chuỗi, khác nhau trả về false
            {
                hsA = Float.parseFloat(view.getTextFieldA().getText());
                giatri = true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "hằng số a khong hợp lệ");
        }
        return giatri;
    }

    private boolean giatriHangSoB() {
        boolean giatri = false;
        try {
            if (!"".equals(view.getTextFieldB().getText())) {
                hsB = Float.parseFloat((view.getTextFieldB().getText()));
                giatri = true;

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "gia tri hang so B khong dung");
        }
        return giatri;
    }

    //hàm giải pt bạc nhất
    private String giaiPt(float a, float b) {
        String traloi = null;
        if (a == 0 && b != 0) {
            traloi = "phương trình vô nghiệm";
        } else {
            traloi = "phuong trinh co nghiem la:" + -b / a;
        }
        return traloi;
    }
    // chạy hàm khi click kết quả
    public void chay(ActionEvent e) {
        if (giatriHangSoA() && giatriHangSoB()) {
            view.getTextArea().setText(giaiPt(hsA, hsB)); //set gia tri textArea
        } else {
            view.getTextArea().setText("");
        }
    }
}
