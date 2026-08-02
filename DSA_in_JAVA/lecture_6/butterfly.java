
public class butterfly {
    public static void main(String[] args) {
        int n=8;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
             System.out.print(" *");
            }
            for(int k=n-i;k>0;k--){
                System.out.print("  ");
            } 
          for(int m=n-i;m>0;m--){
             System.out.print("  ");
            }
              for(int k=1;k<=i;k++){
                System.out.print(" *");
            } 
            System.out.println();
        }
           for(int i=1;i<=n;i++){
               for(int k=n-i;k>0;k--){
                System.out.print(" *");
            } 
             for(int m=1;m<=i;m++){
             System.out.print("  ");
            }
              for(int k=1;k<=i;k++){
                System.out.print("  ");
            } 
           for(int j=n-i;j>0;j--){
             System.out.print(" *");
            }  
            System.out.println();
        }
    }
}
