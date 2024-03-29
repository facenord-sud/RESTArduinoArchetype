/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package providers;

import com.sun.jersey.spi.inject.SingletonTypeInjectableProvider;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;
import utils.JPAUtils;

/**
 *
 * @author <a href="mailto:andreas.ruppen@gmail.com">Andreas Ruppen</a>
 */
@Provider
public class JPAUtilsProvider extends SingletonTypeInjectableProvider<Context, JPAUtils>  {

    public JPAUtilsProvider()
    {
        super(JPAUtils.class, new JPAUtils());
    }
}
