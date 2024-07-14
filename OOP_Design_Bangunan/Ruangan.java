public abstract class Ruangan {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Ruangan(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public abstract void displayInfo();
}
