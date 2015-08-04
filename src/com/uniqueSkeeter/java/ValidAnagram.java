package com.uniqueSkeeter.java;

import java.util.Arrays;

//�ж����������Ƿ�Ϊ��λ����
/*
 Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 */
//˼·1 �������ٱȽ��ַ���
//˼·2 �Ƚ��ַ�����
//�ַ������ַ�����Ļ���
//�ַ�����Ϊ�ַ����� toCharArray
//�ַ������Ϊ�ַ��� String.valueOf
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
