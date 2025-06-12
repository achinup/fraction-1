package fractiontest;

public class FractionT {
    int i;
    private int deno=1;

    public FractionT(int i) {
//    j++;
    this.i=i;
//    System.out.println(j+" "+i);
    }

    public  FractionT(int n,int d) {
        if (n > 0 && d > 0  ) {
            this.i = n;
            this.deno = d;
        }

        else if(n < 0 && d < 0)
        {
            this.i=n*-1;
            this.deno=d*-1;
        }
        else if(d==0) {

            System.out.println("denominator is zero");
            throw new RuntimeException();
        }
        else
        {
            if(n>0)
              this.i=n*-1;
            else
                this.i=n;
            if(d>0)
               this.deno=d;
            else
                this.deno=d*-1;
        }

    }
//    static int j=0;
    public FractionT plus(FractionT fraction) {
        return this;
    }
    public FractionT add(FractionT that)
    {
        return new FractionT(this.i+that.i);

    }



    public FractionT addfract(FractionT that)
    {
       if(this.deno==that.deno)
       {
        return new FractionT(this.i+that.i,that.deno);

    }
       return new FractionT(this.i*that.deno+that.i*this.deno,this.deno*that.deno);
    }

    public int intValue() {
        return i;
    }
    public  int denovalue()
    {
        return deno;
    }
}
