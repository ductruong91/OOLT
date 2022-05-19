package hust.soict.hedspi.aims.utils;

import java.util.*;

public class MyDate {
    Calendar cal = Calendar.getInstance();
    private int day;
    private int month;
    private int year;

    public MyDate() {
        super();
        this.day = cal.get(Calendar.DAY_OF_MONTH);
        this.month = cal.get(Calendar.MONTH) + 1;
        this.year = cal.get(Calendar.YEAR);

    }

    public MyDate(int day, int month, int year) {
        this.day = checkDay(day);
        this.month = checkMonth(month);
        this.year = checkYear(year);

    }

    public MyDate(String Date) {
        super();
        String[] dateParts = Date.split("\\s");
        this.month = checkMonth(dateParts[0]);
        this.day = checkDay(dateParts[1]);
        this.year = checkYear(dateParts[2]);
    }

    public static int checkDay(int Day) {
        if (Day < 1 || Day > 31) {
            System.out.println("ban da nhap sai ngay, moi nhap lai:");
            return -1;
        } else return Day;
    }

    public static int checkMonth(int month) {
        if (month < 1 | month > 12) {
            System.out.println("ban da nhap sai thang, moi nhap lai:");
            return -1;
        } else return month;
    }

    public static int checkYear(int year) {
        if (year < 0) {
            System.out.println("ban da nhap sai nam, moi nhap lai:");
            return -1;
        } else return year;
    }

    public static int checkDay(String Day) {
        int day = -1;
        if (Day.compareTo("1st") == 0) day = 1;
        else if (Day.compareTo("2nd") == 0) day = 2;
        else if (Day.compareTo("3rd") == 0) day = 3;
        else if (Day.compareTo("4th") == 0) day = 4;
        else if (Day.compareTo("5th") == 0) day = 5;
        else if (Day.compareTo("6th") == 0) day = 6;
        else if (Day.compareTo("7th") == 0) day = 7;
        else if (Day.compareTo("8th") == 0) day = 8;
        else if (Day.compareTo("9th") == 0) day = 9;
        else if (Day.compareTo("10th") == 0) day = 10;
        else if (Day.compareTo("11th") == 0) day = 11;
        else if (Day.compareTo("12th") == 0) day = 12;
        else if (Day.compareTo("13th") == 0) day = 13;
        else if (Day.compareTo("14th") == 0) day = 14;
        else if (Day.compareTo("15th") == 0) day = 15;
        else if (Day.compareTo("16th") == 0) day = 16;
        else if (Day.compareTo("17th") == 0) day = 17;
        else if (Day.compareTo("18th") == 0) day = 18;
        else if (Day.compareTo("19th") == 0) day = 19;
        else if (Day.compareTo("20th") == 0) day = 20;
        else if (Day.compareTo("21th") == 0) day = 21;
        else if (Day.compareTo("22th") == 0) day = 22;
        else if (Day.compareTo("23th") == 0) day = 23;
        else if (Day.compareTo("24th") == 0) day = 24;
        else if (Day.compareTo("25th") == 0) day = 25;
        else if (Day.compareTo("26th") == 0) day = 26;
        else if (Day.compareTo("27th") == 0) day = 27;
        else if (Day.compareTo("28th") == 0) day = 28;
        else if (Day.compareTo("29th") == 0) day = 29;
        else if (Day.compareTo("30th") == 0) day = 30;
        else if (Day.compareTo("31th") == 0) day = 31;
        else day = Integer.parseInt(Day);
        if (day < 1 || day > 31) {
            System.out.println("ban da nhap sai ngay, moi nhap lai:");
            return -1;
        } else return day;
    }

