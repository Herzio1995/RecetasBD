package Aplicacion;

import java.awt.TextArea;
import java.time.LocalDate;

public class userStory {
   private String titulo;
   private int ID;
   private String autor;
   private String yo;
   private String como;
   private String requiero;
   private TextArea talQue;
   private TextArea condicionesDeAceptacion;
   private LocalDate fecha;
   private int complejidad;
   private int importancia = 0;
   
   public userStory(String titulo,int ID,String autor,String yo,String como,String requiero,TextArea talQue, 
		   				TextArea condicionesDeAceptacion,LocalDate fecha,int complejidad, int importancia){
	   this.setTitulo(titulo);
	   this.setID(ID);
	   this.setAutor(autor);
	   this.setYo(yo);
	   this.setComo(como);
	   this.setRequiero(requiero);
	   this.setTalQue(talQue);
	   this.setCondicionesDeAceptacion(condicionesDeAceptacion);
	   this.fecha = fecha;
	   this.setComplejidad(complejidad);
	   this.setImportancia(importancia);
   }
   
    public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getYo() {
		return yo;
	}
	
	public void setYo(String yo) {
		this.yo = yo;
	}
	
	public String getComo() {
		return como;
	}
	
	public void setComo(String como) {
		this.como = como;
	}
	
	public String getRequiero() {
		return requiero;
	}
	
	public void setRequiero(String requiero) {
		this.requiero = requiero;
	}
	
	public TextArea getTalQue() {
		return talQue;
	}

	public void setTalQue(TextArea talQue) {
		this.talQue = talQue;
	}

	public TextArea getCondicionesDeAceptacion() {
		return condicionesDeAceptacion;
	}

	public void setCondicionesDeAceptacion(TextArea condicionesDeAceptacion) {
		this.condicionesDeAceptacion = condicionesDeAceptacion;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public int getComplejidad() {
		return complejidad;
	}
	
	public void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}
	
	public int getImportancia() {
		return importancia;
	}
	
	public void setImportancia(int importancia) {
		this.importancia = importancia;
	}
}
