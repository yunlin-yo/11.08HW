package test_p6;

public class test_p6 {

	public static void main(String[]args)
	{
		RacingCar rccar1=new RacingCar(1234,20.5,5);
	}
}
class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public Car(int n ,double g)
	{
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public RacingCar(int n,double g,int c)
	{
		super(n,g);
		course=c;
		System.out.println("�Ͳ��F�s����"+course+"���ɨ�");
	}
	public void setCourse(int c)
	{
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
}
