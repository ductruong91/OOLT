package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {
    public static void main(String[] args) {
        MyDate date0 = new MyDate();
        date0.Print();
        MyDate date1 = new MyDate(12, 4, 2019);
        date1.Print();
        MyDate date2 = new MyDate("February 18th 2019");
        date2.Print();
        MyDate date3 = new MyDate();
        date3.setDay(1);
        date3.setMonth(4);
        date3.setYear(2021);
        date3.Print();
        MyDate date4 = new MyDate();
        date4.accep();
        date4.Print();


    }
}


