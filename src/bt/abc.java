package lithuyet;
import java.util.Arrays;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        int[]array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original Array : "+Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int delete = sc.nextInt();
        for(int i = delete; i < array.length -1; i++){
            array[i] = array[i + 1];
        }
        System.out.println(Arrays.toString(array));
    }
}
