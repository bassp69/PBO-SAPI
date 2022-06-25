
public class sapi {
    private int usiaSapi, nourut, jatahserigala = 3;
    private boolean live, jkSapi, subur, dahdimaem;

    public boolean getLive() {
        return this.live;
    }

    public int getUsiaSapi() {
        return usiaSapi;
    }

    public boolean getjkboolean() {
        return this.jkSapi;
    }

    public String getJkString() {
        if (jkSapi == true) {
            return " betina ";
        } else {
            return " jantan ";
        }
    }

    public sapi(int nourut, boolean jkSapi, int induk) {
        this.usiaSapi = 0;
        this.jkSapi = jkSapi;
        this.live = true;
        this.nourut = nourut;
        if (jkSapi == true) {
            System.out.println("sapi " + nourut + " betina telah lahir dari induk " + induk);

        } else {
            System.out.println("sapi " + nourut + " jantan telah lahir dari induk " + induk);

        }
    }

    public sapi(int nourut, boolean jkSapi) {
        this.usiaSapi = 0;
        this.jkSapi = jkSapi;
        this.live = true;
        this.nourut = nourut;
        if (jkSapi == true) {
            System.out.println("sapi " + nourut + " betina ");

        } else {
            System.out.println("sapi " + nourut + " jantan");

        }
    }

    public int getNourut() {
        return nourut;
    }

    public void MatiUsia() {

        if (this.usiaSapi > 6) {
            System.out.println("sapi " + getNourut() + getJkString() + "telah meninggal");
            live = false;
        } else {
            live = true;
        }

    }

    public void setmati() {
        this.live = false;
    }
  
    public boolean getSubur() {
        subur = false;
        if (jkSapi == true) {

            if (usiaSapi >= 2 && usiaSapi < 7) {
                subur = true;

            } else {
                subur = false;

            }
        }
        return subur;
    }

    public void TambahUsia() {
        usiaSapi++;
    }

    public int getUsia() {
        return usiaSapi;
    }

    public int getJatahDimakan() {
        return jatahserigala;
    }

    public void kurangJatahDimakan() {
   jatahserigala--;
    }

    public void ubahdimakan() {
   dahdimaem = true;

    }

    public boolean getdahdimaem(){
        return dahdimaem;
    }

   

   
}
