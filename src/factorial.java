
public class factorial {
public int N;
    public int fact(int N){
        this.N = N;
        if(N <= 1){
            return 1;
        }
        else{
            return N* fact(N-1);
        }

    }
}
