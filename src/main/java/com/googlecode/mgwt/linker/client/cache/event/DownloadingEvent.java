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
package com.googlecode.mgwt.linker.client.cache.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

/**
 * The user agent has found an update and is fetching it, or is downloading the
 * resources listed by the manifest for the first time.
 *
 * @author Daniel Kurka
 *
 */
public class DownloadingEvent extends GwtEvent<DownloadingEvent.Handler> {
	public interface Handler extends EventHandler {
		public void onDownloadingEvent(DownloadingEvent event);
	}

	private static final GwtEvent.Type<Handler> TYPE = new Type<Handler>();

	public static GwtEvent.Type<Handler> getType() {
		return TYPE;
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<Handler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(Handler handler) {
		handler.onDownloadingEvent(this);
	}
}
