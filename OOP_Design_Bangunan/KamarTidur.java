public class KamarTidur extends Ruangan {
    private int jumlahJendela;

    public KamarTidur(double panjang, double lebar, double tinggi, int jumlahJendela) {
        super(panjang, lebar, tinggi);
        this.jumlahJendela = jumlahJendela;
    }

    public int getJumlahJendela() {
        return jumlahJendela;
    }

    @Override
    public void displayInfo() {
        System.out.println("Kamar Tidur - Luas: " + hitungLuas() + " m^2, Volume: " + hitungVolume() + " m^3, Jumlah Jendela: " + getJumlahJendela());
    }
}
