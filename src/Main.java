import java.util.Scanner;

public class Main {
    public void bubleSort(int[] nums, int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] =  temp;
                }
            }

        }
    }
    public static void main(String[] args){
                
////        String s = "Gfg 9 + 6 = 12.0";
//
//        // create a new scanner
//        // with the specified String Object
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//
//            // if the next is a Int,
//            // print found and the Int
//            if (scanner.hasNextInt()) {
//                System.out.println("Found Int value :"
//                        + scanner.nextInt());
//            }
//
//            // if no Int is found,
//            // print "Not Found:" and the token
//            else {
//                System.out.println("Not found Int value :"
//                        + scanner.next());
//            }
//        }
//        scanner.close();
    }
    }
