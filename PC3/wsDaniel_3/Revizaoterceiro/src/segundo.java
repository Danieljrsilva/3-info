public abstract class segundo {
	protected float consini;
	protected float consfin;
	protected float tot;
	public segundo() {
		
	}
	public segundo(float consini, float consfin, float tot) {
		this.consini = consini;
		this.consfin = consfin;
		this.tot = tot;
	}
	@Override
	public String toString() {
		return "segundo [consini=" + consini + ", consfin=" + consfin + ", tot=" + tot + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public float getConsini() {
		return this.consini;
	}
	public void setConsini(float consini) {
		this.consini = consini;
	}
	public float getConsfin() {
		return this.consfin;
	}
	public void setConsfin(float consfin) {
		this.consfin = consfin;
	}
	public float getTot() {
		return this.tot;
	}
	public void setTot(float tot) {
		this.tot = tot;
	}
}
