package at.ac.tuwien.softwarearchitecture.swazam.common.peerCommunication;

import java.io.Serializable;

public abstract class AbstractPeerCommand implements Serializable{
	
	protected Type type = Type.UPDATE_SUPER_PEER;
	
	/**
	 * 
	 * Enum to hold types of Peer API commands. Makes it easier to switch(type) and process command on the Peer side.
	 *
	 */
	public enum Type{
		SET_SUPER_PEER,
		SEARCH_FINGERPRINT,
		UPDATE_SUPER_PEER;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
}
