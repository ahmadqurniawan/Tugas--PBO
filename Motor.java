public class Motor {
    String id_sewa;
    String jenis_motor;

    public int total(int harga, int lama_sewa) {
        System.out.println("-");
        return 0;
    }

    public void Motor_Lama(){
        System.out.println("Anda akan menyewa motor lama dengan tipe = ");
    }
    public void Motor_Baru(){
        System.out.println("Anda akan menyewa motor baru dengan tipe = ");
    }

    public Motor(String id_sewa) {
        this.id_sewa = id_sewa;
    }

    public void setId_sewa(String id_sewa) {
        this.id_sewa = id_sewa;
    }

    public String getId_sewa() {
        return id_sewa;
    }

    public String getjenis_motor() {
        return jenis_motor;
    }

    public void setjenis_motor(String jenis_motor) {
        this.jenis_motor = jenis_motor;
    }
}
