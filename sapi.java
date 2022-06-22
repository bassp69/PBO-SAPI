import java.util.Random;

public class sapi {
    private int usiaSapi, nourut;
    private boolean live, jkSapi, subur;

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

    public void probmati123() {
        if (this.usiaSapi > 0 && this.usiaSapi < 4) {
            boolean temp = new Random().nextInt(100) < 7;
            this.live = temp;
            if (this.live = false) {
                System.out.println("sapi " + getNourut() + getJkString() + "telah meninggal di usia " + getUsia());
            }

        }
    }

    public void probmati45() {
        if (this.usiaSapi > 3 && this.usiaSapi < 6) {
            boolean temp = new Random().nextInt(100) < 15;
            this.live = temp;
            if (this.live = false) {
                System.out.println("sapi " + getNourut() + getJkString() + "telah meninggal di usia " + getUsia());
            }
        }
    }

    public void probmati6() {
        if (this.usiaSapi == 6) {
            boolean temp = new Random().nextInt(100) < 20;
            this.live = temp;
            if (this.live = false) {
                System.out.println("sapi " + getNourut() + getJkString() + "telah meninggal di usia " + getUsia());
            }
        }
    }

    public boolean matiSerigala() {
        return false;
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

}
