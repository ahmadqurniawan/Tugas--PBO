import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PemilikSewa pemilik = new PemilikSewa();
        Scanner PemilikSewa = new Scanner(System.in);
        System.out.println("PETUGAS");
        System.out.print("Masukkan Nama  : ");
        pemilik.nama = PemilikSewa.nextLine();
        System.out.print("Masukkan NO HP : ");
        pemilik.no_tlpn = PemilikSewa.nextInt();

        Penyewa penyewa1 = new Penyewa();
        Scanner penyewa = new Scanner(System.in);
        System.out.println("PENYEWA");
        System.out.print("Masukkan Nama   : ");
        penyewa1.nama = penyewa.nextLine();
        System.out.print("Masukkan Alamat : ");
        penyewa1.alamat= penyewa.nextLine();
        System.out.print("Masukkan ID     : ");
        penyewa1.id_penyewa = penyewa.nextInt();
        System.out.print("Masukkan NO.HP  : ");
        penyewa1.no_tlpn = penyewa.nextInt();


        System.out.println("===========DATA PETUGAS===========");
        System.out.println("Nama Petugas : " + pemilik.getNama());
        System.out.println("No.Hp        : " + pemilik.getNo_tlpn());

        System.out.println("==========DATA PENYEWA============");
        System.out.println("Nama Penyewa :" + penyewa1.getNama());
        System.out.println("No ID        : " + penyewa1.getId_penyewa());
        System.out.println("No HP        : " + penyewa1.getNo_tlpn());
        System.out.println("Alamat       : " + penyewa1.getAlamat());

        Motor_Lama lama = new Motor_Lama();
        lama.Tipemotor();
        lama.insertdata();

        Motor_Baru baru = new Motor_Baru();
        baru.Tipemotor();
        baru.insertdata();

    }
}