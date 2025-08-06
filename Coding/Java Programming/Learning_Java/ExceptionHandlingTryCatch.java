public class ExceptionHandlingTryCatch {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;

        try
        {
            j = i/j;
        }
        catch(Exception e)
        {
            System.out.println("Something went Wrong"+e);
        }
        System.out.println(j);
        System.out.println("Byeeeeee...");
    }
}
