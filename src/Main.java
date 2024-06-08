import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição do curso Python");
        curso2.setCargaHoraria(10);

//        System.out.println(curso1);
//        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("descrição mentoria de java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: Carlos" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        System.out.println("Conteudos concluídos: Carlos" + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());

        System.out.println("-----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúds inscritos: Maria" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Conteúdos concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());

    }
}