package Model;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    public List<Operacao> operacoes = new ArrayList<>();

    public List<Operacao> getOperacoes() {
        return operacoes;
    }
    public double executa(Operacao operacao){
        operacoes.add(operacao);
        return operacao.calcular();
    }

}
