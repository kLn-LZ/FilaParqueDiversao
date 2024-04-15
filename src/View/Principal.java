package View;

import Controller.ParqueController;
import Model.Pessoa;
import br.edu.fateczl.fila.Fila;
import java.lang.Math;

public class Principal {

    public static void main(String[] args) {
        ParqueController PC = new ParqueController();
        Fila f = new Fila();
        int i = 1;

        while(i <= 30) {

            Pessoa pessoa = new Pessoa();
            pessoa.Nome = "Pessoa" + i;
            pessoa.Idade = (int) (Math.random() * 41) + 10;
            pessoa.Altura = (float) ((Math.random() * 2.01) + 1.35);

            f.insert(pessoa);
            i++;
        }

        PC.brinquedo(f);


    }

}
