import java.util.ArrayList;
import java.util.Arrays;


public class Basics {
    public static void num(){
        for(int i=1; i<=255; i++){
            System.out.println(i);
        }
    }

    public static void oddnum(){
        for(int i=0; i<=255; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
            
        }
    }

    public static void sumnum(){
        int x=0;
        for(int i=1; i<=255; i++){
            x = i + x;
        }
        System.out.println(x);
    }

    public static void arrite(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int max(int[] arr){
        int maxval = arr[0];
        for(int someNum: arr){
            if(someNum > maxval){
                maxval= someNum;
            }
        }
        return maxval;
    }

    public static double average(int[] arr){
        int sum = 0;
        for(int val: arr){
            sum += val;
        }
        double avg = (double)sum/arr.length;
        return avg;
    }

    public static void yarr(int num){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i=0; i<=num; i++){
            if(i%2!=0){
                y.add(i);
            }
        }
        System.out.println(y);
    }

    public static int greater(int[] arr, int num){
        int greaterval=0;
        for(int i=0; i<arr.length; i++){
            if(num < arr[i]){
                greaterval += 1;
            }
        }
        return greaterval;
    }

    public static int[] negs(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] squared(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }
    

    public static int[] splice(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr.splice(0,1);
        }
        return arr;
    }

    public static int min(int[] arr){
        int minval = arr[0];
        for(int someNum: arr){
            if(someNum < minval){
                minval= someNum;
            }
        }
        return minval;
    }

    public static void maxaverage(int[] arr){
        ArrayList<Object> result = new ArrayList<Object>();
        int maxval = Basics.max(arr);
        double aveVal = Basics.average(arr);
        int minval = Basics.min(arr);
        result.add(maxval);
        result.add(aveVal);
        result.add(minval);
        System.out.println(result);
    }

    public static void main(String[] args){
        System.out.println("yuh");
        // Basics.num();
        // Basics.oddnum();
        // Basics.sumnum();
        int[] somearray = {1,3,5,7,9,13};
        int[] anotherarray = {-3,5,7,-7,-2,5,6};
        // System.out.println(Basics.max(anotherarray));
        // Basics.arrite(somearray);
        // System.out.println(Basics.average(somearray));
        // Basics.yarr(255);
        // System.out.println(Basics.greater(somearray, 3));
        // System.out.println(Arrays.toString(Basics.negs(anotherarray)));
        // System.out.println(Arrays.toString(Basics.squared(anotherarray)));
        // Basics.maxaverage(anotherarray);
        Basics.splice(somearray);
    }
}
