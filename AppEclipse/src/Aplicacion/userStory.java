package Aplicacion;

import java.awt.TextArea;
import java.time.LocalDate;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

public class userStory {
   private String titulo;
   private String autor;
   private int ID;
   private LocalDate fecha;
   private String yo; 
   private String requiero;
   private String talQue;
   private String condicionesDeAceptacion;
   private int complejidad;
   private int importancia = 0;
   
   public userStory(String titulo,String autor,int ID, String yo,String requiero,String talQue, 
		   				String condicionesDeAceptacion,int complejidad, int importancia){
	   this.setTitulo(titulo);
	   this.setAutor(autor);
	   this.setID(ID);
	   this.setYo(yo);
	   this.setRequiero(requiero);
	   this.setTalQue(talQue);
	   this.setCondicionesDeAceptacion(condicionesDeAceptacion);
	   //this.fecha = fecha;
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
	
		public String getRequiero() {
		return requiero;
	}
	
	public void setRequiero(String requiero) {
		this.requiero = requiero;
	}
	/*
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	*/
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

	public String getCondicionesDeAceptacion() {
		return condicionesDeAceptacion;
	}

	public void setCondicionesDeAceptacion(String condicionesDeAceptacion) {
		this.condicionesDeAceptacion = condicionesDeAceptacion;
	}

	public String getTalQue() {
		return talQue;
	}

	public void setTalQue(String talQue) {
		this.talQue = talQue;
	}

	public String getYo() {
		return yo;
	}

	public void setYo(String yo) {
		this.yo = yo;
	}
   
}
