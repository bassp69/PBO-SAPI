import java.util.ArrayList;
import java.util.Scanner;

public class looping {
    int time, jumlahsapibetina= 0, jumlahsapijantan= 0, totalsapi=0 , jumlahserigalabetina=0 , jumlahserigalajantan= 0, totalserigala= 0;
    sapi[] kandangsapi = new sapi[9999];
    serigala[] kandangserigala = new serigala[99999];
    Scanner iScanner = new Scanner(System.in);

    public looping() {
        System.out.println("masukkan tahun = ");
        int time = iScanner.nextInt();
        jumlahsapi();
        jumlahserigala();
        for (int i = 0; i <= time ; i++) {
            
            puterinsapinyabunda();
        }
        disp();
    }

    public void jumlahsapi() {
        System.out.println("masukkan sapi jantan  = ");
        int temp = iScanner.nextInt();
        kandangsapi[0] = null;
        for (int i = 1; i <= temp; i++) {
            this.jumlahsapijantan++;
            this.totalsapi++;
            kandangsapi[jumlahsapijantan] = new sapi(totalsapi, false);
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

    public void jumlahserigala(){
        kandangserigala[0]= null;
        System.out.println("masukkan serigala jantan  = ");
        int temp = iScanner.nextInt();
        for (int j = 0; j < temp; j++) {
            jumlahserigalajantan++;
        this.totalserigala++;
        kandangserigala[totalserigala]= new serigala(false);
        }
        System.out.println("masukkan serigala betina  = ");
        temp = iScanner.nextInt();
        for (int j = 0; j < temp; j++) {
            jumlahserigalabetina++;
            totalserigala++;
            kandangserigala[totalserigala]= new serigala(true);
        }

    }

    public void puterinsapinyabunda() {
        for (int i = 1; i <=totalsapi; i++) {
            if (kandangsapi[i].MatiUsia()==false){
                if(kandangsapi[i].matiSerigala()== false){

                    kandangsapi[i].TambahUsia();
                }


            };


        }
    }

}
