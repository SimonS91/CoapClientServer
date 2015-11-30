package com.simone.sorge.coap.client;

import ch.ethz.inf.vs.californium.coap.Request;
import ch.ethz.inf.vs.californium.coap.Response;

public class ClientCoap 
{
	public static void main (String args[])
	{
		try
		{
			Request request = Request.newGet();
			request.setURI("localhost:5683/helloWorld");
			request.send();
			Response res = request.waitForResponse(1000);
			if (res != null) {
				// response received, output a pretty-print
				System.out.println(res);
			} else {
				System.out.println("No response received.");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}