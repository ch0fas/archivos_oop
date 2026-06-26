package iteso;

public enum Days {
	LUNES("LUNES", "MONDAY", "LUNDI"),
	MARTES("MARTES", "TUESDAY", "MARDI"),
	MIERCOLES("MIERCOLES","WEDNESDAY", "MERCREDI"),
	JUEVES("JUEVES", "THURSDAY", "JEUDI"),
	VIERNES("VIERNES" ,"FRIDAY", "VENDREDI"),
	SABADO("SABADO", "SATURDAY", "SAMEDI"),
	DOMINGO("DOMINGO","SUNDAY", "DIMANCHE");

	private String español;
    private String ingles;
    private String frances;
	private Language idioma = Language.ESPAÑOL;

	private Days(String español, String ingles, String frances) {
		 this.español = español;
	     this.ingles = ingles;
	     this.frances = frances;
	}

	public String español() {
		return español;
	}

	public String ingles() {
		return ingles;
	}

	public String frances() {
		return frances;
	}

	public void cambiarIdioma(Language idioma) {
        this.idioma = idioma;
    }

	@Override
	public String toString() {
		switch (idioma) {

        case ESPAÑOL:
            return español;

        case INGLES:
            return ingles;

        case FRANCES:
            return frances;

        default:
            return español;
    }
	}
}