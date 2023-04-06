package Aplicacion;

import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class universalDocRenderer {
	public void renderizar(HistoriaDeUsuario historia, String ruta) throws Exception {
        Document documento = new Document();
        PdfWriter.getInstance(documento, new FileOutputStream(ruta));

        documento.open();
        documento.add(new Paragraph("Titulo: " + historia.getTitulo()));
        documento.add(new Paragraph("ID: " + historia.getID()));
        documento.add(new Paragraph("Yo: " + historia.getYo()));
        documento.add(new Paragraph("Requiero: " + historia.getRequiero()));
        documento.add(new Paragraph("Tal que: " + historia.getTalQue()));
        documento.add(new Paragraph("Condiciones de aceptacion: " + historia.getCondicionesDeAceptacion()));
        documento.add(new Paragraph("Complejidad: " + historia.getComplejidad()));
        documento.add(new Paragraph("Importancia: " + historia.getImportancia()));

        documento.close();
    }
}
