package com.lcw.test.baseclass;

import javax.swing.filechooser.FileSystemView;

public class TestString {
	public static void main(String[] args) {
		String a = new String();
		String b = "b";
		String c = null;
		String d = "1";
		String e = "2";
		System.out.println(d.length());
		System.out.println(e.compareTo(d));
		System.out.println(a+b);
		System.out.println(b+c);
		System.out.println(FileSystemView.getFileSystemView().getHomeDirectory());
	}
}
