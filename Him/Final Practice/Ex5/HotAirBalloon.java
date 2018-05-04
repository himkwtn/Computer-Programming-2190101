public class HotAirBalloon extends Vehicle{
	private int envelopeSize;
	public HotAirBalloon(int maxSpeed, int numberOfPassengers, int envelopeSize) {
		super(maxSpeed, numberOfPassengers);
		this.setEnvelopeSize(envelopeSize);
	}
	public int getEnvelopeSize() {
		return envelopeSize;
	}
	public void setEnvelopeSize(int envelopeSize) {
		this.envelopeSize = envelopeSize;
	}
}