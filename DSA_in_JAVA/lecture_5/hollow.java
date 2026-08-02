
public class hollow {
    public static void main(String[] args) {
            int n=5,p=4;
        for(int i=1;i<=p;i++){
        for(int j=1;j<=n;j++){
if (i == 1 || i == p || j == n||j==1){
    System.out.print(" *");
}
            else{
                System.out.print("  ");
            }
        }
        System.out.println(); 
    }
    }
}
