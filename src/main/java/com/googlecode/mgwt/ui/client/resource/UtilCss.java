/*
 * Copyright 2011 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.ui.client.resource;

import com.google.gwt.resources.client.CssResource;

public interface UtilCss extends CssResource {
	public String landscapeonly();

	public String portraitonly();

	public String portrait();

	public String landscape();
	
//	 @Source("css/util_fake.css")
//	  UtilCss getUtilCss();
//
//	  // This is a very nasty workaround because GWT CssResource does not support
//	  // @media correctly!
//	  @Source("css/util.css")
//	  TextResource utilTextResource();
}
