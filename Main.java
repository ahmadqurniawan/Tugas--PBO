import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PemilikSewa pemilik = new PemilikSewa();
        Scanner PemilikSewa = new Scanner(System.in);
        System.out.println("PETUGAS");
        System.out.println("Masukkan Nama = ");
        pemilik.nama = PemilikSewa.nextLine();
        System.out.println("Masukkan NO HP = ");
        pemilik.no_tlpn = PemilikSewa.nextInt();

        Penyewa penyewa1 = new Penyewa();
        Scanner penyewa = new Scanner(System.in);
        System.out.println("PENYEWA");
        System.out.println("Masukkan Nama = ");
        penyewa1.nama = penyewa.nextLine();
        System.out.println("Masukkan ID  = ");
        penyewa1.id_penyewa = penyewa.nextInt();
        System.out.println("Masukkan NO HP = ");
        penyewa1.no_tlpn = penyewa.nextInt();
        System.out.println("Masukkan Alamat Anda = ");
        penyewa1.alamat = penyewa.nextLine();

        System.out.println("DATA PETUGAS");
        System.out.println("Nama Petugas = " +pemilik.getNama());
        System.out.println("No.Hp : " +pemilik.getNo_tlpn());
        System.out.println("==========DATA PENYEWA===========");
        System.out.println("Nama Penyewa = " +penyewa1.getNama());
        System.out.println("No ID = " +penyewa1.getId_penyewa());
        System.out.println("No HP = " +penyewa1.getNo_tlpn());
        System.out.println("Alamat = " +penyewa1.getAlamat());

        Motor motor1 = new Motor("1,2");
        Scanner Motor = new Scanner(System.in);


        Motor cek1 = new Motor_Lama("1");
        Motor_Lama Ml = new Motor_Lama("1");
        Scanner Motor_Lama = new Scanner(System.in);
        System.out.println("DAFTAR MOTOR LAMA = "+cek1.getId_sewa());
        cek1.Motor_Lama();
        System.out.println("Pilih motor Sesuai Dengan Yang Anda Inginkan = ");


        Motor cek2 = new Motor_Baru("2");
        Motor_Baru MB = new Motor_Baru("2");
        Scanner Motor_Baru = new Scanner(System.in);
        System.out.println("DAFTAR MOTOR BARU = "+cek2.getId_sewa());
        cek2.Motor_Baru();
        System.out.println("Pilih motor Sesuai Dengan Yang Anda Inginkan = ");
    }
}