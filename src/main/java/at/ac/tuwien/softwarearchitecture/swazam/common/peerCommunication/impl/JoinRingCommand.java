package at.ac.tuwien.softwarearchitecture.swazam.common.peerCommunication.impl;

import ac.at.tuwien.infosys.swa.audio.Fingerprint;
import at.ac.tuwien.softwarearchitecture.swazam.common.infos.PeerInfo;
import at.ac.tuwien.softwarearchitecture.swazam.common.peerCommunication.AbstractPeerCommand;

/**
 * 
 * Used when a Peer requests to a SuperPeer to join the ring
 *
 */
public class JoinRingCommand extends AbstractPeerCommand{
	private PeerInfo info;
	
	public JoinRingCommand(PeerInfo info) {
		super();
		this.info = info;
		this.type = AbstractPeerCommand.Type.JOIN_RING;
	}

	public PeerInfo getInfo() {
		return info;
	}

	public void setInfo(PeerInfo info) {
		this.info = info;
	}
	
}
