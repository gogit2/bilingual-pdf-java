package org.ahmoh;

import com.itextpdf.io.font.FontProgram;
import com.itextpdf.io.font.FontProgramFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.BaseDirection;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.text.pdf.languages.ArabicLigaturizer;
import com.itextpdf.text.pdf.languages.LanguageProcessor;
import java.io.IOException;

public class BilingualPdfGenerator {

    public static final int FONT_SIZE = 16;

    public static void main(String[] args) {
        String outputPath = "bilingual_document.pdf";
        try {
            PdfWriter writer = new PdfWriter(outputPath);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            FontProgram fontProgram = FontProgramFactory.createFont("templates/font/arial-regular.ttf");
            PdfFont font = PdfFontFactory.createFont(fontProgram);

            LanguageProcessor al = new ArabicLigaturizer();
            Paragraph p1 = new Paragraph("Hello, World! " + al.process("مرحبا "))
                    .setFont(font)
                    .setFontSize(FONT_SIZE)
                    .setBaseDirection(BaseDirection.RIGHT_TO_LEFT)
                    .setTextAlignment(TextAlignment.RIGHT);

            Paragraph p2 = new Paragraph("This is English." + al.process("هذا نص باللغة العربية."))
                    .setFont(font)
                    .setFontSize(FONT_SIZE)
                    .setBaseDirection(BaseDirection.RIGHT_TO_LEFT)
                    .setTextAlignment(TextAlignment.LEFT);

            Paragraph p3 = new Paragraph(al.process("عربــي, هذا نص باللغة العربية رقــم# 3"))
                    .setFont(font)
                    .setFontSize(FONT_SIZE)
                    .setBaseDirection(BaseDirection.RIGHT_TO_LEFT)
                    .setTextAlignment(TextAlignment.RIGHT);

            document.add(p1);
            document.add(p2);
            document.add(p3);

            document.close();

            System.out.println("Improved PDF created successfully at " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}