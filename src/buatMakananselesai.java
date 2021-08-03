public class buatMakananselesai extends buatMakanan{
    public buatMakananselesai(Pesanan pesanan) {
        super.pesanan = pesanan;
    }

    public void selesai() {
        System.out.println("Pesanan: Selesai");
        pesanan.setPerproses(10);
    }
}
