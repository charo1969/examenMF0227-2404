package modelo;

import java.util.Calendar;

public class SeguroCoche extends Poliza {
	
	protected String matricula;
	protected int anioCarnet;
	
	
	
	public SeguroCoche() {
		super();
		this.matricula = "";
		this.anioCarnet = Calendar.getInstance().get(Calendar.YEAR);
	}

	//constructor
	public SeguroCoche(String idPoliza, String nombre, String apellidos, String dni, int anyo, String formaPago,
			double primaBase, int numSiniestrosHistorico, String matricula, int anioCarnet) {
		super(idPoliza, nombre, apellidos, dni, anyo, formaPago, primaBase, numSiniestrosHistorico);
		this.matricula = matricula;
		this.anioCarnet = anioCarnet;
	}
	
	
	
	// getters y setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnioCarnet() {
		return anioCarnet;
	}

	public void setAnioCarnet(int anioCarnet) {
		this.anioCarnet = anioCarnet;
	}

	// ToString
	@Override
	public String toString() {
		return "SeguroCoche [idPoliza=" + idPoliza + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", anyo=" + anyo + ", formaPago=" + formaPago + ", primaBase=" + primaBase
				+ ", numSiniestrosHistorico=" + numSiniestrosHistorico + ", matricula=" + matricula + ", anioCarnet="
				+ anioCarnet + "]";
	}

	@Override
	public double calcularPrima() {
		int antiguedadSeguro=
				Calendar.getInstance().get(Calendar.YEAR) - anyo;
		int antCarnet= 
				Calendar.getInstance().get(Calendar.YEAR) - anioCarnet;
		
		if(antiguedadSeguro>10) {
			antiguedadSeguro =10;
		}
		double primaTotal = primaBase - (primaBase*0.015)*antiguedadSeguro;
		if(antCarnet<5) {
			primaTotal = primaTotal + 75;
		}
		primaTotal=primaTotal + primaTotal*0.03*numSiniestrosHistorico;
		
		return primaTotal;
	}

}
