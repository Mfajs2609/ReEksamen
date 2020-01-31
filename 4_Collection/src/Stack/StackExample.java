package Stack;

import java.util.Stack;

public class StackExample {
    //Implementere Stack data struktur
    //Sidst ind, først ud.
    //Extends Vector class, implements List interface

    static void stackPush (Stack<Integer> stack){
        //pushing elemente on top of the stack
        for(int i = 0; i < 10; i++){
            stack.push(i);
        }
    }

    static void stackPop (Stack<Integer> stack){
        //fjerner det øvereste element i stacken med pop.
        System.out.println("Stack: " + stack);
        System.out.println("Fjerner : " + stack.pop());
        System.out.println("Fjerner : " + stack.pop());
        System.out.println("Ny stack: " + stack);
    }

    static void stackPeek (Stack<Integer> stack){
        //Peek finder elementet øverest i stacken.
        Integer topElement = stack.peek();
        System.out.println("Øvereste element: " + topElement);
    }

    public static void main(String[]    args){
        Stack<Integer> stack = new Stack<>();

        stackPush(stack);
        stackPop(stack);
        stackPeek(stack);
    }
}
