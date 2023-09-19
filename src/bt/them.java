package lithuyet;
import java.util.Arrays;
import java.util.Scanner;

public class them {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần thêm: ");
        int add = sc.nextInt();
        System.out.print("vị trí cần sửa: ");
        int index = sc.nextInt();
        System.out.println("Original Array : "+Arrays.toString(my_array));
        for(int i=my_array.length-1; i > index; i--){
            my_array[i] = my_array[i-1];
        }
        my_array[index] = add;
        System.out.println("New Array: "+Arrays.toString(my_array));
    }
}
