
import java.util.Random;
import java.util.Scanner;

public class looping {
    int waktusapi,
    waktuserigalamasuk,
            jumlahsapibetina = 0,
            jumlahsapijantan = 0,
            totalsapi = 0,
            jumlahserigalabetina = 0,
            jumlahserigalajantan = 0,
            totalserigala = 0,
            usia123sapi = 0,
            usia45sapi = 0,
            usia6 = 0;
    sapi[] kandangsapi = new sapi[99999];
    serigala[] kandangserigala = new serigala[99999];
    Scanner iScanner = new Scanner(System.in);

    public looping() {
        System.out.println("masukkan tahun = ");
        int waktusapi = iScanner.nextInt();
    
        jumlahsapi();
        jumlahserigala();
        for (int i = 0; i <= waktusapi; i++) {
            System.out.println("====== tahun ke " + i + " =======");
         
            puterinsapi();
            probmati();
            if (i>=waktuserigalamasuk) {
                puterinserigalanya();
                serigalaMakanSapi();
                
            }
            disp();
        }
    }

    private void serigalaMakanSapi() {

        for (int j = 1; j <= totalsapi; j++) {
            if (kandangsapi[j].getLive() && kandangsapi[j].getUsia() == 0) {
                for (int k = 1; k <= totalserigala; k++) {
                    if (kandangserigala[k].getLive() && kandangserigala[k].getUsiaSerigala() > 0
                            && kandangserigala[k].getdahmaem() == false && kandangsapi[j].getJatahDimakan() > 0) {
                        kandangserigala[k].makanSapi(kandangsapi[j].getNourut());
                        kandangserigala[k].switchDahmaem();
                        kandangsapi[j].kurangJatahDimakan();
                    kandangsapi[j].ubahdimakan();
                    }

                }
            }
        }
        
        for (int i = 1; i <= totalsapi; i++) {
            if (kandangsapi[i].getdahdimaem()==true) {
              kandangsapi[i].setmati();
                sapimati(i);  
                
            } 
        }
int totalsem = totalserigala;
        for (int j = 1; j <= totalsem; j++) {
            if (kandangserigala[j].getLive() && kandangserigala[j].getUsiaSerigala() > 0
                    && kandangserigala[j].getdahmaem() == false) {
                kandangserigala[j].setmati();
                if (kandangserigala[j].getjkboolean()) {
                    System.out.println("Serigala Betina (" + kandangserigala[j].getNourut() + ") mati kelaparan");
                } else {

                    System.out.println("Serigala Jantan (" + kandangserigala[j].getNourut() + ") mati kelaparan");

                }

                serigalamati(j);
            }
        }
    }

    public void probmati() {
        if (this.usia123sapi >= 100) {
            for (int i = 0; i < 7; i++) {
                for (int j = 1; j <= totalsapi; j++) {
                    if (kandangsapi[j].getLive() == true) {
                        if (kandangsapi[j].getUsia() > 0 && kandangsapi[j].getUsia() < 4) {
                            System.out.println("sapi " + kandangsapi[j].getNourut() + kandangsapi[j].getJkString()
                                    + "telah meninggal di usia " + kandangsapi[j].getUsia());
                            sapimati(j);
                            kandangsapi[j].setmati();
                            break;
                        }
                    }
                }
            }
        }
        if (this.usia45sapi >= 100) {

            for (int i = 0; i < 15; i++) {
                for (int j = 1; j <= totalsapi; j++) {
                    if (kandangsapi[j].getLive() == true) {
                        if (kandangsapi[j].getUsia() > 3 && kandangsapi[j].getUsia() < 6) {
                            System.out.println("sapi " + kandangsapi[j].getNourut() + kandangsapi[j].getJkString()
                                    + "telah meninggal di usia " + kandangsapi[j].getUsia());
                            sapimati(j);
                            kandangsapi[j].setmati();
                            break;
                        }
                    }
                }
            }
        }

        if (this.usia6 >= 100) {

            for (int i = 0; i < 20; i++) {
                for (int j = 1; j <= totalsapi; j++) {
                    if (kandangsapi[j].getLive() == true) {
                        if (kandangsapi[j].getUsia() == 6) {
                            System.out.println("sapi " + kandangsapi[j].getNourut() + kandangsapi[j].getJkString()
                                    + "telah meninggal di usia " + kandangsapi[j].getUsia());
                            sapimati(j);
                            kandangsapi[j].setmati();
                            break;
                        }
                    }
                }
            }
        }
    }

