package akillicihaz;
import java.io.*;
import java.util.Scanner;
/**
 * @author omarg
 */
public class MerkeziIslem {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Eyleyici eyleyici = Eyleyici.getSingleton();
        SicaklikAlgilayici sicaklikAlgila = SicaklikAlgilayici.getSingleton();
        AgArayuzu agArayuzu = AgArayuzu.getSingleton();
        
        KullaniciDogrula kullaniciDogrula = new KullaniciDogrula();
        int dongu=1,durum=0;
        
        
        agArayuzu.dogrula_menu1();
        agArayuzu.dogrula_menu2();
        kullaniciDogrula.Dogrula(agArayuzu.x, agArayuzu.y);
        
        if(kullaniciDogrula.dogrulama_degisken!=0)
        {
            sicaklikAlgila.SicaklikOku();
        int x = sicaklikAlgila.getSicaklik(); 
        agArayuzu.menu_1(x);
        do{
            if(agArayuzu.secim_2==2){
                sicaklikAlgila.SicaklikOku();
                x = sicaklikAlgila.getSicaklik(); 
            }
        if(agArayuzu.secim==1){
            eyleyici.sogutucuAc();
            agArayuzu.menu_2(x, eyleyici.getSogutucuDurum());
            durum = 1;
        }
        else{
            eyleyici.sogutucuKapa();
            agArayuzu.menu_2(x, eyleyici.getSogutucuDurum());
            durum = 2;
        }
        if(agArayuzu.secim_2==3)
        {
            if(durum == 1){
                eyleyici.sogutucuKapa();
                agArayuzu.menu_2(x, eyleyici.getSogutucuDurum());
            }
            else{
                eyleyici.sogutucuAc();
                agArayuzu.menu_2(x, eyleyici.getSogutucuDurum());
            }
        }
        else if(agArayuzu.secim_2==1){
            dongu=0;
        }
        }while(dongu!=0);
        }
        
    }
}