/*  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package javax.portlet.tck.portlets;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import static java.util.logging.Logger.*;
import javax.xml.namespace.QName;
import javax.portlet.*;
import javax.portlet.filter.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.portlet.tck.beans.*;
import javax.portlet.tck.constants.*;
import static javax.portlet.tck.beans.JSR286SpecTestCaseDetails.*;
import static javax.portlet.tck.constants.Constants.*;
import static javax.portlet.PortletSession.*;
import static javax.portlet.ResourceURL.*;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 *
 * This is the main portlet for the test cases. If the test cases call for events, this portlet
 * will initiate the events, but not process them. The processing is done in the companion 
 * portlet AddlUrlTests_SPEC2_7_UrlRender_event
 *
 */
public class AddlUrlTests_SPEC2_7_UrlRender implements Portlet, ResourceServingPortlet {
   private static final String LOG_CLASS = 
         AddlUrlTests_SPEC2_7_UrlRender.class.getName();
   private final Logger LOGGER = Logger.getLogger(LOG_CLASS);
   
   private PortletConfig portletConfig = null;

   @Override
   public void init(PortletConfig config) throws PortletException {
      this.portletConfig = config;
   }

   @Override
   public void destroy() {
   }

   @Override
   public void processAction(ActionRequest portletReq, ActionResponse portletResp)
         throws PortletException, IOException {
      LOGGER.entering(LOG_CLASS, "main portlet processAction entry");

      portletResp.setRenderParameters(portletReq.getParameterMap());
      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      StringWriter writer = new StringWriter();

   }

   @Override
   public void serveResource(ResourceRequest portletReq, ResourceResponse portletResp)
         throws PortletException, IOException {
      LOGGER.entering(LOG_CLASS, "main portlet serveResource entry");

      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      PrintWriter writer = portletResp.getWriter();

   }

