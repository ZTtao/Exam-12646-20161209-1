import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		int count = 0;
		List<Integer> list = new ArrayList<>();
		for(int i=101;i<=200;i++){
			if(isPrime(i)){
				count++;
				list.add(i);
			}
		}
		System.out.print("101-200间总共有"+count+"个素数，分别是：");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i));
			if(i<list.size()-1)System.out.print(",");
		}
	}
	private static boolean isPrime(int num){
		for(int i=2;i<Math.sqrt(num);i++){
			if(num%i==0)return false;
		}
		return true;
	}
}
