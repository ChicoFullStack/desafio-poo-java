import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso spring");
        curso2.setDescricao("descrição curso spring");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devChico = new Dev();
        devChico.setNome("Chico");
        devChico.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Chico" + devChico.getConteudoInscritos());
        devChico.progredir();
        devChico.progredir();
        devChico.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Chico" + devChico.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Chico" + devChico.getConteudosConcluidos());
        System.out.println("XP:" + devChico.calcularTotalXp());


        System.out.println("-------------");


        Dev devEdna = new Dev();
        devEdna.setNome("Edna");
        devEdna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Edna" + devEdna.getConteudoInscritos());
        devEdna.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Edna" + devEdna.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Edna" + devEdna.getConteudosConcluidos());
        System.out.println("XP:" + devEdna.calcularTotalXp());

    }
}