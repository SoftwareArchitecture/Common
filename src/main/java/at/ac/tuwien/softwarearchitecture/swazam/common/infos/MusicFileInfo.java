package at.ac.tuwien.softwarearchitecture.swazam.common.infos;

import java.io.Serializable;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Info that can be used to fully describe a Music file found after a Fingerprint search.
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MusicFileInfo")
public class MusicFileInfo implements Serializable{
	
    @XmlElement(name = "description", required = true)
	private String description;

	public MusicFileInfo(String description) {
		super();
		this.description = description;
	}
	
	public MusicFileInfo() {
		super();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
    public boolean isEmpty(){
    	return description==null || description.trim().length() == 0;
    }
	

}
