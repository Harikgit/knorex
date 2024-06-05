import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len=sc.nextInt();
        boolean issumpresent=false;
        boolean elementCondition=false;
        if (len<=10000){
            int[] arr=new int[len];
            System.out.println("Enter the numbers in the array");
            for (int i=0;i<len;i++){
                arr[i]=sc.nextInt();
                if (arr[i]>(-1000)&&arr[i]<1000){
                    elementCondition=true;
                }
            }
            if (elementCondition){
                System.out.println("Enter a number to check for sum");
                int sum=sc.nextInt();
                for (int j=0;j<len;j++){
                    for (int k=j+1;k<len;k++){
                        if(arr[j]+arr[k]==sum){
                            issumpresent=true;
                            break;
                        }
                    }
                }
                System.out.println(issumpresent);
            }

        }
        else {
            System.out.println("Enter a number less than 10001");
        }
    }
}
