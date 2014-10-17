#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api.v1;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ${package}.model.MyBean;

@Path("/debug")
@Singleton
public class DebugAPI
{
	@GET
	@Path("/xml")
	@Produces({ "text/xml", "application/xml" })
	public MyBean getXml()
	{
		return new MyBean();
	}

	@GET
	@Path("/json")
	@Produces("application/json")
	public MyBean getJson()
	{
		return new MyBean();
	}
}
