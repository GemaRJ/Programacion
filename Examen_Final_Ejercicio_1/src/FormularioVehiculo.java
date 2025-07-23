public class FormularioVehiculo {
    private String matricula;
    private String marca;
    private int anio;

    public void setMatricula(String matricula) throws LongitudMatriculaNoValidaException, FormatoMatriculaNoValidoException {
        if (matricula.length() != 7) {
            throw new LongitudMatriculaNoValidaException("La matrícula debe tener exactamente 7 caracteres.");
        }

        String ultimosTres = matricula.substring(4);
        for (char c : ultimosTres.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new FormatoMatriculaNoValidoException("Los últimos 3 caracteres deben ser letras.");
            }
        }

        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public boolean estaCompleto() {
        return matricula != null && marca != null && anio != 0;
    }
}