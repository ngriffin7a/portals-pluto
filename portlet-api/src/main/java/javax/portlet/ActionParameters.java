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

/*
 * This source code implements specifications defined by the Java
 * Community Process. In order to remain compliant with the specification
 * DO NOT add / change / or delete method signatures!
 */

package javax.portlet;


/**
 * <div class="changed_added_3_0">
 * Action parameters are additional portlet parameters added to the portlet 
 * URL or provided by the client that extend the state information provided by 
 * the render parameters.
 * The client can supply additional action parameters when a form is submitted, for example.
 * <p>
 * {@link PortletParameters} provides a description of the parameter concept.
 * </div>
 * @see     PortletParameters
 * @see     MutableActionParameters
 * @see     ActionRequest
 * @see     ActionURL
 * @since   3.0
 */
public interface ActionParameters extends PortletParameters
{

   
   /**
    * <div class="changed_added_3_0">
    * Returns a <code>MutableActionParameters</code> object encapsulating a copy of the same
    * parameters as the original object.
    * Changing a mutable copy will not influence the source object. 
    * </div>
    * 
    * @return Mutable clone of ActionParameters object
    */
   
   public MutableActionParameters clone();

}
