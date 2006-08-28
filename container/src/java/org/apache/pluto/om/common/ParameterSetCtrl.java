/*
 * Copyright 2003,2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/* 

 */

package org.apache.pluto.om.common;

/**
 * <P>
 * The <CODE>ParameterSetCtrl</CODE> interface  ...
 * </P>
 * <P>
 * This interface defines the controller as known from the MVC pattern.
 * Its purpose is to provide write access to the data stored in the model.
 * </P>
 * 

 */

public interface ParameterSetCtrl extends org.apache.pluto.om.Controller
{


    /**
     * Creates a new parameter and adds it to the set
     * 
     * @param name   the name of the new parameter
     * @param value  the value of the new parameter
     * 
     * @return the new parameter
     */
    public Parameter add(String name, String value);

    /**
     * Removes the parameter with the given name
     * from the set
     * 
     * @param name   the name of the parameter to be removed
     * 
     * @return the removed parameter
     */
    public Parameter remove(String name);

    /**
     * Removes the given parameter from the set
     * 
     * @param parameter the parameter to be removed
     */
    public void remove(Parameter parameter);

}