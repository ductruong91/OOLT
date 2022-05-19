package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungleTile:"+jungleDVD.getTitle());
        System.out.println("cinderellaTile:"+cinderellaDVD.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungleTile:"+jungleDVD.getTitle());

    }
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        DigitalVideoDisc tmp;
        tmp=dvd1;
        dvd1=dvd2;
        dvd2=dvd1;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        dvd.setTitle(title);
    }
}
//classifier member
// - từ khóa final
//-từ khóa static
//-các thành phaanf static được xác định khi biên dịch:
//+1 chương trình có 2 đoạn
//     + compiler time
//     +runtime
//+các thành phần static có thể gọi trực tiếp quá tên của class mà không cần tạo đối tượng
//-----các phương thức static chỉ được gọi đến các thuộc tính hay phương thức khác trong lớp