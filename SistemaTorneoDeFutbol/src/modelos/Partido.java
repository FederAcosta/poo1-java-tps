package modelos;

import java.time.LocalDate;

public class Partido {
	
	private int idPartido;                     
    private LocalDate fecha;
    private String estadio;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

	
    public Partido(LocalDate fecha, String estadio, Equipo equipoLocal,
            Equipo equipoVisitante, int idPartido, int golesLocal, int golesVisitante) {
    	this.fecha = fecha;
    	this.estadio = estadio;
    	this.equipoLocal = equipoLocal;
    	this.equipoVisitante = equipoVisitante;
    	this.idPartido = idPartido;
    	this.golesLocal = golesLocal;
    	this.golesVisitante = golesVisitante;
    }
    
	public int getIdPartido() { return idPartido; }
    public void setIdPartido(int idPartido) { this.idPartido = idPartido; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getEstadio() { return estadio; }
    public void setEstadio(String estadio) { this.estadio = estadio; }

    public Equipo getEquipoLocal() { return equipoLocal; }
    public void setEquipoLocal(Equipo equipoLocal) { this.equipoLocal = equipoLocal; }

    public Equipo getEquipoVisitante() { return equipoVisitante; }
    public void setEquipoVisitante(Equipo equipoVisitante) { this.equipoVisitante = equipoVisitante; }
    
    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    @Override
    public String toString() {
        return "Partido [id=" + idPartido + ", fecha=" + fecha +
               ", estadio=" + estadio + ", local=" + equipoLocal.getNombreEquipo() +
               ", visitante=" + equipoVisitante.getNombreEquipo() + "]";
    }
}
