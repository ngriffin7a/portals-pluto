package org.apache.pluto.services;

import javax.portlet.PortalContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Defines the services necessary for integration between the Pluto Container
 * and a Portal.
 * @author <a href="ddewolf@apache.org">David H. DeWolf</a>
 */
public interface PortletContainerServices {

    /**
     * Retrieve the PortalContext associated with this group of container
     * services.
     * @return a PortalContext implementation.
     */
    PortalContext getPortalContext();

    /**
     * @return a PortalCallbackService implementation.
     */
    PortalCallbackService getPortalCallbackService();

}