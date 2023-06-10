import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        // Fibonacci
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n elements to be FIBONACCI: ");
//        int n = sc.nextInt();
//        int n1 = 1;
//        int n0 = 0;
//        int arr[] = new int[n];
//
//
//        for(int i = 0;i<n;i++){
//            arr[i] = n0+n1;
//            n0 = n1;
//            n1 = arr[i];
//
//
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//
//        }
//   }
//        int num = sc.nextInt();
//        int toCount = sc.nextInt();
//        int count = 0;
//
//        while (num > 0){
//            int rem = num%10;
//            if (rem == toCount){
//                count++;
//            }
//            num /= 10;
//        }
//        System.out.println(count);

//        int num = sc.nextInt();
//        int result = 0;
//
//        while(num > 0){
//            int i = num%10;
//            num /= 10;
//            result = result*10 + i;
//        }
//        System.out.println(result);

        // Armstrong Number
//        int n = sc.nextInt();
//        int tempNum = n;
//        int count = 0;
//        while (n > 0){
//
//            int rem = n % 10;
//            rem = (int) Math.pow(rem, 3);
//            count += rem;
//            n /= 10;
//
//        }
//
//        if (count == tempNum){
//            System.out.println("Armstrong Number");
//        }else{
//            System.out.println("Not Armstrong Number");
//        }

        //Factors of a number

//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if (n%i ==  0) {
//                System.out.println(i);;
//            }
//        }

        // largest of all inputs
//        int max = 0;
//
//        while(true){
//            int n = sc.nextInt();
//            if(n==0){
//                break;
//            }
//            else{
//                if(n>max){
//                    max = n;
//                }
//            }
//        }
//        System.out.println(max);


//        int n = sc.nextInt();
//        long res = 1;
//
//        while(n>0){
//            res *= n;
//            n--;
//        }
//        System.out.println(res);

        // nPr

//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        int n_r = n-r;
//        long resN = 1;
//        long resN_R = 1;
//
//        while (n>0){
//            resN *= n;
//            n--;
//        }
//
//        while (n_r>0){
//            resN_R *= n_r;
//            n_r--;
//        }
//
//        float res = resN/resN_R;
//
//        System.out.println(res);

        // HCF of 2 numbers
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        int max = 0;
//
//        for (int i = 1; i < Math.min(n1,n2); i++) {
//
//            if(n1%i==0 && n2%i==0){
//                if(i>max){
//                    max = i;
//                }
//            }
//
//        }
//        System.out.println(max);


        // vowel or not
//        char c = sc.next().trim().charAt(0);
//
//        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
//            System.out.println("Vowel");
//        }
//        else{
//            System.out.println("Consonant");
//        }

//        int a = 20;
//        int b = 10;
//
//        swap(a,b);
//
//        System.out.println((a+" "+b));
    }

}




