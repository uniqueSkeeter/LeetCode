package com.uniqueSkeeter.java;
//判断两个单词是否为易位构词
/*
 Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 */
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
			return false;
		char [] sArray = s.toCharArray();
		char [] tArray = t.toCharArray();
		int charNum = s.length();
		//辅助数组
		boolean [] useTag = new boolean[charNum];
		//辅助数组初始化
		for(int i=0;i<charNum;i++){
			useTag[i]=false;
		}
		char ch;
		int i,j,getNum=0;
		for(i=0;i<charNum;i++){
			ch = sArray[i];
			for(j=0;j<charNum;j++){
				//找到
				if(tArray[j] == ch && useTag[j] == false){
					useTag[j] = true;
					getNum++;
					break;
				}
			}
		}
		if(getNum == charNum)
			return true;
		else
			return false;
    }
}
