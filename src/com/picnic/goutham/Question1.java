package com.picnic.goutham;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Question1 {

	public static void main(String[] args) {
		//Declared a queue and initialized
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println("For FIFO Printing Queue elements");
		Iterator<Integer> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Removed Element "+queue.remove()+ " as it is the First element");
		System.out.println("Removed Element "+queue.remove()+" as it is the subsequent First element");
		System.out.println("after removing two elements:");
		Iterator<Integer> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		//LIFO ->
		Stack<Integer> stack = new Stack<Integer>(); 
		//Pushed Elements into Stack
		for (int i = 0; i < 5; i++) { 
            stack.push(i); 
        }
		
		//Printing Stack
		System.out.println("\n For LIFO Printing Stack elements");
		for(int eachelement : stack) {
			System.out.println(eachelement);
		}
		
		//Removed elements from stack
		
        System.out.println("Removed Element "+stack.pop());
        System.out.println("Removed Element "+stack.pop());
        
        System.out.println("Printing Stack after removing the elements");
        for(int eachelement : stack) {
			System.out.println(eachelement);
		}
        
		

	}
}

/*Output
For FIFO Printing Queue elements
1
2
3
4
Removed Element 1 as it is the First element
Removed Element 2 as it is the subsequent First element
after removing two elements:
3
4

 For LIFO Printing Stack elements
0
1
2
3
4
Removed Element 4
Removed Element 3
Printing Stack after removing the elements
0
1
2
*/
