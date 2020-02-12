package Les3;

public class ReverseText {
    public static void main(String[] args) {
        String testText = "Привет";

        char[] arr = testText.toCharArray();

        Stack stack = new Stack(arr.length);

        for (char c:arr) {
            stack.push(c);
        }

        String res = "";
        for(int i=0; i<arr.length; i++){
            res = res + Character.toString((Character) stack.pop());
        }
        System.out.println(res);
    }
}
