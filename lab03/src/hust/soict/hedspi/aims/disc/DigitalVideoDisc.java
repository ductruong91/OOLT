package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
    //khai báo các thuộc tính
    private String title;
    private String category;
    private String director;
    private int lenght;
    private float cost;

    //2: các phương thức khởi tạo(constructer)
    //- nhiệm vụ của constructer: khởi tạo vùng nhớ
    // chứa thông tin của object c=và thiết lập/ gán giá trị
    // chứa các thuộc tính của object
    //- đặc điểm của constructer:
    //+tên của constructer trung với tên lớp
    //+ không có kiểu trả về,không dùng từ khóa void
    //-có thể xây dựng nhiều constructer theo nhiều cách khác nhau giúp khởi tạo đói tượng theo nhiều cách
    //2.1 constructer khong tham số

    public DigitalVideoDisc() {
        this.title = "";
        this.category = "";
        this.director = "";
        this.lenght = 0;
        this.cost = 0.0f;
    }

    //2.1 constructer cos 1 tham soos: creat DVD oject by title
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    //2.3 constructer cos 2 tham so
    public DigitalVideoDisc(String title, String category) {
        super();
        this.title = title;
        this.category = category;

    }

    public DigitalVideoDisc(String title, String category, String director, int lenght, float cost){
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.lenght = lenght;
        this.cost = cost;
    }

    //3: các phương thức  in thong tin cua doi tuong
    public void printInfor(){
//        System.out.println("-------DVD infor-------");
        System.out.println(this.title);
        System.out.println(this.category);
        System.out.println(this.director);
        System.out.println(this. lenght);
        System.out.println(this.cost);
    }


    public int search(String title){

        return 1;
    }
    //xây dựng các phương thức get set
    // 1: các phương thức get set
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
