java.net.*;
class client
{
	public static void main(String[] args){
	        Socket s = new Socket("/localhost",8900);
			System.out.println("request has sent");
	}
}