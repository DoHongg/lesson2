package buoi2;

import java.util.Scanner;

/*
    1.3. Lênh gán và biểu thức gán
        cấu trúc:
            biến = biểu thức

    1.4. Hằng (constant)
        + là một biến đặc biệt có giá trị không thể tahy đổi sau khởi tạo
        + chỉ đc gán giá trị cho hằng 1 lần duy nhất
        + sử dụng t khóa final để khai báo biến hằng
        + tên của hằng là các từ viết hoa cách nhau bằng "_"
        + cấu trúc:
            final datatype NAME_CONSTANT = value;
        vd: final int PI=3.14
            khai báo hằng PI với dữ liệu int, giá trị 3.14

    2. Kiểu dữ liệu trong java
        2.1. Bit
            - là một đơn vị đếm nhỏ nhất trong hệ thống xử lý với CPU
            - 1 bit có thể biểu diễn 2 giá trị 0,1 đại diện cho trạng thái bật, tắt

        tại sao bit lại có thể biểu diễn đc miền giá trị???
            vd: 8 dưới dạng bit
            3 bit => 2^3 = 8
            000,001,011,111,110,101,010,100

        Các kiểu dữ liệu nguyên thủy
        2.2.
          - Kiểu số nguyên
            byte: 8bit -> miền giá trị -128 - 128
            short: 16bit -> miền giá trị -32,768 - 32,767
            int: 32bit -> miền giá trị -2^31 - 2^31
            long: 64bit -> miền giá trị -2^63 - 2^63-1
          - Kiểu số thực
            float: 32bit, có thể lưu trữ được số thực với dấu "," động với giá trị tương đối
                vd: 3.14
            double: 64bit, có thể lưu trữ số thực với độ chính xác cao hơn
          - Kiểu kí tự
            char: 16bit, lưu trữ 1 ký tự trong bảng unicode
          - Kiểu boolean
            boolean: 1bit, lưu trữ giá trị true hoặc false

        Ép kiểu trong Java

        3. Các toán tử
            3.1. Toán tử số học
                "+": cộng hai số, cộng hai chuỗi
                "-": trừ 2 số
                "*": nhân 2 số
                "/": chia lấy nguyên
                "%": chia lấy dư

            3.2.
                toán tử gán "="
                toán tử gán rút gọn
                    +=: gán giá trị cộng cho biến vế phải toán tử
                        vd: i += 8 <=> i = i + 8
                    -=: gán giá trị trừ cho biến vế phải toán tử
                    *=: gán giá trị nhân cho biến vế phải toán tử
                    /=: gán giá trị chia cho biến vế phải toán tử

           3.3. Toán tử so sánh
                >: so sánh lớn hơn
                <: so sánh nhỏ hơn
                ==: so sánh bằng
                <=: nhỏ hơn hoặc bằng
                >=: lớn hơn hoặc bằng

           3.4. Toán tử logic
            & (AND): trả về true khi cả 2 điều kiện đúng
                &&:
                condition1 & condition2 => luôn ktra cả 2 condition1 và condition2
                condition1 && condition2 => luôn ktra cả 2 condition1 và condition2
            | (OR): trả về true khi 1 trong 2 điều kiện đúng
                ||:
                condition1 | condition2 => luôn ktra cả 2 condition1 và condition2 => 1 trong 2 giá trị trả về đúng
                condition1 || condition2 => nếu ktra condition1 = true => dừng ktra condition2 => return true
            ! (NOT): đảo ngược giá trị của điều kiện

            3.5. Toán tử ba ngôi
                cấu trức :
                    result = (condition ) ? value 1 : value 2
                    result : kết quả của biểu thức
                    condition : điều kiện trả về giá trị
                        nếu condition = true => trả về value 1
                        nếu condition = false => trả về value 2

           3.6. Toán tử tăng giảm
                tăng
                    x++: tăng 1 giá trị cho x sau khi chạy qua dòng lệnh
                    ++x: tăng 1 giá trị cho x trước khi chạy qua dòng lệnh
                giảm
                    x--: giảm 1 giá trị của x sau khi chạy qua dòng lệnh
                    --x: giảm 1 giá trị của x trước khi thực thi dòng lệnh

        4. Ép kiểu
            ép kiểu tường minh
                + quá trình thực hiện ép kiểu sử dụng cú pháp ép kiểu

                    result = (datatype) value
                    result: kết quả sau khi ép kiểu
                    datatype: kiểu dữ liệu mong muốn ép về
                    value: giá trị được ép kiểu
                        vd: int a = 10;
                            float b = (float) a;
                            => chuyển giá trị 10 của biến a với kểu dữ liệu int lên kiểu float cho biến b
            ép kiểu ngầm định
                + quá trình Java tự động ép kiểu và không cần sự can thiệp của lập trình viên
                    vd:
                        int a = 10;
                        float b = a;
                        => Java tự động chuyển giá trị của a từ kiểu dữ liệu int về kiểu dữ liệu float và gán cho b
       git:
            phần mềm mã nguồn mở hỗ trợ quản lý source code và các version của file
            tại sao cần git:
                + tổng hợp code và các chức năng của các thành viên trong dự án
                + quản lý các version code giúp tránh trường hợp mất code
            các nền tảng git
                github
                gitlab
                SVN
                bitbucket
           các bước sử dụng git
                + download git
                + tạo tài khiển github
                + quy trình
                giảng viên
                    tạo repository trên github
                    đưa tài liệu len github

                học viên:
                    pull repository từ hithub
                    lấy tài liệu ra
                push code:
                    - add file : git add
                    - commit code:

*/
public class main {
    public static void main(String[] args) {
        int a;
        a = 0; //sử dụng dấu "=" làm lệnh gán giá trị cho biến a
        a = 1 * 10; //sử dụng dấu "=" gán giá trị biêu thức cho biến a

        final String NAME_SCHOOL = "Đại học thuong mại"; //khai baáo biến hằng tên "NAME_SCHOOL" , kểu dữ liệu String, giá trị "Đại học thương mại"
        System.out.println(NAME_SCHOOL);
//        NAME_SCHOOL = "a"; lỗi khi gán lại giá trị cho hằng số

        float pi = 3.14F;
        long longValue = 20;
//        char a = 'A';
        float test;long testLong;


        int soA = 10;
        soA = soA + 1;
        soA+=1;


        // ví dụ toán tử 3 ngôi : kiểm tra số chẵn lẻ khi người dùng nhập vào
        // câu lệnh khai cáo đối tượng nhận dữ liệu từ input console
        Scanner sc = new Scanner(System.in);
        // câu lệnh hiển thị text nhp vào 1 giá trị : trên console
        System.out.println("Nhập vào 1 giá trị : ");
        // câu lệnh thu thập input từ console
        int n = sc.nextInt();
        // toán tử ba ngôi
        String result = ( n % 2 == 0 ) ? " Đây là số chẵn " : " Đây là số lẻ ";
        // hiển thị trn console
        System.out.println(result);


        float numberFloat = 10;
        int numberInt = 20;
        float total = numberInt + numberFloat;
        System.out.println(total);
    }
}
