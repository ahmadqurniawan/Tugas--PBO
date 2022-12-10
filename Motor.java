public abstract class Motor {
    public abstract int Hargasewa(int lamasewa);

    public void sewamotor(int lamasewa) {
        int hargasewa = Hargasewa(lamasewa);
        System.out.println("Harga sewa motor: " + hargasewa);
    }
}
