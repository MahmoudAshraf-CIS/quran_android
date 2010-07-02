package com.quran.labs.androidquran.util;

public class QuranScreenInfo {

	private static QuranScreenInfo instance = null;
	
	private int width;
	private int height;
	private int max_width;
	
	private QuranScreenInfo(int width, int height){
		this.width = width;
		this.height = height;
		this.max_width = (width > height)? width : height;
	}
	
	public static QuranScreenInfo getInstance(){
		return instance;
	}
	
	public static void initialize(int width, int height){
		instance = new QuranScreenInfo(width, height);
	}
	
	public int getWidth(){ return this.width; }
	public int getHeight(){ return this.height; }
	
	public String getWidthParam(){
		if (this.max_width <= 480) return "_480";
		else return "_800";
	}
}