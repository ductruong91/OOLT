package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Order {
    public static final int MAX_LIMITTED_ORDER = 5;
    //khai bao 1 hằng số: số lượng sản phâm rtois da
    public static final int MAX_NUMBER_ORDER = 10;

    private static int nbOrders = 0;

    public static int getNbOrders() {
        return nbOrders;
    }

    public static void setNbOrders(int nbOrders) {
        Order.nbOrders = nbOrders;
    }

    public void orderPlus() {
        if (Order.nbOrders < MAX_LIMITTED_ORDER)
            Order.nbOrders++;
    }

    private MyDate date = new MyDate();

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    // khai bao mot mang(array) casc doi tuong cua DVD
    private final DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDER];
    //khai bao thuoc tinhs chua so luong phan tu hien co trong don hang
    private int qtOrdered = 0;
    // xaay dung cacs phuong htuc get set

    public int getQtOrdered() {
        return qtOrdered;
    }

    public void setQtOrdered(int qtOrdered) {
        this.qtOrdered = qtOrdered;
    }
    // xay dung phuong thuc them 1 doi tuong dvd vao don hang
    // noi dung: them mot doi tuong vao mang itemsOrdered
    // phai kiem tra xem mang da day chua

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtOrdered == MAX_NUMBER_ORDER)
            System.out.println("this order is almost full");
        else {
            this.itemOrdered[qtOrdered] = disc;
            qtOrdered++;
            System.out.println("the disc has been added");
            System.out.println("total disc:" + qtOrdered);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] disc) {
        int length = disc.length;
        for (int i = 0; i < length; i++) {
            this.addDigitalVideoDisc(disc[i]);
        }
//        for (DigitalVideoDisc dvd:disc
//             ) {
//            this.addDigitalVideoDisc(dvd);
//        }
    }


    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        this.addDigitalVideoDisc(disc1);
        this.addDigitalVideoDisc(disc2);
    }

    // phuong thuc xo 1 don hang
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        // viet lenh loai bo khoi mang va kiem tra tinh huong mang rong
        for (int i = 0; i < qtOrdered; i++) {
            if (this.itemOrdered[i] == disc) {
                for (int j = i; j < qtOrdered; j++) {
                    this.itemOrdered[j] = this.itemOrdered[j + 1];
                }

                qtOrdered = qtOrdered - 1;
            }
            this.itemOrdered[qtOrdered + 1] = null;
        }

    }

    // phuong thuc tinh tong gia tri cua don hang
    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtOrdered; i++) {
            total = total + itemOrdered[i].getCost();
        }
        return total;
    }

    public void printAll() {
        for (int i = 0; i < qtOrdered; i++) {
            itemOrdered[i].printInfor();
        }
    }
    public void print(){
        System.out.println("*************Order**************");
        System.out.println("Date:" );
        this.date.printday();
        for (int i = 0; i < qtOrdered; i++) {
            System.out.println(i+":");
            itemOrdered[i].printInfor();
        }
    }



}