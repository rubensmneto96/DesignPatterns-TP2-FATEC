package tp2;

import tp2.domain.StrategyType;

import java.util.Random;
import java.util.Scanner;
import static tp2.domain.StrategyType.*;

public class Main {
    // Remocao de numeros magicos
    private static final Integer PAPEL = 1;
    private static final Integer TESOURA = 2;
    private static final Integer PEDRA = 3;
    private static final Integer LAGARTO = 4;
    private static final Integer SPOCK = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
        int jogador = in.nextInt();
        StrategyType strategyJogador = StrategyType.getById(jogador);
        int computador = new Random().nextInt(5) + 1;
        StrategyType strategyComputador = StrategyType.getById(computador);
        System.out.println("O COMPUTADOR escolheu: " + strategyComputador);
        System.out.println("O JOGADOR esolheu: " + strategyJogador);

//        if (jogador == PAPEL && computador == PAPEL) {
//            System.out.println("Empate. PAPEL empata com papel!");
//        } else if (jogador == PAPEL && computador == TESOURA) {
//            System.out.println("Perdeu! TESOURA corta o papel!");
//        } else if (jogador == PAPEL && computador == PEDRA) {
//            System.out.println("Ganhou! PEDRA embrulha o papel!");
//        } else if (jogador == PAPEL && computador == LAGARTO) {
//            System.out.println("Perdeu! LAGARTO come o papel!");
//        } else if (jogador == PAPEL) {
//            System.out.println("Ganhou! PAPEL refuta o SPOCK!");
//        } else if (jogador == TESOURA && computador == PAPEL) {
//            System.out.println("Ganhou. TESOURA corta o papel!");
//        } else if (jogador == TESOURA && computador == TESOURA) {
//            System.out.println("Empate! TESOURA empata com tesoura!");
//        } else if (jogador == TESOURA && computador == PEDRA) {
//            System.out.println("Perdeu! PEDRA quebra a tesoura!");
//        } else if (jogador == TESOURA && computador == LAGARTO) {
//            System.out.println("Ganhou! TESOURA decapta o LAGARTO!");
//        } else if (jogador == TESOURA) {
//            System.out.println("Perdeu! SPOCK derrete a tesoura!");
//        } else if (jogador == PEDRA && computador == PAPEL) {
//            System.out.println("Perdeu. PAPEL embrulha a pedar!");
//        } else if (jogador == PEDRA && computador == TESOURA) {
//            System.out.println("Empate! TESOURA empata com tesoura!");
//        } else if (jogador == PEDRA && computador == PEDRA) {
//            System.out.println("Empatou! PEDRA empata com PEDRA!");
//        } else if (jogador == PEDRA && computador == LAGARTO) {
//            System.out.println("Ganhou! PEDRA esmaga o LAGARTO!");
//        } else if (jogador == PEDRA) {
//            System.out.println("Perdeu! SPOCK vaporiza a aPEDRA!");
//        } else if (jogador == LAGARTO && computador == PAPEL) {
//            System.out.println("Ganhou. LAGARTO come papel!");
//        } else if (jogador == LAGARTO && computador == TESOURA) {
//            System.out.println("Perdeu! TESOURA decapta o LAGARTO!");
//        } else if (jogador == LAGARTO && computador == PEDRA) {
//            System.out.println("Perdeu! PEDRA esmaga LAGARTO!");
//        } else if (jogador == LAGARTO && computador == LAGARTO) {
//            System.out.println("Empatou! LAGARTO empata com LAGARTO!");
//        } else if (jogador == LAGARTO) {
//            System.out.println("Ganhou! LAGARTO envenena o SPOCK!");
//        } else if (jogador == SPOCK && computador == PAPEL) {
//            System.out.println("Perdeu. PAPEL refuta SPOCK!");
//        } else if (jogador == SPOCK && computador == TESOURA) {
//            System.out.println("Ganhou! SPOCK derrete a tesoura!");
//        } else if (jogador == SPOCK && computador == PEDRA) {
//            System.out.println("Ganhou! SPOCK vaporiza a PEDRA!");
//        } else if (jogador == SPOCK && computador == LAGARTO) {
//            System.out.println("Perdeu! LAGARTO envenena SPOCK!");
//        } else if (jogador == SPOCK) {
//            System.out.println("Empatou! SPOCK empata com SPOCK!");
//        }

        in.close();
    }
}
