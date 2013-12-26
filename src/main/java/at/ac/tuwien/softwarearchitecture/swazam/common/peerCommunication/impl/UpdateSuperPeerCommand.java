package at.ac.tuwien.softwarearchitecture.swazam.common.peerCommunication.impl;

import java.util.UUID;

import at.ac.tuwien.softwarearchitecture.swazam.common.peerCommunication.AbstractPeerCommand;

/**
 * 
 * Used when Peer leader election is executed
 *
 */
public class UpdateSuperPeerCommand extends AbstractPeerCommand{

	
	private UUID superPeerID;

	public UpdateSuperPeerCommand(UUID superPeerID) {
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
