package com.uniqueSkeeter.java;
//�ж����������Ƿ�Ϊ��λ����
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
		//��������
		boolean [] useTag = new boolean[charNum];
		//���������ʼ��
		for(int i=0;i<charNum;i++){
			useTag[i]=false;
		}
		char ch;
		int i,j,getNum=0;
		for(i=0;i<charNum;i++){
			ch = sArray[i];
			for(j=0;j<charNum;j++){
				//�ҵ�
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
