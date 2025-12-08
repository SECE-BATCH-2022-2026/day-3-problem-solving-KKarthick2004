import java.io.*;
class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer n=Integer.parseInt(br.readLine());
		String str[]=new String[n];
		for(int i=0;i<n;i++){
			str[i]=br.readLine();
		}
		System.out.print(UserMainCode.nthChar(str));
	}
}
class UserMainCode{
	public static String nthChar(String[] str){
		StringBuilder s=new StringBuilder();
		for(String val:str){
			if(val.length()==0){
				s.append("$");
			}
			else{
				s.append(val.charAt(val.length()-1));
			}
		}
		return s.toString();
	}
}