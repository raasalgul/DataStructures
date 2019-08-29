package com.stack.operations;

import java.util.Arrays;
import java.util.Stack;

public class StackSortRecursion {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.addAll(Arrays.asList(6,5,4,9,8,1));
		System.out.println(stack);
		sort(stack);
		System.out.println(stack);
	}

	private static void sort(Stack<Integer> stack) {
		if(stack.isEmpty())
			return;
		int value=stack.pop();
		sort(stack);
		if(stack.isEmpty())
		{
			stack.add(value);
			return;
		}
		findMinimum(stack,value);	
	}

	private static void findMinimum(Stack<Integer> stack, int value) {
	if(stack.isEmpty() || stack.peek()<value)
	{
		stack.add(value);
		return;
	}	
	int rest=stack.pop();
	findMinimum(stack,value);
	stack.add(rest);
	}
}
