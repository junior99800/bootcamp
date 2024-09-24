package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado {
    private String nomeDev;
    private String nomeBootcamp;
    private LocalDate dataConclusao;

    public Certificado(String nomeDev, String nomeBootcamp, LocalDate dataConclusao) {
        this.nomeDev = nomeDev;
        this.nomeBootcamp = nomeBootcamp;
        this.dataConclusao = dataConclusao;
    }

    public String gerarCertificado() {
        return "Certificado de Conclusão\n" +
                "Dev: " + nomeDev + "\n" +
                "Bootcamp: " + nomeBootcamp + "\n" +
                "Data: " + dataConclusao;
    }

    // Getters e Setters
}
