public class sapi {
    private int usiaSapi, nourut;
    private boolean subur;
    boolean live, jkSapi;

    public sapi(int nourut, boolean jkSapi) {
        this.usiaSapi = 0;
        this.jkSapi = jkSapi;
        this.live = true;
        this.nourut = nourut;
        if (jkSapi== true ) {
            System.out.println("sapi " + nourut +  " betina telah lahir");
            
        } else {
            System.out.println("sapi " + nourut +  " jantan telah lahir");
            
        }
    }

    public int getNourut() {
        return nourut;
    }

    public boolean MatiUsia() {

        if (usiaSapi > 6) {
            return true;
        } else {
            return false;
        }

    }

    public void matiSerigala() {

    }

    public boolean getSubur() {
        subur = false;
        if (jkSapi == true){

            if (usiaSapi >= 2 && usiaSapi < 7) {
                subur = true;
           
            } else {
                subur = false;
           
            }
        }return subur;
    }

    public void TambahUsia() {
        usiaSapi += 1;
    }

    public int getUsia() {
        return usiaSapi;
    }

}
