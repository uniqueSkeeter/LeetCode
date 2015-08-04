package com.uniqueSkeeter.java;

import java.util.Arrays;

//判断两个单词是否为易位构词
/*
 Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 */
//思路1 先排序再比较字符串
//思路2 比较字符数量
//字符串与字符数组的互换
//字符串变为字符数组 toCharArray
//字符数组变为字符串 String.valueOf
public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "nagaram";
		boolean a = isAnagram(s,t);
		System.out.println(a);

	}
	public static boolean isAnagram(String s, String t) {
		if(s == null || t == null)
			return false;
		if(s.length() != t.length())
			return false;
		if(s.length()==0 || t.length()==0)
			return true;
		char [] sArray = s.toCharArray();
		char [] tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		return String.valueOf(sArray).equals(String.valueOf(tArray));
    }
}
