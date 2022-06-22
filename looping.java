
import java.util.Random;
import java.util.Scanner;

public class looping {
    int time, jumlahsapibetina = 0, jumlahsapijantan = 0, totalsapi = 0, jumlahserigalabetina = 0,
            jumlahserigalajantan = 0, totalserigala = 0;
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
            puterinserigalanya();
            disp();
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
               
                kandangsapi[j].probmati123();
                if (kandangsapi[j].getLive() == true) {
                    kandangsapi[j].probmati45();
                    if (kandangsapi[j].getLive() == true) {
                        kandangsapi[j].probmati6();
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
                            } else {
                                sapimati(j);
                            }
                        } else {
                            sapimati(j);
                        }
                    } else {
                        sapimati(j);
                    }

                } else {
                    sapimati(j);
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
            jumlahsapibetina--;
            totalsapi--;
        } else {
            jumlahsapijantan--;
            totalsapi--;

        }
    }
}
