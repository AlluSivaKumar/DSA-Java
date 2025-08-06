public class Swapping {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        System.out.println("Before Swapping "+n1+" "+n2);
        n2 = n1+n2-(n1=n2);

        System.out.println("After Swapping "+n1+" "+n2);

    }
}
