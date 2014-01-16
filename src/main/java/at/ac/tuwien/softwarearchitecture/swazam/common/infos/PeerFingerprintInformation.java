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
@XmlRootElement(name = "SearchRequest")
public class PeerFingerprintInformation implements Serializable{
	
	@XmlElement(name = "PeerInfo", required = true)
	private PeerInfo peerInfo;
	
	@XmlElement(name = "Fingerprint", required = true)
	private Collection<Fingerprint> fingerprints;
	
	{
		fingerprints  = new ArrayList<Fingerprint>();
	}
	 
	public PeerInfo getPeerInfo() {
		return peerInfo;
	}

	public Collection<Fingerprint> getFingerprints() {
		return fingerprints;
	}

	public void setFingerprints(Collection<Fingerprint> fingerprints) {
		this.fingerprints = fingerprints;
	}

	public void setPeerInfo(PeerInfo peerInfo) {
		this.peerInfo = peerInfo;
	}

	public PeerFingerprintInformation(PeerInfo peerInfo, Collection<Fingerprint> fingerprints) {
		super();
		this.peerInfo = peerInfo;
		this.fingerprints = fingerprints;
	}

	public PeerFingerprintInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
	 
}