
class Swap1 {

    public static void main(String[] args) {

        int a = 10, b = 20;
        System.out.println("Before swapping:" + a + "  " + b);

        int c = a; 
        a = b;
        b = c;;

        System.out.println("After Swapping: " + a + "  " + b);

    }

}
