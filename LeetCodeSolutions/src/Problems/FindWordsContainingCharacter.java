package Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindWordsContainingCharacter {
//	public List<Integer> findWordsContaining(String[] words, char x) {
//
//		Set<Integer> tempSet = new HashSet<Integer>();
//
//		for (int i = 0; i < words.length; i++) {
//			for (int j = 0; j < words[i].length(); j++) {
//				if (words[i].charAt(j) == x) {
//					tempSet.add(i);
//				}
//			}
//		}
//		List<Integer> list = new ArrayList<Integer>(tempSet);
//
//		return list;
//	}

	public List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (words[i].charAt(j) == x) {
					list.add(i);
					break;
				}
			}
		}
		return list;
	}

}
