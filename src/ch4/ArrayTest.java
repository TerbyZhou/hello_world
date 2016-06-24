package ch4;
import java.util.*;

public class ArrayTest {

	/**
	 * 约瑟夫出圈游戏：m个人围成一个收尾相连的圈开始报数，从第一个人开始，由1开始报
	 * 报到n的人出圈，剩下的人继续从1开始报，直到所有人出圈为止
	 * 对于给定的m和n，求所有人的出圈顺序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入总人数m：");
		Scanner sca=new Scanner(System.in);
		int m=sca.nextInt();
		System.out.println("请输入要出圈的数值：");
		int n=sca.nextInt();
		System.out.println("请输出出圈的顺序：");
		int[] a=new int[m];//创建int型数组，有m个元素
		int len=m;
		for(int i=0;i<m;i++){
			a[i]=i+1;
		}
		
		int i=0,j=1;
		while(len>0){
			if(a[i%m]>0){
				if(j%n==0){
					//找到要出圈的人，并把圈中的人数减1
					System.out.println(a[i%m]+"");
					a[i%m]=-1;//出圈后相应位置上减1
					j=1;//重新报数，从1开始
					i++;
					len--;
				}
				else{
					i++;
					j++;
				}
			}
			else{
				i++;
			}
		}

	}

}
