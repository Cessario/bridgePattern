public class Client {
    public static void main(String[] args) {
        testPesanan(new pesananMakanan());

    }

    public static void testPesanan(Pesanan pesanan) {
        buatMakanan buatmakanan = new buatMakanan(pesanan);
        buatmakanan.statusPesan();
        pesanan.printStatus();

        buatMakananselesai bMKNs = new buatMakananselesai(pesanan);
        bMKNs.statusPesan();
        bMKNs.persenTambah();
        bMKNs.selesai();
        pesanan.printStatus();


    }
}
