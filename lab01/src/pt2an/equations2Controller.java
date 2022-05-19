package pt2an;


import java.awt.event.ActionEvent;

import javax.swing.*;


public class equations2Controller {
    //khai báo biến có kiểu equationView
    private equations2View view;
    private float hsA1;
    private float hsB1;
    private float hsC1;
    private float hsA2;
    private float hsB2;
    private float hsC2;




    //kiểm tra và lấy giá trị của Hang số A trong ô tex A
    private boolean giatriHangSoA1() {
        boolean giatri = false;
        try {    //try là hàm xử lí ngoại lệ( đang chạy trong try mà không đúng thì nó sẽ xử lí trong catch
            if (!"".equals(view.getTextFieldA1().getText()))  //s1.equals(s2) là so sánh 2 chuỗi, khác nhau trả về false
            {
                hsA1 = Float.parseFloat(view.getTextFieldA1().getText());
                giatri=true;
            }
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

    private boolean giatriHangSoA2() {
        boolean giatri = false;
        try {    //try là hàm xử lí ngoại lệ( đang chạy trong try mà không đúng thì nó sẽ xử lí trong catch
            if (!"".equals(view.getTextFieldA2().getText()))  //s1.equals(s2) là so sánh 2 chuỗi, khác nhau trả về false
            {
                hsA2 = Float.parseFloat(view.getTextFieldA2().getText());
                giatri=true;
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog (null, "hằng số a khong hợp lệ" );
        }
        return giatri;
    }
    private boolean giatriHangSoB2(){
        boolean giatri = false;
        try {
            if (!"".equals(view.getTextFieldB2().getText())){
                hsB2 = Float.parseFloat((view.getTextFieldB2().getText()));
                giatri = true;

            }
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"gia tri hang so B khong dung");
        }
        return giatri;
    }

    private boolean giatriHangSoC2(){
        boolean giatri = false;
        try {
            if (!"".equals(view.getTextFieldC2().getText())){
                hsC2 = Float.parseFloat((view.getTextFieldC2().getText()));
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
    private String giaiPt(float a1, float b1, float c1, float a2, float b2, float c2) {
        String traloi = null;
        float D,D1, D2;
        D=a1*b2-a2*b1;
        D1= c1*b2-c2*b1;
        D2=a1*c2-a2*c1;
        if (D!=0) {
            traloi = "phương trình có nghiệm x1="+D1/D +"và x2="+D2/D;
        }
        else {
           if (D1==D2 && D1==0)
           {
               traloi= "phương trình có vô số nghiệm";
           } else {traloi="phương trình vô nghiệm";}
        }
        return traloi;
    }
    // chạy hàm khi click kết quả
    public void chay(ActionEvent e){
        if (giatriHangSoA1() && giatriHangSoB1() && giatriHangSoC1() &&giatriHangSoA2() && giatriHangSoB2() && giatriHangSoC2() ){
            view.getTextArea().setText(giaiPt(hsA1, hsB1, hsC1, hsA2, hsB2, hsC2)); //set gia tri textArea
        } else {
            view.getTextArea().setText("");
        }
    }


    public equations2Controller(equations2View view){
        this.view = view;
        view.getKetqua().addActionListener(this::chay);
    }
}
