import java.util.Scanner;
public class Gaji_bulanan {
    public static void main(String ags[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan Nama:");
        String nama=input.next();
        
        
       System.out.println("Bilangan Jam Sehari Tidak Melebihi 9 Jam:");
        int jam=input.nextInt();
        
        if(jam>9);
        {
            System.out.println("Bilangan jam sehari tidak boleh melebihi 9 jam, sila masukkan bilangan yang betul");
        }
        System.out.println(" Bilangan Hari Tidak Melebihi 30hari:");
          int bil_hari=input.nextInt();
          {
          if(bil_hari>30);
          {
            System.out.println("Bilangan Hari Pekerja Tidak Boleh Melebihi 30 hari:");
          }
         
          System.out.println("Bilangan Jam Tidak Melebihi 50 Jam:");
          int bil_jam_ot=input.nextInt();
          {
          if(bil_jam_ot>50);
          {
           System.out.println("Bilangan Jam Kerja Lebih Masa Tidak Boleh Melebihi 50 Jam, Sila Masukan Jam Betul:");
          }
          
         int gaji=(jam*bil_hari*20)+(bil_jam_ot*15);
         
         System.out.println("Rumusan Gaji Bulanan="+nama);
         System.out.println("Jumlah Jam Pekerja="+jam+"jam");
         System.out.println("Jumlah Hari Bekerja="+bil_hari);
         System.out.println("Jumlah Jam Lebih Masa="+bil_jam_ot);
         System.out.println("JUMLAH GAJI:RM"+gaji);
         }
    
    }
}
}