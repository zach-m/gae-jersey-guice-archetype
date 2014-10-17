#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.engine;

import javax.inject.Singleton;

@Singleton
public class MyImpl extends MySuperImpl implements MyIntf
{
	@Override
	public void foo()
	{
		log.info("MyImpl.foo()");
	}
}
