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
		//used when Server sends to the Peer the superPeer ID
		SET_SUPER_PEER,
		//used for searching for a fingerprint
		SEARCH_FINGERPRINT,
		
		//used when a Peer requests to a super Peer to join the ring
		JOIN_RING,
		
		//used in Peer2Peer leader election
		UPDATE_SUPER_PEER;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
}
