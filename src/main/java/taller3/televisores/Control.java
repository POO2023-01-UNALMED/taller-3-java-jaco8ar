package taller3.televisores;

public class Control {
	
	TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
	}
	public TV getTV() {
		return tv;
	}
	public void setTV(TV tv) {
		this.tv = tv;
	}
	public void turnOn() {
		tv.estado = true;
	}
	public void turnOff() {
		tv.estado = false;
	}
	public void canalUp() {
		if (tv.estado == true && tv.canal >= 1 && tv.canal < 120) {
			tv.canal++;
		}
	}
	public void canalDown() {
		if (tv.estado == true && tv.canal > 1 && tv.canal <= 120) {
			tv.canal--;
		}
	}
	public void volumenDown() {
		if (tv.estado == true && tv.volumen > 0 && tv.volumen <= 7) {
			tv.volumen--;
		}
	}
	
	public void setCanal(int canal) {
		this.tv.canal = canal;
	}
	public void volumenUp() {
		// TODO Auto-generated method stub
		if (tv.estado == true && tv.volumen >= 0 && tv.volumen < 7) {
			tv.volumen++;
		}
	}
	
}
