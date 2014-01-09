package at.ac.tuwien.softwarearchitecture.swazam.common.infos;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.UUID;

/*
 * Helper Class for usefull methods
 */
public class Helper {

	public static String generateSession() {
		// Generate SessionKey
		UUID uniqueKey = UUID.randomUUID();
		String sessionKey = String.valueOf(uniqueKey);
		return sessionKey;
					
	}
	
	public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(b);
        o.writeObject(obj);
        return b.toByteArray();
    }

    public static Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream b = new ByteArrayInputStream(bytes);
        ObjectInputStream o = new ObjectInputStream(b);
        return o.readObject();
    }
}
