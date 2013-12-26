package at.ac.tuwien.softwarearchitecture.swazam.common.peerCommunication.impl;

import java.util.UUID;

import ac.at.tuwien.infosys.swa.audio.Fingerprint;
import at.ac.tuwien.softwarearchitecture.swazam.common.peerCommunication.AbstractPeerCommand;


/**
 * 
 * To be used in initiating a search for a Fingerprint, either from a Peer or a Server
 *
 */
public class SearchFingerprintCommand extends AbstractPeerCommand{
	//fingerprint to search for
	private Fingerprint fingerprint;
	
	public SearchFingerprintCommand(Fingerprint fingerprint) {
		super();
		this.fingerprint = fingerprint;
		this.type = AbstractPeerCommand.Type.SEARCH_FINGERPRINT;
	}

	public Fingerprint getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(Fingerprint fingerprint) {
		this.fingerprint = fingerprint;
	}
	
}
