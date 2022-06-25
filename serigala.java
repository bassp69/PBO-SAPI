public class serigala {
    private int usiaSerigala, nourut, induk;
    private boolean live, jkserigala, subur, dahmaem = false;

    public serigala(boolean jkserigala, int nourut) {
        this.subur = false;
        this.nourut = nourut;
        this.jkserigala = jkserigala;
        this.live = true;
        this.usiaSerigala = 0;
        if (jkserigala == true) {
            System.out.println("serigala " + this.nourut + " betina telah lahir");

        } else {
            System.out.println("serigala " + this.nourut + " jantan telah lahir ");

        }
    }

    public serigala(boolean jkserigala, int nourut, int iniduk) {
        this.subur = false;
        this.nourut = nourut;
        this.jkserigala = jkserigala;
        this.live = true;
        this.induk = iniduk;
        this.usiaSerigala = 0;
        System.out.println("serigala " + this.nourut + getjkString() + " telah lahir dari induk " + induk);

    }

    public boolean getLive() {
        return this.live;
    }

    public int getNourut() {
        return nourut;
    }

    public int getUsiaSerigala() {
        return usiaSerigala;
    }

    public boolean getjkboolean() {
        return this.jkserigala;
    }

    public String getjkString() {
        if (this.jkserigala == true)
            return " betina ";
        else
            return " jantan ";
    }

    public void TambahUsiaSerigala() {
        this.usiaSerigala++;
    }

    public boolean serigalaSubur() {
        if (this.jkserigala == true) {
            if (this.usiaSerigala >= 1) {
                this.subur = true;
            }
        }
        return this.subur;
    }

    public void matiSerigala() {
        if (this.usiaSerigala >=3) {
            System.out.println("serigala " + getNourut() + getjkString() + " telah meninggal karena uzur");
            this.live = false;
        }
    }

    public void setmati() {
        this.live = false;
    }

    public void makanSapi(int nourut) {
      if(this.usiaSerigala>0) {
        System.out.println("serigala "+ getNourut()+ getjkString() +" makan sapi "+ nourut);
        
      } 
    }
    public void switchDahmaem() {
        dahmaem = true;
    }
    public boolean getdahmaem() {
        return dahmaem;
    }

}
