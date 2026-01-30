import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer>map=new HashMap<>();
		List<Character> words = Arrays.asList('a','b','a','a','c','b');
		for(int i=0;i<words.size();i++)
		{
			Character key=words.get(i);
			map.put(key,(map.getOrDefault(key,0)+1));
		}
		System.out.println(map);

	}

}
