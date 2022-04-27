package com.javaex.ex02;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생산자
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//메소드-gs
	public String getName() {
		return name;
	}
	public void SetName(String name) {
		this.name = name;
	}	
	
	public int getPrice() {
		return price;
	}
	
	//메소드-일반
	public void showlnfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
}




