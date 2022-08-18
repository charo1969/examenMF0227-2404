package modelo;

public class SeguroCoche extends Poliza {
	
	protected String matricula;
	protected int anioCarnet;
	
	
	
	public SeguroCoche() {
		super();
		this.matricula = "";
		this.anioCarnet = 0;
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
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

}
