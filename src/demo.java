import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class demo {
    public static void main(String[] args) {
        String a = "abcacba";
        checkPalindrome(a);
//        Stack stack = new Stack();
//        stack.add(1);
//        stack.add(2);
//        stack.add(3);
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        Queue queue = new LinkedList();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);


    }
    static void checkPalindrome(String string){
        Stack stack = new Stack();
        Queue queue = new LinkedList();
        boolean check = false;
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }
        System.out.println(stack);
        System.out.println(queue);
        for (int i = 0; i < string.length()/2; i++) {
            if(stack.pop().equals(queue.poll())){
                check = true;
            }
            else{
                check=false;
                break;
            }
        }
        if (check==true){
            System.out.println("đây là chuỗi palindromde");
        }
        else {
            System.out.println("đây là k phải chuỗi palindromde");
        }
    }
}
