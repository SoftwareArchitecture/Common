package at.ac.tuwien.softwarearchitecture.swazam.common.peerCommunication.impl;

import java.util.UUID;

import at.ac.tuwien.softwarearchitecture.swazam.common.peerCommunication.AbstractPeerCommand;

/**
 * 
 * To be used when SuperPeer ID is sent from the Server to the Peer
 *
 */
public class SetSuperPeerIDCommand extends AbstractPeerCommand{

	private UUID superPeerID;

	public SetSuperPeerIDCommand(UUID superPeerID) {
		super();
		this.superPeerID = superPeerID;
		this.type = AbstractPeerCommand.Type.SET_SUPER_PEER;
	}

	public UUID getSuperPeerID() {
		return superPeerID;
	}

	public void setSuperPeerID(UUID superPeerID) {
		this.superPeerID = superPeerID;
	}
	 
	
}
