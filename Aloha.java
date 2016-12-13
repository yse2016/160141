public class Aloha  {
	public static void main (String[] args){
		String mainMsg ="アロハ！";
		String subMsg ="ALOHA!";
		for(int i =0; i<20; i++){
			if(i%3 ==0) {
			   mainMsg = new java.util.Scanner(System.in).nextLine();
			}else{
			   subMsg = new java.util.Scanner(System.in).nextLine();
	      }
	System.out.println(mainMsg);
	System.out.println(subMsg);
	}
    }
}
