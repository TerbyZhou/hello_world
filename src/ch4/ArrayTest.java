package ch4;
import java.util.*;

public class ArrayTest {

	/**
	 * Լɪ���Ȧ��Ϸ��m����Χ��һ����β������Ȧ��ʼ�������ӵ�һ���˿�ʼ����1��ʼ��
	 * ����n���˳�Ȧ��ʣ�µ��˼�����1��ʼ����ֱ�������˳�ȦΪֹ
	 * ���ڸ�����m��n���������˵ĳ�Ȧ˳��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������m��");
		Scanner sca=new Scanner(System.in);
		int m=sca.nextInt();
		System.out.println("������Ҫ��Ȧ����ֵ��");
		int n=sca.nextInt();
		System.out.println("�������Ȧ��˳��");
		int[] a=new int[m];//����int�����飬��m��Ԫ��
		int len=m;
		for(int i=0;i<m;i++){
			a[i]=i+1;
		}
		
		int i=0,j=1;
		while(len>0){
			if(a[i%m]>0){
				if(j%n==0){
					//�ҵ�Ҫ��Ȧ���ˣ�����Ȧ�е�������1
					System.out.println(a[i%m]+"");
					a[i%m]=-1;//��Ȧ����Ӧλ���ϼ�1
					j=1;//���±�������1��ʼ
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
