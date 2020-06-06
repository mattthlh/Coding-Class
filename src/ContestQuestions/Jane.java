package ContestQuestions;

import java.util.Scanner;
import java.util.Stack;

public class Jane {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        stack.push("HOME");
        String userInput = "";
        while(!userInput.equals("SCHOOL")) {
            userInput = sc.nextLine();
            if(!userInput.equals("SCHOOL")) stack.push(userInput);
        }

        while(!stack.empty()) {
            if(stack.peek().equals("L")) {
                stack.pop();
                if(stack.peek().equals("HOME")) {
                    System.out.println("Turn RIGHT into your " + stack.peek());
                } else {
                    System.out.println("Turn RIGHT onto " + stack.peek());
                }
                stack.pop();
            } else {
                stack.pop();
                if(stack.peek().equals("HOME")) {
                    System.out.println("Turn LEFT into your " + stack.peek());
                } else {
                    System.out.println("Turn LEFT onto " + stack.peek());
                }
                stack.pop();
            }
        }
    }
}
