package tp2.domain;

public class PedraStrategy implements Strategy {
    @Override
    public void execute(StrategyType type) {
        switch (type) {
            case TESOURA -> System.out.println("Ganhou: Pedra esmaga Tesoura.");
            case PAPEL -> System.out.println("Perdeu: Papel cobre Pedra.");
            case LAGARTO -> System.out.println("Ganhou: Pedra esmaga Lagarto.");
            case SPOCK -> System.out.println("Perdeu: Spock vaporiza a Pedra.");
            default -> System.out.println("Empatou!");
        }
    }
}
