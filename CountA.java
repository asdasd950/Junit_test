package test;

public class CountA {
public int CountAMethod(String word) {
	int count = 0;
	for(int i = 0 ;i<word.length();i++) {
		if(word.charAt(i)=='a'||word.charAt(i)=='A') {
			count++;
		}
	}
	return count;
}
}
