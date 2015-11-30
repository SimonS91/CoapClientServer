package com.simone.sorge.coap.client;

import ch.ethz.inf.vs.californium.CoapClient;
import ch.ethz.inf.vs.californium.CoapHandler;
import ch.ethz.inf.vs.californium.CoapResponse;

public class ClientCoap 
{
	public static void main(String args[])
	{
		CoapClient client = new CoapClient("coap://localhost:5683/helloWorld");
		client.get(new CoapHandler()
				{
					
					@Override
					public void onLoad(CoapResponse response)
					{
						String content = response.getResponseText();
						System.out.println(content);
					}
					@Override
					public void onError()
					{
						System.err.println("Failed");
					}
				});
	}
}
