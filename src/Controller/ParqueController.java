package Controller;

import Model.Pessoa;
import br.edu.fateczl.fila.Fila;

public class ParqueController {

    public ParqueController() {

    }

    public void brinquedo(Fila fila) {

        Pessoa pessoa;

        while(!fila.isEmpty()) {

            pessoa = (Pessoa) fila.remove();

            if(pessoa.Altura <= 1.60) {
                System.out.println("Cliente " + pessoa + " não foi autorizado a acessar o brinquedo por não ter a altura mínima");
            } else if(pessoa.Idade <= 16) {

                System.out.println("Cliente " + pessoa + " não foi autorizado a acessar o brinquedo por não ter a idade mínima");
            } else {
                System.out.println("Cliente " + pessoa + " autorizado");
            }


        }

    }

}
