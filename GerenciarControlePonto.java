package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {
        Gerente g = new Gerente();
        g.setIdFunc(01);
        g.setNome("João");
        g.setLogin("gerente");
        g.setSenha("125689");
        g.setEmail("gerente@empresa.com.br");
        g.setDocumento("12454353251");

        Secretaria s = new Secretaria();
        s.setIdFunc(02);
        s.setNome("Maria");
        s.setRamal("123");
        s.setTelefone("123456789");
        s.setEmail("secretaria@empresa.com.br");
        s.setDocumento("1234354646");

        Operador o = new Operador();
        o.setIdFunc(03);
        o.setNome("Zé");
        o.setValorHora(50.00);
        o.setEmail("operador@empresa.com.br");
        o.setDocumento("12425431556");

        RegistroPonto r1 = new RegistroPonto();
        r1.setIdRegPonto(01);
        r1.setFunc(g);
        r1.setDataRegistro(LocalDate.now());
        r1.setHoraEntrada(LocalDateTime.now());
        r1.setHoraSaida(null);
        r1.apresentarRegistroPonto();
        Thread.sleep(2000);

        r1.setHoraSaida(LocalDateTime.now());
        r1.apresentarRegistroPonto();
        Thread.sleep(2000);

        r1.setIdRegPonto(02);
        r1.setFunc(s);
        r1.setDataRegistro(LocalDate.now());
        r1.setHoraEntrada(LocalDateTime.now());
        r1.setHoraSaida(null);
        r1.apresentarRegistroPonto();
        Thread.sleep(2000);

        r1.setHoraSaida(LocalDateTime.now());
        r1.apresentarRegistroPonto();
        Thread.sleep(2000);

        r1.setIdRegPonto(03);
        r1.setFunc(o);
        r1.setDataRegistro(LocalDate.now());
        r1.setHoraEntrada(LocalDateTime.now());
        r1.setHoraSaida(null);
        r1.apresentarRegistroPonto();
        Thread.sleep(2000);

        r1.setHoraSaida(LocalDateTime.now());
        r1.apresentarRegistroPonto();
        Thread.sleep(2000);
    }
}
