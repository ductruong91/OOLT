package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
        DigitalVideoDisc dvd0 = new DigitalVideoDisc();
        dvd0.setDirector("con vit");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king");

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("star wars", "Scienc fiction", " geogre lucus", 124, 24.95f);
        dvd0.printInfor();
        dvd1.printInfor();
        dvd2.printInfor();
// tao mot don hàng mới
        Order anOrder = new Order();
        anOrder.orderPlus();
        anOrder.addDigitalVideoDisc(dvd0);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);

        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.print();

        System.out.println("total cost is:" + anOrder.totalCost());
        System.out.println(anOrder.DigitalVideoDiscgetALuckyItem());
    }
}
