public class pesananMakanan implements Pesanan{
    private boolean selesai = false;
    private int persen = 90;
    private int noMeja = 2;

    @Override
    public boolean sedangProses() {
        return selesai;
    }

    @Override
    public void pesanProses() {
        selesai = false;

    }

    @Override
    public void pesanSelesai() {
        selesai = true;

    }

    @Override
    public int getPerporses() {
        return persen;
    }

    @Override
    public void setPerproses(int persen) {
        if (persen > 100) {
            this.persen = 100;
        } else if (persen < 0) {
            this.persen = 0;
        } else {
            this.persen = persen;
        }

    }

    @Override
    public int getNomorpesan() {
        return noMeja;
    }

    @Override
    public void setNomorpesan(int nomorpesan) {
        this.noMeja = noMeja;

    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| Pesanan Makanan.");
        System.out.println("| Status Pesanan : " + (selesai ? " Sedang Proses " : " Selesai "));
        System.out.println("| proses Pesanan " + persen + "%");
        System.out.println("| Nomor Meja " + noMeja);
        System.out.println("------------------------------------\n");

    }
}
