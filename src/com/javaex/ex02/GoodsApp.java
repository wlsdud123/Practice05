package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		Goods cup = new Goods("머그컵", 2000);
		
		camera.SetName("니콘");
		camera.SetPrice(400000);
		
		camera.showInfo();
		cup.showInfo();
	}

}