   @Override
   public void render(RenderRequest portletReq, RenderResponse portletResp)
         throws PortletException, IOException {
      LOGGER.entering(LOG_CLASS, "main portlet render entry");

      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      PrintWriter writer = portletResp.getWriter();

      JSR286SpecTestCaseDetails tcd = new JSR286SpecTestCaseDetails();

      // Create result objects for the tests

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_renderURL1                */
      /* Details: "When a render URL is triggered, the render method must     */
      /* be invoked"                                                          */
      TestResult tr0 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_RENDERURL1);
      /* TODO: implement test */
      tr0.appendTcDetail("Not implemented.");
      tr0.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_renderURL2                */
      /* Details: "When render parameters are set on a render URL, those      */
      /* parameters must become render parameters of the request resulting    */
      /* from triggering the renderURL"                                       */
      TestResult tr1 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_RENDERURL2);
      /* TODO: implement test */
      tr1.appendTcDetail("Not implemented.");
      tr1.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_renderURL3                */
      /* Details: "When render parameters are set on a render URL, those      */
      /* parameters must become render parameters of the request resulting    */
      /* from triggering the renderURL"                                       */
      TestResult tr2 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_RENDERURL3);
      /* TODO: implement test */
      tr2.appendTcDetail("Not implemented.");
      tr2.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_renderURL4                */
      /* Details: "Private render parameters can be set on the render URL     */
      /* through the setParameter(String, String) method"                     */
      TestResult tr3 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_RENDERURL4);
      /* TODO: implement test */
      tr3.appendTcDetail("Not implemented.");
      tr3.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_renderURL5                */
      /* Details: "Private render parameters can be set on the render URL     */
      /* through the setParameter(String, String[]) method"                   */
      TestResult tr4 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_RENDERURL5);
      /* TODO: implement test */
      tr4.appendTcDetail("Not implemented.");
      tr4.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_renderURL6                */
      /* Details: "Private render parameters can be set on the render URL     */
      /* through the setParameterMap(Map&lt;String, String[]&gt;) method"     */
      TestResult tr5 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_RENDERURL6);
      /* TODO: implement test */
      tr5.appendTcDetail("Not implemented.");
      tr5.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_renderURL7                */
      /* Details: "Public render parameters can be set on the render URL      */
      /* through the setParameter(String, String) method"                     */
      TestResult tr6 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_RENDERURL7);
      /* TODO: implement test */
      tr6.appendTcDetail("Not implemented.");
      tr6.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_renderURL8                */
      /* Details: "Public render parameters can be set on the render URL      */
      /* through the setParameter(String, String[]) method"                   */
      TestResult tr7 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_RENDERURL8);
      /* TODO: implement test */
      tr7.appendTcDetail("Not implemented.");
      tr7.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_renderURL9                */
      /* Details: "Public render parameters can be set on the render URL      */
      /* through the setParameterMap(Map&lt;String, String[]&gt;) method"     */
      TestResult tr8 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_RENDERURL9);
      /* TODO: implement test */
      tr8.appendTcDetail("Not implemented.");
      tr8.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_renderURL10               */
      /* Details: "If a parameter with an existing name is set through one    */
      /* of the setParameter methods, the existing value is repalced with     */
      /* the new value"                                                       */
      TestResult tr9 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_RENDERURL10);
      /* TODO: implement test */
      tr9.appendTcDetail("Not implemented.");
      tr9.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_renderURL11               */
      /* Details: "When a render URL is created, render parameters from the   */
      /* current request are not automatically copied to the new render       */
      /* URL"                                                                 */
      TestResult tr10 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_RENDERURL11);
      /* TODO: implement test */
      tr10.appendTcDetail("Not implemented.");
      tr10.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_portletMode1              */
      /* Details: "The portlet may not set a portlet mode that is not         */
      /* defined as supported in the deployment descriptor on a portlet       */
      /* URL"                                                                 */
      TestResult tr11 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_PORTLETMODE1);
      /* TODO: implement test */
      tr11.appendTcDetail("Not implemented.");
      tr11.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_portletMode2              */
      /* Details: "The portlet may not set a portlet mode on a portlet URL    */
      /* that it is not allowed to use"                                       */
      TestResult tr12 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_PORTLETMODE2);
      /* TODO: implement test */
      tr12.appendTcDetail("Not implemented.");
      tr12.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_portletMode4              */
      /* Details: "If the portlet mode is not set, the URL must have the      */
      /* portlet mode set for the current request as default"                 */
      TestResult tr13 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_PORTLETMODE4);
      /* TODO: implement test */
      tr13.appendTcDetail("Not implemented.");
      tr13.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_windowState1              */
      /* Details: "The portlet may not set a window state that is not         */
      /* defined as supported in the deployment descriptor on a portlet       */
      /* URL"                                                                 */
      TestResult tr14 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_WINDOWSTATE1);
      /* TODO: implement test */
      tr14.appendTcDetail("Not implemented.");
      tr14.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_windowState2              */
      /* Details: "The portlet may not set a window state on a portlet URL    */
      /* that it is not allowed to use"                                       */
      TestResult tr15 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_WINDOWSTATE2);
      /* TODO: implement test */
      tr15.appendTcDetail("Not implemented.");
      tr15.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_windowState4              */
      /* Details: "If the window state is not set, the URL must have the      */
      /* window state set for the current request as default"                 */
      TestResult tr16 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_WINDOWSTATE4);
      /* TODO: implement test */
      tr16.appendTcDetail("Not implemented.");
      tr16.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_setSecure1                */
      /* Details: "If setSecure is called with the parameter set to TRUE,     */
      /* the transport for the request triggered by the URL must be secure"   */
      TestResult tr17 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_SETSECURE1);
      /* TODO: implement test */
      tr17.appendTcDetail("Not implemented.");
      tr17.writeTo(writer);

      /* TestCase: V2AddlUrlTests_SPEC2_7_UrlRender_setSecure3                */
      /* Details: "If setSecure is not called, the transport for the          */
      /* request triggered by the URL should be at the same security level    */
      /* as the current request"                                              */
      TestResult tr18 = tcd.getTestResultFailed(V2ADDLURLTESTS_SPEC2_7_URLRENDER_SETSECURE3);
      /* TODO: implement test */
      tr18.appendTcDetail("Not implemented.");
      tr18.writeTo(writer);

   }

}