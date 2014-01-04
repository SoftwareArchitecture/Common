package at.ac.tuwien.softwarearchitecture.swazam.common.infos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import ac.at.tuwien.infosys.swa.audio.Fingerprint;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SearchRequest")
public class FingerprintSearchRequest implements Serializable{
	
	@XmlElement(name = "ClientInfo", required = true)
	private ClientInfo clientInfo;
	
	@XmlElement(name = "Fingerprint", required = true)
	private Fingerprint fingerprint;
	
	public ClientInfo getClientInfo() {
		return clientInfo;
	}
	 
	public Fingerprint getFingerprint() {
		return fingerprint;
	}

	public FingerprintSearchRequest(ClientInfo clientInfo, Fingerprint fingerprint) {
		super();
		this.clientInfo = clientInfo;
		this.fingerprint = fingerprint;
	}

	public FingerprintSearchRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setClientInfo(ClientInfo clientInfo) {
		this.clientInfo = clientInfo;
	}

	public void setFingerprint(Fingerprint fingerprint) {
		this.fingerprint = fingerprint;
	}
	 
}
