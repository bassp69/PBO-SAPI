
import java.util.Random;
import java.util.Scanner;

public class looping {
    int time, jumlahsapibetina = 0, jumlahsapijantan = 0, totalsapi = 0, jumlahserigalabetina = 0,
            jumlahserigalajantan = 0, totalserigala = 0,usia123sapi = 0,usia45sapi= 0 ,usia6 = 0;
    sapi[] kandangsapi = new sapi[99999];
    serigala[] kandangserigala = new serigala[99999];
    Scanner iScanner = new Scanner(System.in);

    public looping() {
        System.out.println("masukkan tahun = ");
        int time = iScanner.nextInt();
        jumlahsapi();
        jumlahserigala();
        for (int i = 0; i <= time; i++) {
            System.out.println("====== tahun ke " + i + " =======");
            puterinsapi();
            probmati();
            puterinserigalanya();
            if (i>0) {
                
                serigalaMakanSapi();
            }
            disp();
        }
    }

    private void serigalaMakanSapi() {
        int usia0sapi= 0,usiadewasaserigala = 0;;
    for (int i = 1; i <= totalsapi; i++) {
        if (kandangsapi[i].getUsia()==0) {
            usia0sapi++;
        }
    }
    for (int i = 1; i <= totalserigala; i++) {
        if (kandangserigala[i].getUsiaSerigala()!=0) {
            usiadewasaserigala++;
        }
    }
    
    int jumlahdimakanserigala = usia0sapi*3;
    if (jumlahdimakanserigala<usiadewasaserigala) {
        int selisih = usiadewasaserigala-jumlahdimakanserigala;
        for (int i = 0; i < selisih; i++) {
            for (int j = 1; j <= totalserigala; j++) {
              if(kandangserigala[j].getLive()==true){
                  if (kandangserigala[j].getUsiaSerigala()>0) {
                      kandangserigala[j].setmati();
                      serigalamati(j);
                      System.out.println("serigala "+kandangserigala[j].getNourut() +kandangserigala[j].getjkString()+ " mati keluwen");
                      break;
                  }

              }
            }
        }
    }
  for (int k = 0; k < jumlahdimakanserigala; k++) {
    for (int i = 1; i <= totalsapi; i++) {
        if (kandangsapi[i].getLive()==true) {
            if (kandangsapi[i].getUsia()==0) {
                kandangsapi[i].setmati();
                System.out.println("sapi "+ kandangsapi[i].getNourut()+ kandangsapi[i].getJkString() +" mati di terkam serigala");
                sapimati(i);
                break;
            }
        } 
       }
  }
}

    public void probmati() {
        if (this.usia123sapi>=100) {
            for (int i = 0; i < 7; i++) {
                for (int j = 1; j <= totalsapi; j++) {
                    if (kandangsapi[j].getLive()==true) {
                        if (kandangsapi[j].getUsia()>0&& kandangsapi[j].getUsia() <4) {
                            System.out.println("sapi " + kandangsapi[j].getNourut() + kandangsapi[j].getJkString() + "telah meninggal di usia " + kandangsapi[j].getUsia());
                            sapimati(j);
                            kandangsapi[j].setmati();
                            break;
                        }
                    }
                }
            }
        }
        if (this.usia45sapi>=100) {
            
            for (int i = 0; i < 15; i++) {
                for (int j = 1; j <= totalsapi; j++) {
                    if (kandangsapi[j].getLive()==true) {
                        if (kandangsapi[j].getUsia()>3&&kandangsapi[j].getUsia()<6) {
                            System.out.println("sapi " + kandangsapi[j].getNourut() + kandangsapi[j].getJkString() + "telah meninggal di usia " + kandangsapi[j].getUsia());
                            sapimati(j);
                            kandangsapi[j].setmati();
                            break;
                        }
                    }
                }
            }
        }
        
        if (this.usia6>=100) {
            
            for (int i = 0; i < 20; i++) {
                for (int j = 1; j <= totalsapi; j++) {
                    if (kandangsapi[j].getLive()==true) {
                        if (kandangsapi[j].getUsia()==6) {
                            System.out.println("sapi " + kandangsapi[j].getNourut() + kandangsapi[j].getJkString() + "telah meninggal di usia " + kandangsapi[j].getUsia());
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
                        kandangsapi[j].TambahUsia();
                        if (kandangsapi[j].getUsia()<4) {
                            usia123sapi++;
                        } else if(kandangsapi[j].getUsia()>3&& kandangsapi[j].getUsia()<6){
                            usia45sapi++;
                        }else{
                            usia6++;
                        }
                    } else {
                        sapimati(j);
                    }

                }
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
                    kandangserigala[i].TambahUsiaSerigala();

                } else {
                    if (kandangserigala[i].getjkboolean() == true) {
                        jumlahserigalabetina--;
                        totalserigala--;
                    } else {
                        jumlahserigalajantan--;
                        totalserigala--;
                    }
                }

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
    
    public void  serigalamati(int j) {
        if (kandangserigala[j].getjkboolean() == true) {
            this.jumlahserigalabetina--;
            this.totalserigala--;
        } else {
            this.jumlahserigalajantan--;
            this.totalserigala--;
    
        }
        
    }
}
