package lab4;

public class Sample_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar rccar1 = new RacingCar();
		rccar1.newshow();
	}
	
}

class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�N�����]��" + num + "�A�T�o�q�]��" + gas);
	}
	
	public void show()
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
}

class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]��" + course);
	}
	
	public void newshow()
	{
		System.out.println("�ɨ����s���O" + num);
		System.out.println("�T�o�q�O" + gas);
		System.out.println("�ɨ��s���O" + course);
	}
}