public class Motor_Baru extends Motor{
        int harga;
        String tipe_motor;
        String lama_sewa;

        public Motor_Baru(String id_sewa) {
            super(id_sewa);
        }

        @Override
        public void Motor_Lama() {
            System.out.println("1. Yamaha Nmax, 5000000/minggu");
            System.out.println("2. Honda PCX, 6000000/minggu");
            System.out.println("3. Kawasaki ZX-25R, 10000000/minggu");
        }

        @Override
        public int total(int harga, int lama_sewa) {
            return harga * lama_sewa;
        }

        public int getHarga() {
            return harga;
        }

        public void setHarga(int harga) {
            this.harga = harga;
        }

        public String getTipe_motor() {
            return tipe_motor;
        }

        public void setTipe_motor(String tipe_motor) {
            this.tipe_motor = tipe_motor;
        }

        public String getLama_sewa() {
            return lama_sewa;
        }

        public void setLama_sewa(String lama_sewa) {
            this.lama_sewa = lama_sewa;
        }
    }

