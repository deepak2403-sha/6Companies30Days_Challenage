package day1to5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public static List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : string_list){
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String sortedString = new String(str);
            List<String> list = map.getOrDefault(sortedString, new ArrayList<>());
            list.add(s);
            map.put(sortedString, list);
        }
//        System.out.println(map);
        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet()) {
        	ans.add(map.get(key));
        }
//        System.out.println(ans);
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"act","god","cat","dog","tac"};
		System.out.println(Anagrams(array));

	}
}
