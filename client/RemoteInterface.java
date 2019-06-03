import java.rmi.*;
public interface RemoteInterface extends Remote{
	//for now , I will take
	public int add(int x , int y)throws RemoteException;
}