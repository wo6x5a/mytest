package com.lcw.arithmetic.sort;

/**
 * 
 * @author chenwulou
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort.bubble();
	}

	public static void bubble() {
		int is[] = { 3, 2, 4, 5, 9, 7, 6, 1, 8 };
		int isLenth = is.length;
		int sortNumber;
		for (int i = 0; i < isLenth - 1; i++) { // 最多做n-1趟排序
			for (int j = 0; j < isLenth - i - 1; j++) { // 对当前无序区间is[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
				sortNumber = is[j];
				if (sortNumber < is[j + 1]) { // 把小的值交换到后面
					is[j] = is[j + 1];
					is[j + 1] = sortNumber;
				}
			}
			System.out.print("第" + (i + 1) + "次排序结果：");
			for (int a = 0; a < is.length; a++) {
				System.out.print(is[a] + "\t");
			}
			System.out.println();
		}
	}

}
