/*
 * Copyright (C) 2010 by Isaiah van der Elst <isaiah.v@comcast.net>
 * Use and distribution licensed under the BSD license.  See
 * the COPYING file in the parent directory for full text.
 */

package org.gearman.impl.server.local;


/**
 * Notifies any interested objects that a server client has disconnected.
 * @author isaiah
 */
interface ClientDisconnectListener {
	
	/**
	 * Triggered on the even that a server client has disconnected
	 * @param client
	 * 		The ServerClient that has disconnected
	 */
	public void onDisconnect(Client client);
}
