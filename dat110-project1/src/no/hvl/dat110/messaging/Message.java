package no.hvl.dat110.messaging;

public class Message {

	private byte[] payload;

	public Message(byte[] payload) {
		// TODO: check for length within boundary
		if (payload.length < MessageConfig.SEGMENTSIZE) {
			this.payload = payload;
		}
	}

	public Message() {
		super();
	}

	public byte[] getData() {
		return this.payload; 
	}

	public byte[] encapsulate() {
		
		byte[] encoded = new byte[MessageConfig.SEGMENTSIZE];
		
		// TODO
		// encapulate/encode the payload of this message in the
		// encoded byte array according to message format
		
		encoded[0] = (byte)this.payload.length;
		
		for (int i = 1; i <= this.payload.length; i++) {
			encoded[i] = this.payload[i-1];
		}
		
		return encoded;
		
	}

	public void decapsulate(byte[] received) {

		// TODO
		// decapsulate the data contained in the received byte array and store it 
		// in the payload of this message
		
		byte[] decoded = new byte[(int)received[0]];
		
		for (int i = 0; i < (int)received[0]; i++) {
			decoded[i] = received[i+1];
		}
		
		this.payload = decoded;
		
	}
}
