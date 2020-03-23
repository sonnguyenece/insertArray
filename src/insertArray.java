import java.util.Scanner;

public class insertArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input array length : ");
        int length = scn.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < length; i++) {
            System.out.print("Input " + (i + 1) + " element ");
            arr[i] = scn.nextInt();
        }
        System.out.print("Array : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Input X : ");
        int x = scn.nextInt();
        System.out.print("Input X position : ");
        int xIndex = scn.nextInt() - 1;
        if (xIndex < 0 || xIndex > arr.length - 1) {
            System.out.println("Can not insert X in this array!");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i == xIndex) {
                    for (int j = length; j >= xIndex; j--) {
                        arr[j + 1] = arr[j];
                    }
                    arr[i] = x;
                }
            }
            System.out.print("New array : ");
            if(xIndex>length){
                for (int i=0;i<=xIndex;i++){
                    System.out.print(arr[i]+" ");
                }
            }else {
                for (int i=0;i<=length;i++){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
