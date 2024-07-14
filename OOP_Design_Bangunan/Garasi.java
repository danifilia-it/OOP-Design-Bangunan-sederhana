public class Garasi extends Ruangan {
    private int  jumlahMobil;

    public Garasi(double panjang, double lebar, double tinggi, int jumlahMobil) {
        super(panjang, lebar, tinggi);
        this.jumlahMobil = jumlahMobil;
    }
    public int getJumlahMobil() {
        return jumlahMobil;
    }
    @Override
    public void displayInfo() {
        System.out.println("Garasi - Luas: " + hitungLuas()+ "m^2, VOlume: " + hitungVolume() + "m^3, Jumlah Mobil: " + getJumlahMobil());
    }
    
}
