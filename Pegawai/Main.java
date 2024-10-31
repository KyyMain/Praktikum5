package Pegawai;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Manager
        Manager manager = new Manager("agus",1500000,5000000);
        manager.cetakInfo();
        System.out.println();

        // Membuat objek Programmer
        Programmer programmer = new Programmer("Pian",2000000,5000000);
        programmer.cetakInfo();
    }
}
