public class buatMakanan implements Koki{
    protected Pesanan pesanan;

    public buatMakanan() {}

    public buatMakanan(Pesanan pesanan) {
        this.pesanan = pesanan;
    }


    @Override
    public void statusPesan() {
        System.out.println("Status: Aktif");
        if (pesanan.sedangProses()) {
            pesanan.pesanProses();
        } else {
            pesanan.pesanSelesai();
        }

    }

    @Override
    public void persenTambah() {
//        System.out.println("Proses: Tambah");
        pesanan.setPerproses(pesanan.getPerporses() + 10);

    }

    @Override
    public void persenKurang() {
//        System.out.println("Proses: Kurang");
        pesanan.setPerproses(pesanan.getPerporses() - 10);

    }

    @Override
    public void nomorPesantambah() {
        System.out.println("Pesanan: Tambah Pesan");
        pesanan.setNomorpesan(pesanan.getNomorpesan() + 1);

    }

    @Override
    public void nomorPesankurang() {
        System.out.println("Pesanan: Kurang Pesan");
        pesanan.setNomorpesan(pesanan.getNomorpesan() - 1);

    }
}
