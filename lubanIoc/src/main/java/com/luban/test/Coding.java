package com.luban.test;

import java.util.Stack;

public class Coding {
	public static void main(String[] args){
		removeOuterParentheses("(()())(())");
	}
	public static String removeOuterParentheses(String S) {
		String returnStr="";
		//放入栈中，左右括号则输出，若当好是栈最后一个，则直接弹出
		Stack<Character> stack =new Stack<Character>();
		for(int i=0;i<S.length();i++){
			if(S.charAt(i)=='('){
				stack.push('(');
				continue;
			}
			if(S.charAt(i)==')'){
				//右括号，并且前一个是左括号，则直接输出
				if(stack.peek()=='('&&stack.size()!=1){
					returnStr+="()";
					stack.pop();
					continue;
				}if(stack.peek()=='('&&stack.size()==1){
					stack.pop();
					continue;
				}
				if(stack.peek()==')'){
					stack.push(')');
				}
			}
		}
		return returnStr;
	}
}
