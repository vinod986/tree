
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
public class set {
	public static void stringa(String s1) {
		HashMap<Character,Integer>all=new HashMap<>();
		char ch[]=s1.toCharArray();
		for(char ab:ch) {
			if(all.containsKey(ab)) {
				all.put(ab, all.get(ab)+1);
			}
			else {
				all.put(ab, 1);
			}
		}
		System.out.println("the duplicate elements are:");
		Set<Character>se=all.keySet();
		for(Character c:se) {
			if((all.get(c)>1)){
				System.out.println(c+":"+all.get(c));
			}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" java is very easy";
		stringa(s1);
	}
	}