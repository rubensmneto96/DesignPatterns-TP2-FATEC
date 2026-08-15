package tp2.domain;

public class PapelStrategy implements Strategy {

    @Override
    public void execute(StrategyType type) {
        switch (type) {
            case TESOURA -> System.out.println("Perdeu: Tesoura corta Papel.");
            case PEDRA -> System.out.println("Ganhou: Paepl corta Pedra.");
            case LAGARTO -> System.out.println("Perdeu: Lagarto come Papel.");
            case SPOCK -> System.out.println("Ganhou: Papel refuta o Spock.");
            default -> System.out.println("Empatou!");
        }
    }
    
}
