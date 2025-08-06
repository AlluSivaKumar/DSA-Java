public class ExceptionHandlingTryCatchExTwo {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;
        int arr[]= new int[5];

        try
        {
            j = i/j;
            System.out.println(arr[0]);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot Divide by Zero..");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Size Exceeded..");
        }
        catch(Exception e)
        {
            System.out.println("Some Thing Went Wrong..");
        }
        System.out.println(j);
        System.out.println("Byeeeeee...");
    }
}
