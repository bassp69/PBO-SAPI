public class serigala {
    private int usiaSerigala, nourut;
    private boolean live, jkserigala, subur;

    public serigala(boolean jkserigala, int nourut, int induk) {
        this.subur =false;
        this.jkserigala = jkserigala;
        this.live = true;
        this.usiaSerigala = 0;
        this.nourut = nourut;
        if (jkserigala == true) {
            System.out.println("serigala" + this.nourut + " betina telah lahir dari induk " + induk);

        } else {
            System.out.println("serigala" + this.nourut + " jantan telah lahir dari induk " + induk);

        }
    }

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

    public void TambahUsiaSerigala() {
        this.usiaSerigala++;
    }

    public boolean serigalaSubur() {
        if(this.jkserigala == true){
            if (this.usiaSerigala >=1 ) {
           this.subur = true;
                }
            }
            return this.subur;
        }

        public void matiSerigala() {
            if(this.usiaSerigala >= 4){
            this.live = false;
            }
        }
}
