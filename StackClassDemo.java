/*
* Stack Class:
* implements last-in - first - out
* operations - PUSH, POP, EMPTY, PEEK, SEARCH, SIZE (6 operations)
*
* s.push()
* s.pop()
* s.peek()
* s.search()
* s.empty();
* s.size();
*
*/

import java.util.Stack;

class StackClassDemo{
    static void push_elements(Stack<Integer> s)
    {
        for(int i = 0; i < 10 ; i++)
            s.push(i);
    }
    static void pop_elements(Stack<Integer> s)
    {
        System.out.println("Popped Elements:");
        for(int i = 0 ; i < 5 ; i++)
            System.out.println(s.pop());
    }
    static void search_element(Stack<Integer> s, int n)
    {
        Integer position = (Integer)s.search(n);
        System.out.println(position);
        if(position == -1)
        {
            System.out.println("Element not found.");

        }
        else
            System.out.println("Element found at position: "+ position);
    }
    static void peek_element(Stack<Integer> s)
    {
        System.out.println("Peek element is: " + s.peek());
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        push_elements(s);
        System.out.println("Pushed Elements: ");
        pop_elements(s);
     search_element(s,4);
        search_element(s,5);
        System.out.println("Peek element is: " + s.peek());

    }
}





