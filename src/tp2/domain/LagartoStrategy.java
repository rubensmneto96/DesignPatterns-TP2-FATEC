package tp2.domain;

public class LagartoStrategy implements Strategy {

    @Override
    public void execute(StrategyType type) {
        switch (type) {
            case PAPEL -> System.out.println("Ganhou: Lagarto come o Papel.");
            case PEDRA -> System.out.println("Perdeu: Pedra esmaga o Lagarto.");
            case TESOURA -> System.out.println("Perdeu: Lagarto e decapitado pela Tesoura.");
            case SPOCK -> System.out.println("Ganhou: Lagarto envenena o Spock.");
            default -> System.out.println("Empatou!");
        }
    }
    
}
