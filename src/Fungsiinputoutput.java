import java.util.Scanner;

public class Fungsiinputoutput {
    public static void main(String[] args){//args yaitu parameter dari string dan ini yang umum yg biasa dipakai
        //untuk membaca apa yang kita masukan kita memakai scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Penjumlahan sederhana");
        System.out.print("Masukan angka pertama :");
        int value1 = scanner.nextInt();//nextInt untuk menangkap datanya dan ini harus integer datanya
        System.out.print("Masukan angka kedua :");
        int value2 = scanner.nextInt();
        int hasil = value1 + value2 ;
        System.out.println("Hasilnya adalah :" +hasil);


    }
}
