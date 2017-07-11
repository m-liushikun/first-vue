import java.util.Scanner;
public class guess{
	public static void main(String[] args){
	 	Scanner in=new Scanner(System.in);
		System.out.println("----qing猜拳----");
		System.out.println("清楚全（1.剪刀2.石头3.布)");
		int person=in.nextInt();
		int computer=(int)(Math.random()*3)+1;
		System.out.println(computer);
		}
	}
