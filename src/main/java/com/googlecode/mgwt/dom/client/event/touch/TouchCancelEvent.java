/*
 * Copyright 2010 Daniel Kurka
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
package com.googlecode.mgwt.dom.client.event.touch;

import com.google.gwt.dom.client.NativeEvent;

/**
 * This represents a native touchCanvel Event
 *
 * @author Daniel Kurka
 * @version $Id: $
 */
public class TouchCancelEvent extends TouchEvent<TouchCancelHandler> {

	private static final Type<TouchCancelHandler> TYPE = new Type<TouchCancelHandler>("touchcancel", new TouchCancelEvent());

  public static TouchCancelEvent from(NativeEvent nativeEvent) {
    TouchCancelEvent touchCancelEvent = new TouchCancelEvent();
    touchCancelEvent.setNativeEvent(nativeEvent);
    return touchCancelEvent;
  }
	
	/**
	 * <p>getType</p>
	 *
	 * @return a Type object.
	 */
	public static Type<TouchCancelHandler> getType() {
		return TYPE;
	}

	/**
	 * {@inheritDoc}
	 *
	 * Gets the event type associated with animation end events.
	 */
	@Override
	public com.google.gwt.event.dom.client.DomEvent.Type<TouchCancelHandler> getAssociatedType() {
		return TYPE;
	}

	/**
	 * <p>Constructor for TouchCancelEvent.</p>
	 */
	protected TouchCancelEvent() {

	}

	/** {@inheritDoc} */
	@Override
	protected void dispatch(TouchCancelHandler handler) {
		handler.onTouchCanceled(this);

	}



}
