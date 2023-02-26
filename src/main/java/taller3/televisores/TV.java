package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV; 
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getCanal() {
		return canal;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getNumTV() {
		return numTV;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public void setNumTV(int numTV) {
		TV.numTV = numTV;
		
	}
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public void canalUp() {
		if (estado == true && canal >= 1 && canal < 120) {
			canal++;
		}
	}
	public void canalDown() {
		if (estado == true && canal > 1 && canal <= 120) {
			canal--;
		}
	}
	public void volumenUp() {
		if (estado == true && volumen >= 0 && volumen < 7) {
			volumen++;
		}
	}
	public void volumenDown() {
		if (estado == true && volumen > 0 && volumen <= 7) {
			volumen--;
		}
	}
	
}
