
public class floyd_s {
   public static void main(String[] args) {
    int n=5;
    int sum=0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
           sum++;
            System.out.print(sum+" ");
        }
        System.out.println("");
    }
   } 
}
