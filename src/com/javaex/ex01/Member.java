package com.javaex.ex01;

public class Member {
	//필드
	private String id;
	private String name;
	int point;
	
	
	//생성자
	public Member(String name, String id, int point) {
		this.name = name;
		this.id = id;
		this.point = point;
	}
	
	
	//메소드-gs
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	//메소드-일반
	
	public void showlnfo() {
		System.out.println("회원정보: " + name + "(" + id + "), " + point + "점");
	}
	
}