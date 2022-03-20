/**
 * Created by Computer on 19/03/2022.
 */
public class L3_StackDemo {
    public static void main(String args[])

    {



        StackArray stack = new StackArray(5);





        stack.push(10);

        stack.push(15);

        stack.push(30);

        stack.push(20);

        stack.push(5);



        System.out.println("Initial Stack: " + stack);





        System.out.println("Popped element: "

                + stack.pop());

        System.out.println("Popped element: "

                + stack.pop());



        System.out.println("Stack after pop operation "

                + stack);

    }

}


