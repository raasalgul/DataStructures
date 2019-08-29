package com.stack.operations;

import java.util.Arrays;
import java.util.Stack;

public class StackReverseRecursion {
public static void main(String args[])
{
	Stack<Integer> stack=new Stack<Integer>();
	stack.addAll(Arrays.asList(3,4,5,6,7,8));
	System.out.println(stack);
	reverse(stack);
	System.out.println(stack);
}

private static void reverse(Stack<Integer> stack) {
	if(stack.isEmpty())
		return;
	int value=stack.pop();
	reverse(stack);
	insertAtBottom(value,stack);
}

private static void insertAtBottom(int value, Stack<Integer> stack) {
if(stack.isEmpty())
{
	stack.add(value);
	return;
}
int rest=stack.pop();
insertAtBottom(value,stack);
stack.add(rest);
}
}
