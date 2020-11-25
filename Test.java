package test;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public void test() {
		
		
		System.out.println("系统已经生成了一个1-100的随机数快来猜猜看");
		Random random = new Random();
		int i=random.nextInt(100)+1;
		
		System.out.println("请输入你要猜的值：");
		Scanner in = new Scanner(System.in);
		int input=in.nextInt();
		
		while(true) {
			if(i==input) {
				System.out.println("恭喜你才对了;该随机数的值为："+i);
				break;
			}else if(i>input){
				System.out.println("你输入的值过小了，请再猜一次");
				
				input=in.nextInt();
			}else if(i<input) {
				System.out.println("你输入的值过大了，请再猜一次");
				
				input=in.nextInt();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.test();
		System.out.prinln("hahha");
!!!!!!!!!!!
	}

}
