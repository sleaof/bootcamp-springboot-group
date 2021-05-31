package br.com.digitalhouse.aluno.Services;

import br.com.digitalhouse.aluno.DTOs.AlunoDTO;

public class CalcularAluno {
    public static String calcular(AlunoDTO aluno) {
        Integer notaTotal = 0;
        String diploma;
        for (int i = 0; i < aluno.getMateria().size(); i++) {
            notaTotal += aluno.getMateria().get(i).getNota();
        }
        long media = notaTotal / aluno.getMateria().stream().count();

        if (media > 8) {
            diploma = " Parabens !!!! voce concluiu com exito " + aluno.getNome() + " terminou com a media " + media;
        } else if (media > 4 && media < 9) {
            diploma = "Voce passou " + aluno.getNome() + " terminou com a media " + media;
        } else {
            diploma = "Voce foi reprovado " + aluno.getNome() + " terminou com a media " + media;
        }

        return diploma;

    }
}
