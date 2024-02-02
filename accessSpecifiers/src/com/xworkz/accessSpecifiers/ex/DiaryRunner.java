package com.xworkz.accessSpecifiers.ex;

import com.xworkz.accessSpecifiers.Diary;

public class DiaryRunner {
	public static void main(String[] args) {
		Diary diary=new Diary(100);
		System.out.println(diary.noOfPages);
		diary.diplay();
		
	}

}
