public class Main {
    public static void main(String[] args) {

        int[] Arr = new int[] {1, 2, 3, 4};
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
        for (int j = Arr.length-1; j>=0;j--) {
            System.out.println(Arr[j]);
        }

        String str = "abc d ef g";
        String str1 = str.replace(" ", "");
        System.out.println(str1);

    }
}