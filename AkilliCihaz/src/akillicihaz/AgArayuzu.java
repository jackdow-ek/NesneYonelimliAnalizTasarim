/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akillicihaz;
import java.util.Scanner;
/**
 *
 * @author omarg
 */
public class AgArayuzu {
    
    private static AgArayuzu ag_arayuzu = new AgArayuzu();
    private AgArayuzu()
    {
    }
    public static AgArayuzu getSingleton()
    {
        return ag_arayuzu;
    }
    
    Scanner scan = new Scanner(System.in);
    int secim,secim_2;
    String x;
    String y;
    public String dogrula_menu1()
    {
        System.out.print("\n\n**************************************************\nKullanıcı Adını girin..........:");x = scan.next();
        return x;
    }
    public String dogrula_menu2()
    {
        System.out.print("Kullanıcı Şifresini girin......:");y = scan.next();System.out.println("\n**************************************************\n");
        return y;
    }
    
    public int menu_1(int x)
    {
        System.out.println("\n**************************************************\n\n\nSicaklik Degeri............: "+x 
                + "\nSogutucu Durumu............: Beklemede\n\n[1] Sogutucuyu Ac\n[2] Sogutucuyu Kapat\nSogutucu Durumunu secin.(1/2)\n**************************************************\n");
        secim = scan.nextInt();
        return secim;
    }
    public int menu_2(int x, String s)
    {
        System.out.println("\n**************************************************\n\nSicaklik Degeri............: "+ x + "\nSogutucu Durumu............: " + s + "\n\n[1]Oturumu Kapat\n[2]Tekrar Ölç\n[3]Sogutucu Durumu Degistir\nYapilacak islemi secin.(1/2/3)\n**************************************************\n");
        secim_2 = scan.nextInt();
        return secim_2;
    }
}
