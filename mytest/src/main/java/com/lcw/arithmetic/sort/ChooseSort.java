package com.lcw.arithmetic.sort;

public class ChooseSort {
	public static void main(String[] args) {
		ChooseSort.choose();
	}

	public static void choose() {
		int is[] = { 3, 2, 4, 5, 9, 7, 6, 1, 8 };
		int isLenth = is.length;
		int sortNumber;
		for (int i = 0; i < isLenth - 1; i++) {
			for (int j = i + 1; j < isLenth; j++) {
				sortNumber = is[i];
				if (sortNumber < is[j]) {
					is[i] = is[j];
					is[j] = sortNumber;
				}
			}
			System.out.print("第" + (i + 1) + "次排序结果:");
			for (int a = 0; a < isLenth; a++) {
				System.out.print(is[a] + "\t");
			}
			System.out.println();
		}
	}
}
