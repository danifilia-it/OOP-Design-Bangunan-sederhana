public class Dapur extends Ruangan {
    private boolean memilikiKompor;

    public Dapur(double panjang, double lebar, double tinggi, boolean memilikiKompor) {
        super (panjang, lebar, tinggi);
        this.memilikiKompor = memilikiKompor;
    }

    public boolean isMemilikiKompor() {
        return memilikiKompor;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Dapur - Luas: " + hitungLuas() + "m^2, Volume :" + hitungVolume() + "m^3, Memiliki Kompor: " + (memilikiKompor? "Ya" : "Tidak"));
    }
}
