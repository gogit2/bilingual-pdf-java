# Bilingual PDF Generator

## Description
`BilingualPdfGenerator` is a Java project that demonstrates how to generate a bilingual PDF document using the iText library. This project showcases the ability to handle both English and Arabic text, ensuring proper text shaping, alignment, and formatting.

## Features
- Generates PDF documents containing both English and Arabic text.
- Ensures proper Arabic text shaping and alignment using iText's `ArabicLigaturizer`.
- Customizable font size and document layout.

## Requirements
- Java 8 or later.
- iText 7 library for PDF generation.

## Getting Started

### Prerequisites
1. **Java Development Kit (JDK)**: Ensure that you have Java 8 or later installed.
2. **iText Library**: Add iText lib to your project. If you are using Maven, include the following dependency in your `pom.xml`:

   ```xml

       <dependencies>
        <dependency>
            <groupId>com.itextpdf</groupId>
            <artifactId>itext-core</artifactId>
            <version>8.0.5</version> <!-- Or the latest version -->
            <type>pom</type>
        </dependency>
        <dependency>
            <groupId>com.itextpdf</groupId>
            <artifactId>itextpdf</artifactId>
            <version>5.5.13.4</version> <!-- Or the latest version -->
        </dependency>
    </dependencies>


Preview:   
![image](https://github.com/user-attachments/assets/b86c718e-de23-4f4c-9441-94ac3141a40f)


