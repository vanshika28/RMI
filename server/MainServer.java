import java.rmi.*;
public class MainServer{
	public static void main(String args[]){
		try{
			RemoteInterface st = new RIImplement();
			Naming.rebind("rmi://localhost:1020/add",st);
			System.out.println("Sucessful server");
			
		}
		catch(Exception e){
			System.out.println("Server not Ready....");
		}
	}
}
