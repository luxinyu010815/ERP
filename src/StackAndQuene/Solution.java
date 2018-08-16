package StackAndQuene;

import java.util.Arrays;
import java.util.Stack;

/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
 * 
 * @author luxin
 *
 */
public class Solution {
	public static void main(String[] args) {
		Solution stack = new Solution();
		stack.push(3);
		stack.push(1);
		stack.push(4);
		stack.push(0);
		System.out.println(stack.min());
		System.out.println(stack);
	}
	private static Stack<Integer> stack = new Stack<>();
	private static int min = Integer.MAX_VALUE;
	public void push(int node) {
		stack.push(node);
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		
		return stack.peek();
	}

	public int min() {
		while(stack.size()>0) {
			min = Math.min(min, stack.pop());
		}
		return min;
	}
	/*
	 * @Override public String toString() { return "Solution [StackData=" +
	 * Arrays.toString(StackData) + ", StackMin=" + Arrays.toString(StackMin) +
	 * ", dataIndex=" + dataIndex + ", minIndex=" + minIndex + "]"; } private int[]
	 * StackData = new int[10]; private int[] StackMin = new int[10]; private double
	 * sizePa = 0.75; private int dataIndex = 0; private int minIndex = 0;
	 * 
	 * public void push(int node) { if(dataIndex>StackData.length*0.75) { int[] temp
	 * = new int[StackData.length*2]; for(int i=0;i<StackData.length;i++) { temp[i]
	 * = StackData[i]; } StackData = temp; temp = new int[StackData.length*2];
	 * for(int i=0;i<StackMin.length;i++) { temp[i] = StackMin[i]; } StackMin =
	 * temp; }
	 * 
	 * StackData[dataIndex++] = node; if(minIndex==0) { StackMin[minIndex++]=node;
	 * }else if(node>StackMin[(minIndex-1)]) {
	 * StackMin[minIndex]=StackMin[(minIndex-1)]; minIndex++; }else {
	 * StackMin[minIndex++] = node; } }
	 * 
	 * public void pop() { StackData[--dataIndex] = 0; StackMin[--minIndex] = 0; }
	 * 
	 * public int top() { return StackData[(dataIndex-1)]; }
	 * 
	 * public int min() { return StackMin[(minIndex-1)]; }
	 */
}
