package akillicihaz;
import java.io.*;
import java.util.Random;
/**
 *
 * @author omarg
 */
public class SicaklikAlgilayici {
    
    private static SicaklikAlgilayici sa = new SicaklikAlgilayici();//singleton yapısı
    private SicaklikAlgilayici()
    {
    }
    public static SicaklikAlgilayici getSingleton()
    {
        return sa;
    }
    
    
    private int sicaklik_deger;
    public int SicaklikOku()//rastgele olarak bir sicaklik degeri üretilir
    {
        Random rand = new Random();
        sicaklik_deger = rand.nextInt(50); 
        return sicaklik_deger;
    }
    public int getSicaklik()
    {
        return this.sicaklik_deger;
    }
}
