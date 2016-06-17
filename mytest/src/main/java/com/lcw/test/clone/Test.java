package com.lcw.test.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Wife implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Date birthday;

	public Wife() {
		name = "芙蓉姐姐";
		birthday = new Date();
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Husband implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Wife wife;
	private Date birthday;

	public Husband() {
		wife = new Wife();
		birthday = new Date();
	}

	public Wife getWife() {
		return wife;
	}

	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 浅克隆一个对象
	 */
	@SuppressWarnings("finally")
	public Object clone() {
		Husband husband = null;
		try {
			husband = (Husband) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} finally {
			return husband;
		}
	}

	/**
	 * 利用串行化深克隆一个对象，把对象以及它的引用读到流里，在写入其他的对象
	 * 
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		// 将对象写到流里
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		// 从流里读回来
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
}

public class Test {
	public static void main(String[] args) {
		try {
			Husband husband = new Husband();
			System.out.println("husband birthday " + husband.getBirthday().getTime());
			System.out.println("wife birthday " + husband.getWife().getBirthday().getTime());
			System.out.println();
			Husband husband1 = (Husband) husband.clone();
			System.out.println("husband1 birthday " + husband1.getBirthday().getTime());
			System.out.println("wife birthday " + husband1.getWife().getBirthday().getTime());
			System.out.println();
			System.out.println("是否是同一个husband " + (husband == husband1));
			System.out.println("是否是同一个wife " + (husband.getWife() == husband1.getWife()));
			System.out.println();
			Husband husband2 = (Husband) husband.deepClone();
			System.out.println("husband2 birthday " + husband2.getBirthday().getTime());
			System.out.println("wife birthday " + husband2.getWife().getBirthday().getTime());
			System.out.println();
			System.out.println("是否是同一个husband " + (husband == husband2));
			System.out.println("是否是同一个wife " + (husband.getWife() == husband2.getWife()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}