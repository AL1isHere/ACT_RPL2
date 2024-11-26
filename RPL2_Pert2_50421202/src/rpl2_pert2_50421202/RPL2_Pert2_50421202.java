package rpl2_pert2_50421202;

public class RPL2_Pert2_50421202 {
    
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.setName("Arifin");
        mahasiswa.setNpm("50421202");
        mahasiswa.setClassNumber("4IA06");
        mahasiswa.setBirthYear(2003);
        mahasiswa.setAlamat("Depok");
        
        System.out.println(mahasiswa.toString());
    }
    
}
