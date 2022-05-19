package ptbac2;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class bac2Controller {

        //khai báo biến có kiểu equationView
        private bac2View view;
        private float hsA1;
        private float hsB1;
        private float hsC1;





        //kiểm tra và lấy giá trị của Hang số A trong ô tex A
        private boolean giatriHangSoA1() {
            boolean giatri = false;
            try {    //try là hàm xử lí ngoại lệ( đang chạy trong try mà không đúng thì nó sẽ xử lí trong catch
                if (!"".equals(view.getTextFieldA1().getText()))  //s1.equals(s2) là so sánh 2 chuỗi, khác nhau trả về false
                {
                    hsA1 = Float.parseFloat(view.getTextFieldA1().getText());
                    giatri=true;
                }
                if (hsA1==0)
                    JOptionPane.showMessageDialog (null, "hằng số a khong hợp lệ" );

            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog (null, "hằng số a khong hợp lệ" );
            }
            return giatri;
        }
        private boolean giatriHangSoB1(){
            boolean giatri = false;
            try {
                if (!"".equals(view.getTextFieldB1().getText())){
                    hsB1 = Float.parseFloat((view.getTextFieldB1().getText()));
                    giatri = true;

                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"gia tri hang so B khong dung");
            }
            return giatri;
        }
        private boolean giatriHangSoC1(){
            boolean giatri = false;
            try {
                if (!"".equals(view.getTextFieldC1().getText())){
                    hsC1 = Float.parseFloat((view.getTextFieldC1().getText()));
                    giatri = true;

                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"gia tri hang so B khong dung");
            }
            return giatri;
        }

        //hàm giải pt bạc nhất 2 ẩn
        private String giaiPt(float a1, float b1, float c1) {
            String traloi = null;
            float D;
            D=b1*b1-4*a1*c1;

            if (D==0) {
                traloi = "phương trình có nghiệm x1=x2="+ -b1/(2*a1);
            }
            else {
                if (D>0)
                {
                    traloi= "phương trình có 2 nghiệm x1=" + (-b1+Math.sqrt(D))/(2*a1) + " va x2=" + (-b1-Math.sqrt(D))/(2*a1);
                } else {traloi="phương trình vô nghiệm";}
            }
            return traloi;
        }
        // chạy hàm khi click kết quả
        public void chay(ActionEvent e){
            if (giatriHangSoA1() && giatriHangSoB1() && giatriHangSoC1()){
                view.getTextArea().setText(giaiPt(hsA1, hsB1, hsC1)); //set gia tri textArea
            } else {
                view.getTextArea().setText("");
            }
        }


        public bac2Controller(bac2View view){
            this.view = view;
            view.getKetqua().addActionListener(this::chay);
        }
    }

