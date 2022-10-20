package br.com.resende.ronaldo;

import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;

import java.io.IOException;

public class PdfComparator {

    public static void main(String[] args) throws IOException {

        PDFUtil pdfutil = new PDFUtil();
        pdfutil.setCompareMode(CompareMode.VISUAL_MODE);

        if(args.length>2){
            pdfutil.highlightPdfDifference(true);
            pdfutil.setImageDestinationPath(args[2]);
        }

        boolean isIgual = pdfutil.compare(args[0], args[1]);

        if (isIgual){
            System.out.println("Arquivos iguais");
        } else {
            System.out.println("Arquivos diferentes");
        }

        //https://github.com/vinsguru/pdf-util

    }
}
