
package akillicihaz;
import java.util.Scanner;
import java.io.*;
import java.sql.*;
/*
*
* @author omarg
*
*/
public class KullaniciDogrula {
    int dogrulama_degisken=0;
public int Dogrula(String x, String y)
{
    
    
    try
        {   /***** Bağlantı kurulumu *****/
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/database_1",
                    "postgres", "exumax542ur");
            if (conn != null)
                System.out.println("\n**************************************************\nVeritabanına bağlandı!\n**************************************************\n");
            else
                System.out.println("Bağlantı girişimi başarısız!");


            String sql= "SELECT \"Kadi\", \"Sifre\"  FROM \"Kullanici\"";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            conn.close();

            String kullaniciAdi = null;
            String sifre=null;

            while(rs.next())
            {
                
                /***** Kayda ait alan değerlerini değişkene ata *****/
                kullaniciAdi = rs.getString("Kadi");
                sifre = rs.getString("Sifre");
                if(kullaniciAdi.equals(x) && sifre.equals(y))
                {
                    dogrulama_degisken=1;
                    System.out.println("\n**************************************************\nKullanıcı doğrulama başarılı\n**************************************************\n");
                }
            }
            if(dogrulama_degisken == 0)
            {
                System.out.println("\n------------!!!!---------------------!!!!---------\nHatalı giriş lütfen programı tekrar baslatın\n------------!!!!---------------------!!!!---------\n");

            }
            /***** Kaynakları serbest bırak *****/
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    return dogrulama_degisken;
    }
}