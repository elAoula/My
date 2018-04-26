package fi.cgi.otso.lt.junit.classes;

public class ParentClass {
	
	
	public int squareroot(int x) {
		return x*x;
	}
	
	public int numberOfCharachtersInAString(String word) {
		int count =0;
		for(int i=0; i< word.length(); i ++) {
			if(word.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}

}
