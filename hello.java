public class hello{
	public static void main(String [] args)
	{
		System.out.println("hello world");
		student s1 =new student();
		s1.show();
		s1.test();
	}
}
class student{
	public void show()
	{
		System.out.println("my name is Yuuka");
	}
	public void test()
	{
		System.out.println("Yuuka math score is 99");
	}
}
