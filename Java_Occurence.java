public class Main {
	public static int first = -1;
	public static int last = -1;
	
	public static void printOcc(String str, char ch, int idx){
			if(idx == str.length()) {
				System.out.println(first);
				System.out.println(last);
				return;
			}
			char currCh = str.charAt(idx);
			if(currCh == ch) {
				if(first == -1) {
					first = idx;
				}
				else {
					last = idx;
				}
			}
			printOcc(str, ch, idx+1);
}		
	public static void main(String[] args) {
		String st = "Farhan" ;
		printOcc(st,'a',0);
	}
}