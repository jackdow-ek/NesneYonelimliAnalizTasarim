package akillicihaz;
/**
 *
 * @author omarg
 */
public class Eyleyici {
    private static Eyleyici eyleyici = new Eyleyici();//singleton yapısı
    private Eyleyici()
    {
    }
    public static Eyleyici getSingleton()
    {
        return eyleyici;
    }
    
    
    
    private String sogutucu_durum;
    public String sogutucuAc()
    {
        sogutucu_durum="ACIK";
        return sogutucu_durum;
    }
    public String sogutucuKapa()
    {
        sogutucu_durum ="KAPALI";
        return sogutucu_durum;
    }
    public String getSogutucuDurum()
    {
        return this.sogutucu_durum;
    }
}
