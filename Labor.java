import java.util.Scanner;
public class Labor {
    static Scanner scan = new Scanner(System.in);
    static void purchase(int a,int b,int n,int cost[]){
        int space = a/2;
        if(b + space > n){
            System.out.print("no ");
            int sum = 0;
            for(int i=b - space-1;i<n;i++){
                sum += cost[i];
            }
            System.out.print(sum + " ");
        }
        else if(b - space <= 0){
            System.out.print("no ");
            int sum = 0;
            for(int i=0;i<=b + space-1;i++){
                sum += cost[i];
            }
            System.out.print(sum + " ");
        }
        else{
            int sum = 0;
            for(int i=b - space - 1;i<=b + space - 1;i++){
                sum += cost[i];
            }
            System.out.print(sum + " ");
        }
    }
    static void isLabor(int a,int b,int n,int labor[]){
        int space = a/2;
        if(b + space <= n && b - space > 0){
            boolean l = true;
            for(int i=b - space - 1;i<=b + space - 1;i++){
                if(labor[i] < 5){
                    l = false;
                }
            }
            if(l == true){
                System.out.print("labor");
            }
        }
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] cost = new int[n];
        for(int i=0;i<n;i++){
            cost[i] = scan.nextInt();
        }
        int[] labor = new int[n];
        for(int i=0;i<n;i++){
            labor[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            purchase(a, b, n, cost);
            isLabor(a, b, n, labor);
            System.out.println();
        }
    }
}
