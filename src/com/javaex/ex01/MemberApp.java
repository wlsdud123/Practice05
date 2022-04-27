package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member a = new Member("정우성", "jws", 50000);
		Member aa = new Member("유재석", "yjs", 30000);
		Member aaa = new Member("이효리", "lhr", 40000);
		
		a.showlnfo();
		aa.showlnfo();
		aaa.showlnfo();
		
	}

}
