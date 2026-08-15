package tp2.domain;

public class SpockStrategy implements Strategy{

    @Override
    public void execute(StrategyType type) {
        switch (type) {
            case PAPEL -> System.out.println("Perdeu: Papel refuta o Spock.");
            case PEDRA -> System.out.println("Ganhou: Spock vaporiza a Pedra.");
            case TESOURA -> System.out.println("Ganhou: Spock esmaga a Tesoura.");
            case LAGARTO -> System.out.println("Perdeu: Lagarto envenena o Spock.");
            default -> System.out.println("Empatou!");
        }
    }
    
}
