package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(8);
        curso1.setTitulo("Prepare-se para a Jornada");
        curso1.setDescricao("Contém as aulas e mentoria introdutórias do Bootcamp");

        Curso curso2 = new Curso(13);
        curso2.setTitulo("Princípios de Desenvolvimento de Software");
        curso2.setDescricao("Introdução ao Pensamento Computacional e Git/GitHub");

        Curso curso3 = new Curso(14);
        curso3.setTitulo("Conhecendo a Linguagem Java");
        curso3.setDescricao("Fundamentos da Linguagem Java");

        Mentoria mentoria1 = new Mentoria(LocalDate.now());
        mentoria1.setTitulo("Como Criar seu Plano de Estudos Usando GitHub");
        mentoria1.setDescricao("Aprenda a utilizar essa ferramenta poderosa para organizar seus estudos!");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Potência Tech powered by Ifood - Java Beginners");
        bootcamp.setDescricao("O iFood chegou na DIO com uma super trilha para pessoas que querem ingressar" +
                " no mercado tech! Trilha é voltada e focada em grupos sub-representados e pessoas de baixa renda");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRenata = new Dev("Renata");
        devRenata.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Renata: " + devRenata.getConteudosInscritos());
        devRenata.progredir();
        devRenata.progredir();
        System.out.println("***");
        System.out.println("Conteúdos Inscritos Renata: " + devRenata.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Renata: " + devRenata.getConteudosConcluidos());
        System.out.println("XP: " + devRenata.calcularXp());
        double conclusao;
        conclusao = ((double)devRenata.getConteudosConcluidos().stream().count() / (double)(devRenata.getConteudosConcluidos().stream().count()
                + (double)devRenata.getConteudosInscritos().stream().count()));
        System.out.println("% de Conclusão do Bootcamp: " + conclusao * 100 + "%");

        System.out.println("*-----*");

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("***");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());
        conclusao = ((double)devCamila.getConteudosConcluidos().stream().count() / (double)(devCamila.getConteudosConcluidos().stream().count()
                + (double)devCamila.getConteudosInscritos().stream().count()));
        System.out.println("% de Conclusão do Bootcamp: " + conclusao * 100 + "%");

    }
}