import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.*;
  
class codechef
{ 
    //By shwetank_verma
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    static int mod=1000000007;
    static boolean primes[]=new boolean[1000007];
    
    static boolean seive(int n){
        Arrays.fill(primes,true);
        primes[0]=primes[1]=false;
        for(int i=2;i*i<=n;i++){
            if(primes[i]==true){
                for(int p=i*i;p<=n;p+=i){
                    primes[p]=false;
                }
            }
        }
        if(n<1000007){
            return primes[n];
        }
        return false;
        
    }
    static int gcd(int a,int b){
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
    static long GCD(long a,long b){
        if(b==0)
        return a;
        return GCD(b,a%b);
    }
    
  
    public static void main(String[] args) 
    { 
        FastReader sc=new FastReader(); 
        try{
           
                int t=sc.nextInt();
                while(t-->0){
                int n=sc.nextInt();
                ArrayList<Integer> l=new ArrayList<Integer>();
                l.add(0);
                l.add(0);
                for(int i=1;i<n;i++){
                    if(l.contains(l.get(i))){
                        int p=0;
                        for(int j=i-1;j>=0;j--){
                            if(l.get(i)==l.get(j)){
                                p=i-j;
                                break;
                            }
                        }
                        l.add(p);
                    }
                    else
                    l.add(0);
                }
                int ans=0;
                for(int i=0;i<n;i++){
                    if(l.get(i)==l.get(n-1))
                    ans++;
                }
                
                
                System.out.println(ans);
        
                }
           
            
        }catch(Exception e){
            return;
        }
    } 
} 