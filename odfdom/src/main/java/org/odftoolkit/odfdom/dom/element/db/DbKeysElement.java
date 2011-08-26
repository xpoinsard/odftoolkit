/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;

import org.odftoolkit.odfdom.dom.attribute.db.DbTypeAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element db:keys}.
 *
 */
public abstract class DbKeysElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "keys" );


	/**
	 * Create the instance of <code>DbKeysElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbKeysElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:keys}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}


	/**
	 * Create child element {@odf.element db:key}.
	 *
     * @param dbTypeAttributeValue  the <code>String</code> value of <code>DbTypeAttribute</code>, see {@odf.attribute  db:type} at specification
	 * @return   return  the element {@odf.element db:key}
	 * DifferentQName 
	 */
    
	public DbKeyElement newDbKeyElement(String dbTypeAttributeValue)
	{
		DbKeyElement  dbKey = ((OdfFileDom)this.ownerDocument).newOdfElement(DbKeyElement.class);
		dbKey.setDbTypeAttribute( dbTypeAttributeValue );
		this.appendChild( dbKey);
		return  dbKey;      
	}
    
}