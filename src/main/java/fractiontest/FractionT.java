package fractiontest;

import static fractiontest.gcd.Gcd;

public class FractionT
  {
    int i;
    private int deno=1;

    public FractionT(int i)
    {
//    j++;
      this.i=i;
//    System.out.println(j+" "+i);

    }

    public  FractionT(int n,int d)
    {
        if(d==0) {

            System.out.println("denominator is zero");
            throw new RuntimeException();
        }

        int a=Gcd(n,d);
        n=n/a;
        d=d/a;
        if (n > 0 && d > 0||n < 0 && d < 0) {
            this.i = Math.abs(n);
            this.deno = Math.abs(d);
        }



        else
        {
            this.i=Math.abs(n)*-1;
            this.deno=Math.abs(d);
        }

    }
//    static int j=0;
//    public FractionT plus(FractionT fraction)
//    {
//        return this;
//    }

//    public FractionT add(FractionT that)
//    {
//        return new FractionT(this.i+that.i);
//
//    }



    public FractionT addfract(FractionT that)
    {
       if(this.deno==that.deno)
       {
        return new FractionT(this.i+that.i,that.deno);

        }
       return new FractionT(this.i*that.deno+that.i*this.deno,this.deno*that.deno);
    }


//    public int intValue()
//    {
//
//        return i;
//    }

//    public  int denovalue()
//    {
//        return deno;
//    }

    @Override
    public boolean equals(Object other)
    {
        if(other instanceof FractionT)
        {
             FractionT that=(FractionT) other;
             return  this.i==that.i && this.deno==that.deno;
        }
        return  false;
    }
//    @Override
//    public String toString()
//    {
//     return String.format("%d/%d",i,deno);
//    }

//    @Override
//    public  int hashCode()
//    {
//        return i*19+deno;
//    }
}
