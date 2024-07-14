public class DesainBangunan {
    public static void main(String[] args) {
        KamarTidur kamarTidur = new KamarTidur(4.5, 3.5, 3.1, 2);
        RuangTamu ruangTamu = new RuangTamu(6.0, 4.0, 3.0, true);
        Dapur dapur = new Dapur(5.1, 5.2, 3.1, true);
        Garasi garasi = new Garasi(6.1, 6.2, 4.0, 3);

        kamarTidur.displayInfo();
        ruangTamu.displayInfo();
        dapur.displayInfo();
        garasi.displayInfo();
    }
}
