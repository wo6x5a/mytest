package com.lcw.test.clone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerializable implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name = "chenwulou";
	private static int age = 24;
	private transient String sex = "man";

	public static void main(String[] args) {
		// 以下代码实现序列化
		try {
			// 输出流保存的文件名为 my.out ；ObjectOutputStream能把Object输出成Byte流
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("my.out"));
			TestSerializable testSerializable = new TestSerializable();
			oos.writeObject(testSerializable);
			oos.flush(); // 缓冲流
			oos.close(); // 关闭流
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		fan();// 调用下面的 反序列化 代码
	}

	public static void fan()
	// 反序列的过程
	{	new TestSerializable().name="SheepMu_1";//!!!!!!!!!!!!!!!!重点看这两行 更改部分
		age=1;//<span style="font-family: verdana, 'ms song', 宋体, Arial, 微软雅黑, Helvetica, sans-serif; ">//!!!!!!!!!!!!!!!!!!!重点看这两行 更改部分</span>
		ObjectInputStream oin = null;// 局部变量必须要初始化
		try {
			oin = new ObjectInputStream(new FileInputStream("my.out"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		TestSerializable mts = null;
		try {
			mts = (TestSerializable) oin.readObject();// 由Object对象向下转型为MyTest对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("name=" + mts.name);
		System.out.println("age=" + mts.age);
		System.out.println("sex=" + mts.sex);
	}
}
