public class Motor_Lama extends Motor {
    // Harga sewa motor per hari
    private int hargaPerHari = 10000;

    // Method untuk menghitung harga sewa motor per hari
    @Override
    public int Hargasewa(int lamasewa) {
        return lamasewa * hargaPerHari;
    }
}