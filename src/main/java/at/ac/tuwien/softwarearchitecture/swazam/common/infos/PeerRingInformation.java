package at.ac.tuwien.softwarearchitecture.swazam.common.infos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import ac.at.tuwien.infosys.swa.audio.Fingerprint;

/**
 * Used when broadcasting the fingerprint information to other peers
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PeerRingInformation")
public class PeerRingInformation implements Serializable {

	@XmlElement(name = "SuperPeerInfo", required = true)
	private PeerInfo superPeerInfo;
	
	@XmlElement(name = "PeerRingElement", required = true)
	private Collection<PeerInfo> peerRing;

	{
		peerRing = new ArrayList<PeerInfo>();
	}

	
	public PeerInfo getSuperPeerInfo() {
		return superPeerInfo;
	}

	public void setSuperPeerInfo(PeerInfo superPeerInfo) {
		this.superPeerInfo = superPeerInfo;
	}

	public Collection<PeerInfo> getPeerRing() {
		return peerRing;
	}

	public void setPeerRing(Collection<PeerInfo> peerRing) {
		this.peerRing = peerRing;
	}

	public void addPeerRing(Collection<PeerInfo> peerRing) {
		this.peerRing.addAll(peerRing);
	}

	public void addPeer(PeerInfo peer) {
		this.peerRing.add(peer);
	}

	public void removePeerRing(Collection<PeerInfo> peerRing) {
		this.peerRing.removeAll(peerRing);
	}

	public void removePeer(PeerInfo peer) {
		this.peerRing.remove(peer);
	}

}