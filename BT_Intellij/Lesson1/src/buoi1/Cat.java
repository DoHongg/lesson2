package buoi1;

// lớp class là khuân mẫu để tạo ra các object có cùng thuộc tính và các tính năng
// object là ánh xạ giữa các đối tượng trong đời sống thực tế vào ngôn ngữ lập trình
// + properties: đại diện cho dữ liệu của object
// + method : đại diện cho chức năng của object
/*
    ví dụ : mèo
        các thuộc tính
            màu lông
            cân nặng
            chiều cao
       hành động :
            đi
            cào
            cắn
            bắt chuột

      Lớp (class): là khuôn mẫu để tạo ra các object (đối tượng) có cùng các thuộc tính và cac tính năng
 */
public class Cat {
    // các thuộc tính
    String ten;
    String maulong;
    int canNang;
    int chieuCao;

    //Các hành động
    void di(){
        System.out.println("Meo" + ten + " đang đi");
    }
    void cao(){
        System.out.println("Meo" + ten + " đang cào");
    }
    void batChuot(){
        System.out.println("Meo" + ten + " đang bắt chuột");
    }

    // là hàm chính để chạy đầu tiên tronng ngôn ngữ java
    public static void main(String[] args) {
        //tạo ra object từ lớp
        // cat meoNhaDuc: khai báo đói tượng với tên :meoNhaDuc
        // new cat():khởi tạo đối tượng meoNhaDuc bằng từ khóa new
        Cat meoNhaDuc = new Cat();
        meoNhaDuc.ten = "Mèo Đức"; //gán giá trị cho thuộc tính ten của đối tượng meoNhaDuc là : "Mèo Đức"
        meoNhaDuc.canNang = 100;  //gán giá trị cho thuộc tính canNang của đối tượng meoNhaDuc là : 100kg
        meoNhaDuc.batChuot(); //gọi tới hàm batChuot của đối tượng meoNhaDuc


        // cat meoNhaTruong: khai báo đói tượng với tên :meoNhaDuc
        // new cat():khởi tạo đối tượng meoNhaTruong bằng từ khóa new
        Cat meoNhaTruong = new Cat();
        meoNhaTruong.ten = "Mèo Trường";
        meoNhaTruong.canNang = 10;
        meoNhaTruong.batChuot();
    }
}
