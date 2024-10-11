import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import edu.will.dio.desafio.dominio.Conteudo;
import edu.will.dio.desafio.dominio.Curso;
import edu.will.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Aprenda Java");
        curso.setCargaHoraria(4);

        mentoria.setTitulo("Mentoria C++");
        mentoria.setDescricao("Assista aulas de c++");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    
        Conteudo conteudo = new Curso();

        
    }
}
