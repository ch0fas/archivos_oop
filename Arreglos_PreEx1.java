import java.util.Arrays;

public class Arreglos_PreEx1
{
    public static void main(String[] args)
    {
        int[] arr_1 = {1,2,3,4,5,6,7,8,9,10};
        int arr_1_sum = 0;
        double[] arr_3 = {1.1, 2.4, 3.9, 4.16, 10.1, 6.36, 7.49, 8.64, 9.81, 5.25};
        int[] arr_4 = new int[10];
        int[] arr_5 = new int[5];
        int[] arr_6 = {2,4,6,8,10,12,14,16,18,20};
        int[] arr_c = new int[10];
        int[] arr_7 = new int[10];
        int[] arr_8 = {1,2,3,4,5,3,7,8,3,10};
        int[] arr_9 = {3,6,9,12,15,18,21,24,27,30};
        int[] arr_shift = new int[10];
        int[][] arr_11 = {{1,2,3,4},
                        {5,6,7,8},
                        {9, 10}};
        int[][] arr_12 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] arr_t = new int[3][3];
        int largest_value = 0;
        int row_largest = 0;
        int column_largest = 0;
        int counter = 0;
        // P1
        System.out.println("1 - Given an int[], print all elements in order using a loop\n");
        for (int e:arr_1)
        {
            System.out.printf(e+" ");
        }
        // P2
        System.out.println("\n\n2 - Given an int[], calculate and return the sum of all elements");
        for (int e:arr_1)
        {
            arr_1_sum += e;
        }
        System.out.printf("Sum of all elements of arr_1 is: %d", arr_1_sum);
        System.out.println("\n\n3 - Given a double[], find and return the largest value in the array");
        Arrays.sort(arr_3);
        System.out.printf("The biggest number here is %.2f", arr_3[arr_3.length-1]);
        System.out.println("\n\n4 - Given an int[], create a new array where every element is doubled from the original array\n");
        for (int e:arr_1)
        {
            arr_4[counter] = e*2;
            System.out.printf("%d ", arr_4[counter]);
            counter++;
        }
        counter = 0;
        System.out.println("\n\n5 - Given an int[], create an array containing only the even numbers from the original array");
        for (int e:arr_1)
        {
            if (e % 2 == 0)
            {
                arr_5[counter] = e;
                System.out.printf("%d ",arr_5[counter]);
                counter++;
            }
        }
        counter = 0;
        System.out.println("\n\n6 - Given two int[] arrays of the same size, create a third array where each element is the sum of the elements at the same index");
        for (int i = 0; i < arr_1.length; i++)
        {
            arr_c[i] = arr_1[i] + arr_6[i];
            System.out.println(arr_c[i]);
        }
        System.out.println("\n\n7 - Given an int[], reverse the array into a new array without modifying the original");
        for (int i = 9; i >= 0; i--)
        {
            arr_7[counter] = arr_1[i];
            System.out.printf("%d ", arr_7[counter]);
            counter++;
        }
        counter = 0;
        System.out.println("\n\n8 - Given an int[], count how many times a specific number appears in the array");
        for (int e:arr_8)
        {
            if (e == 3) // Checking for 3
            {
                counter++;
            }
        }
        System.out.printf("The number 3 appears %d times in the array.", counter);
        counter = 1;
        System.out.println("\n\n9 - Given an int[], shift all elements one position to the right");
        for (int e:arr_9)
        {
            if (counter > 9)
            {
                arr_shift[0] = e;
                break;
            }
            arr_shift[counter] = e;
            counter++;
        }
        for (int e:arr_shift)
        {
            System.out.printf("%d ", e);
        }
        System.out.println("\n\n11 - Given an int[][], calculate and print the sum of each row separately");
        counter = 0;
        for (int[] row:arr_11)
        {
            for (int e:row)
            {
                counter += e;
            }
            System.out.printf("\nSum of row values: %d", counter);
            counter = 0;
        }
        System.out.println("\n\n12 - Given an int[][], create a new 2D array that is the transpose of the original matrix (sawp rows and columns)");
        for (int i = 0; i < arr_12.length; i++)
        {
            for (int j = 0; j < arr_12[i].length; j++)
            {
                arr_t[i][j] = arr_12[j][i];
            }
        }
        for (int[] row:arr_t)
        {
            for (int e:row)
            {
                System.out.printf("%d ",e);
            }
            System.out.println();
        }
        System.out.println("\n\n13 - Given an int[][], find and return the largest value in the entire 2D array along with its row and column index");
        for (int i = 0; i < arr_t.length; i++)
        {
            for (int j = 0; j < arr_t[i].length; j++)
            {
                if (arr_t[i][j] > largest_value)
                {
                    largest_value = arr_t[i][j];
                    row_largest = i;
                    column_largest = j;
                }
            }
        }
        System.out.printf("The largest value was %d at (%d, %d)", largest_value, row_largest, column_largest);


    }
}