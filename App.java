import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        sapi[] kandangsSapi = new sapi[999999];
        int jumlahsapijantan = 0,
                jumlahsapibetina = 0,
                jumlahserigalajantan = 0,
                jumlahserigalabetina = 0;
        ArrayList<serigala> kandangserigala = new ArrayList<>();
        int indexsapi = 0;
        int arr = 0;
        boolean val;

    
  

               
             

    

                for (sapi sapi : kandangsSapi) {
                    sapi.TambahUsia();
                    if (sapi.MatiUsia() == true) {
                        if (sapi.jkSapi == true) {
                            System.out.println("sapi " + sapi.getNourut() + " betina telah meninggal");
                            if (jumlahsapibetina <= 0) {
                                jumlahsapibetina = 0;
                            } else {
                                jumlahsapibetina--;
                            }
                        } else {
                            if (jumlahsapijantan <= 0) {
                                jumlahsapijantan = 0;
                            } else {
                                jumlahsapijantan--;
                            }
                            System.out.println("sapi " + sapi.getNourut() + " jantan telah meninggal");
                        }
                    }
                    if (sapi.getSubur() == true) {
                        boolean temp = new Random().nextInt(100) == 60;
                        if (temp == true) {
                            sapi= new sapi(indexsapi, true);
                            jumlahsapibetina++;
                        } else {
                            sapi = new sapi(indexsapi, false);
                            jumlahsapijantan++;
                        }
                        
                    }
                   
                    
                }
                
               
            }

        }

    

