#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.engine;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class MySuperImpl
{
	@Inject
	protected Logger log;

	@PostConstruct
	private void postConstruct()
	{
		log.info("Created MySuperImpl()");
	}
}
