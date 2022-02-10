package com.example.prova_backend.service;

import com.example.prova_backend.response.AssociadoResponse;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
@Service
public class CSVService {

    @Autowired
    private ReceitaService receitaService;

    public void exportarCSV(Writer writer){
        String line = "";
        String splitBy = ";";
        try {
            BufferedReader br = new BufferedReader(new FileReader("arquivo.csv"));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            while ((line = br.readLine()) != null) {

                String[] associado = line.split(splitBy);
                AssociadoResponse associadoResponse = new AssociadoResponse(associado[0], associado[1], associado[2], associado[3], receitaService.atualizarConta(associado[0], associado[1], associado[2], associado[3]));
                csvPrinter.printRecord(associadoResponse.getNroCoop(), associadoResponse.getNroConta(), associadoResponse.getSaldo(), associadoResponse.getStatus(), associadoResponse.isResposta());
            }
        }
        catch (IOException | InterruptedException e)  {
            e.printStackTrace();
        }
    }
}
