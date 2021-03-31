import java.util.Random;

public class test {
	public static void main(String[] args) {


	Random random=new Random();
	int a=random.nextInt(1000);
	int b=random.nextInt(1000);
	if(a<10&&b<10) {
		System.out.println("a="+(a*50)+","+"b="+(b*50));
	}else {
		System.out.println("a+b="+(a+b));
		
	}
	
    }

	

}