    public static int checkMonth(String Month) {
        int month = -1;
        if (Month.compareTo("January") == 0 || Month.compareTo("Jan.") == 0 || Month.compareTo("Jan") == 0
                || Month.compareTo("1") == 0) {
            return 1;
        } else if (Month.compareTo("February") == 0 || Month.compareTo("Feb.") == 0 || Month.compareTo("Feb") == 0
                || Month.compareTo("2") == 0) {
            return 2;
        } else if (Month.compareTo("Match") == 0 || Month.compareTo("Mar.") == 0 || Month.compareTo("Mar") == 0
                || Month.compareTo("3") == 0) {
            return 3;
        } else if (Month.compareTo("April") == 0 || Month.compareTo("Apr.") == 0 || Month.compareTo("Apr") == 0
                || Month.compareTo("4") == 0) {
            return 4;
        } else if (Month.compareTo("May") == 0 || Month.compareTo("May") == 0 || Month.compareTo("May") == 0
                || Month.compareTo("5") == 0) {
            return 5;
        } else if (Month.compareTo("June") == 0 || Month.compareTo("June") == 0 || Month.compareTo("Jun") == 0
                || Month.compareTo("6") == 0) {
            return 6;
        } else if (Month.compareTo("July") == 0 || Month.compareTo("Jul.") == 0 || Month.compareTo("Jul") == 0
                || Month.compareTo("7") == 0) {
            return 7;
        } else if (Month.compareTo("August") == 0 || Month.compareTo("Aug.") == 0 || Month.compareTo("Aug") == 0
                || Month.compareTo("8") == 0) {
            return 8;
        } else if (Month.compareTo("September") == 0 || Month.compareTo("Sep.") == 0 || Month.compareTo("Sep") == 0
                || Month.compareTo("9") == 0) {
            return 9;
        } else if (Month.compareTo("October") == 0 || Month.compareTo("Oct.") == 0 || Month.compareTo("Oct") == 0
                || Month.compareTo("10") == 0) {
            return 10;
        } else if (Month.compareTo("November") == 0 || Month.compareTo("Nov.") == 0 || Month.compareTo("Nov") == 0
                || Month.compareTo("11") == 0) {
            return 11;
        } else if (Month.compareTo("December") == 0 || Month.compareTo("Dec.") == 0 || Month.compareTo("Dec") == 0
                || Month.compareTo("12") == 0) {
            return 12;
        }
        if (month < 1 || month > 12) {
            System.out.println("ban da nhap sai thang, moi nhap lai:");
            return -1;
        } else return month;
    }

    public static int checkYear(String Year) {
        int year = Integer.parseInt(Year);
        if (year < 0) {
            System.out.println("ban da nhap sai nam, moi nhap lai:");
            return -1;
        } else return year;
    }

    public static int checkDate(int day, int month, int year) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day < 32)
            return 1;
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && day < 31)
            return 1;
        else if ((year % 4 != 0 || (year % 400 != 0 && year % 100 == 0)) && day == 29) {
            System.out.println("ngay thang nam cua ban nhap khong ton tai, moi nhap lai");
            return 0;
        } else if (day < 30) return 1;
        else {
            System.out.println("ngay thang nam cua ban nhap khong ton tai, moi nhap lai");
            return 0;
        }
    }

    public void accep() {
        do {
            System.out.println("mơi ban nhap ngay thang nam(ngay thang nam):");
            Scanner sc = new Scanner(System.in);
            String Date = sc.nextLine();
            String[] DatePath = Date.split("\\s");
            this.day = checkDay(DatePath[0]);
            this.month = checkMonth(DatePath[1]);
            this.year = checkYear((DatePath[2]));
//            System.out.println(this.day + "-" + this.month + "-" + this.year);
        }
        while (this.day == -1 || this.month == -1 || this.year == -1 || checkDate(this.day, this.month, this.year) == 0);
    }

    public void Print() {
        System.out.println(this.day + "-" + this.month + "-" + this.year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        this.day = checkDay(day);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = checkMonth(month);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = checkYear(year);
    }
    public  void printday(){
        System.out.println(this.day+"/"+this.month+"/"+this.year);
    }
}
