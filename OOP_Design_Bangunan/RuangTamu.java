public class RuangTamu extends Ruangan {
    private boolean memilikiTelevisi;

    public RuangTamu(double panjang, double lebar, double tinggi, boolean memilikiTelevisi) {
        super(panjang, lebar, tinggi);
        this.memilikiTelevisi = memilikiTelevisi;
    }

    public boolean isMemilikiTelevisi() {
        return memilikiTelevisi;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ruang Tamu - Luas: " + hitungLuas() + " m^2, Volume: " + hitungVolume() + " m^3, Memiliki Televisi: " + (memilikiTelevisi ? "Ya" : "Tidak"));
    }
}
