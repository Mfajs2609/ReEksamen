import java.util.*;

public class StackExample {
    //Implementere Stack data struktur
    //sidst ind, først ud.
    //Extends Vector class, implements List interface


    static void stackPush (Stack stack){
        //pushing elemente on top of the stack
        for(int i = 0; i < 10; i++){
            stack.push(i);
        }
    }

    static void stackPop (Stack stack){
        //fjerner det øvereste element i stacken med pop.
        System.out.println("Stack: " + stack);
        System.out.println("Fjerner : " + stack.pop());
        System.out.println("Stack: " + stack);
        System.out.println("Fjerner : " + stack.pop());
        System.out.println("Ny stack: " + stack + "\n" );
    }

    static void stackPeek (Stack stack){
        //Peek finder elementet øverest i stacken.
        System.out.println("Øvereste element: " + stack.peek());
    }

    public static void main(String[]    args){
        Stack<Integer> stackList = new Stack<>();

        stackPush(stackList);
        stackPop(stackList);
        stackPeek(stackList);
    }
}
