package pers.imooc.first.demo6_9;

public class HelloWorld {
	public static void main(String[] args) {

		// 使用[][]的方式定义二维数组
		String[][] names = {{"tom", "jack", "mike"}, {"zhangsan", "lisi", "wangwu"}};

		// 通过二重循环输出二维数组中元素的值
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.println(names[i][j]);
			}
			System.out.println();
		}
	}
}