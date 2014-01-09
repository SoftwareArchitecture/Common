package at.ac.tuwien.softwarearchitecture.swazam.common.infos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import ac.at.tuwien.infosys.swa.audio.Fingerprint;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SearchRequest")
public class FingerprintSearchResponse implements Serializable{
	
	@XmlElement(name = "ClientInfo", required = true)
	private ClientInfo clientInfo;
	
	@XmlElement(name = "PeerInfo", required = true)
	private PeerInfo peerInfo;
	
	@XmlElement(name = "MusicFileInfo", required = true)
	private MusicFileInfo musicFileInfo;
	
	
	public FingerprintSearchResponse(ClientInfo clientInfo, PeerInfo peerInfo, MusicFileInfo musicFileInfo) {
		super();
		this.clientInfo = clientInfo;
		this.peerInfo = peerInfo;
		this.musicFileInfo = musicFileInfo;
	}
	
	public FingerprintSearchResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientInfo getClientInfo() {
		return clientInfo;
	}
	 
	public MusicFileInfo getFingerprint() {
		return musicFileInfo;
	}
 
	public void setClientInfo(ClientInfo clientInfo) {
		this.clientInfo = clientInfo;
	}

	public void setFingerprint(MusicFileInfo fingerprint) {
		this.musicFileInfo = musicFileInfo;
	}

	public PeerInfo getPeerInfo() {
		return peerInfo;
	}

	public void setPeerInfo(PeerInfo peerInfo) {
		this.peerInfo = peerInfo;
	}
	
	 
}
