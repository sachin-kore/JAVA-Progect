package preInstaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonSentencesInString {

	public String[] uncommonFromSentences(String A, String B) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		String finalString=A+" "+B;
		for(String s:finalString.split(" ")) {
			if(map.containsKey(s))
				//map.put(s,map.getOrDefault(s,0)+1);
				map.put(s,map.get(s)+1);
			else
				map.put(s,1);
		}
		List<String> list=new ArrayList<>();
		for(String s:map.keySet()) {
			if(map.get(s)==1) {
				list.add(s);
			}
		}
		String[] ans=new String[list.size()];
		for(int i=0; i<list.size(); ++i) {
			ans[i]=list.get(i);
		}
		return ans;
	}

	public static void main(String[] args) {
        String str1="this apple is sweet";
        String str2="this apple is sour";
        UncommonSentencesInString Un=new UncommonSentencesInString();
        System.out.print(Un.uncommonFromSentences(str1,str2));
	}

}
/*  public String[] uncommonFromSentences(String A, String B) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	for (String token : A.split(" ")) {
		map.put(token, map.getOrDefault(token, 0) + 1);
	}
	for (String token : B.split(" ")) {
		map.put(token, map.getOrDefault(token, 0) + 1);
	}         
	List<String> list = new ArrayList<String>();
	for (String key : map.keySet()) {
		if (map.get(key) == 1) {
			list.add(key);
		}
	}
	return list.toArray(new String[list.size()]);
}                        */