    public void jumlahsapi() {
        System.out.println("masukkan sapi jantan  = ");
        int temp = iScanner.nextInt();

        for (int i = 1; i <= temp; i++) {
            this.jumlahsapijantan++;
            this.totalsapi++;
            kandangsapi[totalsapi] = new sapi(totalsapi, false);
        }
        System.out.println("masukkan sapi betina  = ");
        temp = iScanner.nextInt();
        for (int i = 1; i <= temp; i++) {
            this.jumlahsapibetina++;
            this.totalsapi++;
            kandangsapi[totalsapi] = new sapi(totalsapi, true);

        }
    }

    public void disp() {
        System.out.println("---------------------------");
        System.out.println("jumlah sapi betina = " + jumlahsapibetina);
        System.out.println("jumlah sapi jantan = " + jumlahsapijantan);
        System.out.println("jumlah semua sapi  = " + totalsapi);
        System.out.println("jumlah serigala jantan = " + jumlahserigalajantan);
        System.out.println("jumlah serigala betina = " + jumlahserigalabetina);
        System.out.println("jumlah semua serigala  = " + totalserigala);

    }

    public void jumlahserigala() {

        
        System.out.println("masukkan waktu serigala masuk = ");
        waktuserigalamasuk = iScanner.nextInt();
        
        System.out.println("masukkan serigala jantan = ");
        int temp = iScanner.nextInt();
        for (int j = 1; j <= temp; j++) {
            jumlahserigalajantan++;
            this.totalserigala++;
            kandangserigala[totalserigala] = new serigala(false, totalserigala);
        }
        System.out.println("masukkan serigala betina = ");
        temp = iScanner.nextInt();
        for (int j = 1; j <= temp; j++) {
            jumlahserigalabetina++;
            totalserigala++;
            kandangserigala[totalserigala] = new serigala(true, totalserigala);
        }

    }

    public void puterinsapi() {

        int totalsem = totalsapi;

        for (int j = 1; j <= totalsem; j++) {
            if (kandangsapi[j].getLive() == true) {

                if (kandangsapi[j].getLive() == true) {

                    kandangsapi[j].MatiUsia();
                    if (kandangsapi[j].getLive() == true) {
                        if (kandangsapi[j].getSubur() == true) {
                            boolean tes = new Random().nextInt(10) <= 6;
                            if (tes == true) {
                                totalsapi++;
                                kandangsapi[totalsapi] = new sapi(totalsapi, true, j);
                                jumlahsapibetina++;
                            } else {
                                totalsapi++;
                                kandangsapi[totalsapi] = new sapi(totalsapi, false, j);
                                jumlahsapijantan++;
                            }
                        }
                  
                        if (kandangsapi[j].getUsia() < 4) {
                            usia123sapi++;
                        } else if (kandangsapi[j].getUsia() > 3 && kandangsapi[j].getUsia() < 6) {
                            usia45sapi++;
                        } else {
                            usia6++;
                        }
                    } else {
                        sapimati(j);
                    }

                }
            }
        }
        for (int i = 1; i <= totalsem; i++) {
            if (kandangsapi[i].getLive()){

                kandangsapi[i].TambahUsia();
            }
        }
    }
    
    public void puterinserigalanya() {
        int totalsem = totalserigala;
        for (int i = 1; i <= totalsem; i++) {
            if (kandangserigala[i].getLive() == true) {
                kandangserigala[i].matiSerigala();
                if (kandangserigala[i].getLive() == true) {
                    
                    if (kandangserigala[i].serigalaSubur() == true) {
                        for (int j = 0; j < 2; j++) {
                            totalserigala++;
                            jumlahserigalabetina++;
                            kandangserigala[totalserigala] = new serigala(true, totalserigala, i);
                        }
                        for (int j = 0; j < 2; j++) {
                            totalserigala++;
                            jumlahserigalajantan++;
                            kandangserigala[totalserigala] = new serigala(false, totalserigala, i);
                        }
                    }
                   
                    
                } else {
                    serigalamati(i); 
                }
            }
            
        }
        for (int i = 1; i <= totalsem; i++) {
           if (kandangserigala[i].getLive()){

               kandangserigala[i].TambahUsiaSerigala();
           }
        }
    }

    

    public void sapimati(int j) {
        if (kandangsapi[j].getjkboolean() == true) {
            this.jumlahsapibetina--;
            this.totalsapi--;
        } else {
            this.jumlahsapijantan--;
            this.totalsapi--;

        }
    }

    public void serigalamati(int j) {
        if (kandangserigala[j].getjkboolean() == true) {
            this.jumlahserigalabetina--;
            this.totalserigala--;
        } else {
            this.jumlahserigalajantan--;
            this.totalserigala--;

        }

    }
}
