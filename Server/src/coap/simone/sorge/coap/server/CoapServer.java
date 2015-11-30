package coap.simone.sorge.coap.server;

import java.net.SocketException;
import java.util.concurrent.Executors;

import ch.ethz.inf.vs.californium.server.Server;

public class CoapServer extends Server
{
	public static void main(String args[])
	{
		try
		{
			CoapServer server = new CoapServer();
			server.start();
		}
		catch(SocketException e)
		{
			System.out.println("Failed to initialize server: "+e.getMessage());
		}
	}
	public CoapServer() throws SocketException 
	{
		add(new MyResource());
	}
}
