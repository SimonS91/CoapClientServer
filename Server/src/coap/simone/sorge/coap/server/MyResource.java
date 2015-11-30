package coap.simone.sorge.coap.server;

import ch.ethz.inf.vs.californium.server.resources.CoapExchange;
import ch.ethz.inf.vs.californium.server.resources.ResourceBase;

public class MyResource extends ResourceBase
{
	public MyResource()
	{
		super("helloWorld");
		getAttributes().setTitle("Hello-World Resource");
	}
	@Override
	public void handleGET(CoapExchange exchange)
	{
		exchange.respond("hello World");
	}
}
