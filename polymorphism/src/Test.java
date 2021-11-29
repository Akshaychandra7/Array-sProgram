
public class Test {
void Show(int a){
	System.out.println("Showing 1");
	
}
void Show(String b){
	System.out.println("Showing 2");
	
}
public static void main(String[] args)
{
	Test s = new Test();
	s.Show(7);
	s.Show("Hello");
	
}
}

