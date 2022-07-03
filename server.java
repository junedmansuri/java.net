import java.net.*;
class server
{
	public static void main(){
	ServerSocket s = new ServerSocket(8900);
	System.out.println("waitng for client");
	Socket s1=s.accept();
	System.out.println("request accepted");
	
	}
}