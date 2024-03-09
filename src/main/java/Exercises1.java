import javax.naming.spi.InitialContextFactory;

public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        if (n<0){System.out.println("factorial is not defined");return 0;}
        else if (n==0){System.out.println(n+"!= "+1);return 1;}
        else {long nfac=1;for(int i=1;i<=n;i++){nfac=i*nfac;}
            System.out.println(n+"!= "+nfac);return nfac;
        }



    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        long[] fib=new long[n];
        fib[0]=1;
        if (n==1){
            //System.out.println(fib[0]);
        }
        if (n!=1){
            fib[1]=1;
            for(int i=2;i<n;i++){fib[i]=fib[i-2]+fib[i-1];}

        }
        return fib[fib.length-1];
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        char[][] tri=new char[rows][];
        for(int i=0;i<rows;i++){
            tri[i]=new char[i+1];for(int j=0;j<i+1;j++){
                tri[i][j]='*';System.out.print(tri[i][j]);}System.out.println();}
        return tri;
    }


    public static void main(String[] args) {
        // test your code here!
    }

}