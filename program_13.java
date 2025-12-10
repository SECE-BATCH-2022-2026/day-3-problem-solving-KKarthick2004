import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.print(UserMainCode.vowelCount(str));
	}
}

class UserMainCode{
	public static int vowelCount(String text){
	  int count=0;
	  for(int i=0;i<text.length();i++){
	  	char ch=text.charAt(i);
	  	
	  	switch(ch){
	  		case 'A':
	  		case 'a':
	  		case 'E':
	  		case 'e':
	  		case 'I':
	  		case 'i':
	  		case 'O':
	  		case 'o':
	  		case 'U':
	  		case 'u':
	  		    count++;
	  		    break;
	  	}
	  }
  return count;
}
}