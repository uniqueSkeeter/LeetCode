package com.uniqueSkeeter.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*
 Given a string of numbers and operators, 
 return all possible results from computing all the different possible ways to group numbers and operators. 
 The valid operators are +, - and *.

Example 1
Input: "2-1-1".

((2-1)-1) = 0
(2-(1-1)) = 2
Output: [0, 2]
 */
public class AddParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> diffWaysToCompute(String input) {
		int val = 0, idx = 0;
	    while (idx < input.length() && isDigit(input.charAt(idx))) {
	    	val *= 10;
	        val += input.charAt(idx) - '0';
	        idx++;
	    }
	    if (idx == input.length()){
	    	List<Integer> temp = new ArrayList<Integer>();
	    	temp.add(val);
	    	return temp;
	    }
	    List<Integer> res = null;
	    List<Integer> left, right;
	    for (int i = 0; i < input.length(); ++i) {
	    	if (!isDigit(input.charAt(i))) {
	    		left = diffWaysToCompute(input.substring(0,i));
	    		right = diffWaysToCompute(input.substring(i + 1, input.length() -1 - i));
	            for (int j = 0; j < left.size(); ++j) {
	            	for (int k = 0; k < right.size(); ++k) {
	            		res.add(computeUnit(left.get(j), right.get(k), input.charAt(i)));
	                }
	            }
	        }
	    }
	    return res;
	}
	public int computeUnit(int a,int b, char op){
		switch(op){
		case'+':return a+b;
		case'-':return a-b;
		case'*':return a*b;
		default:{
			System.out.println("error operator !");
			return -1;
			}
		}
	}
	public boolean isDigit(char ch){
		if(ch >= '0' && ch <= '9')
			return true;
		else
			return false;
	}
	
}
