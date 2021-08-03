public interface Pesanan {

        boolean sedangProses();

        public void pesanProses();

        public void pesanSelesai();

        int getPerporses();

        void setPerproses(int perproses);

        int getNomorpesan();

        void setNomorpesan(int nomorpesan);

        void printStatus();

}
