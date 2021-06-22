class Main {
    /* 
        Nama : Andrean Hartanto
        Studentid : 03082200005
    */
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Jodi", "03082200006", false);
        Matakuliah mtk1 = new Matakuliah("Database", "ISYS6175", 4);

        Matakuliah mtk2 = new Matakuliah("PBO", "ISYS1145", 2);
        Matakuliah mtk3 = new Matakuliah("User Experience", "ISYS6523", 4);

        KartuHasilStudi khs = new KartuHasilStudi(mhs, 3);

        khs.tambahkanNilai(mtk1, 'A');
        khs.tambahkanNilai(mtk2, 'C');
        khs.tambahkanNilai(mtk3, 'D');    

        khs.tampilkanKhs();
    }
}