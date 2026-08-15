package tp2.domain;

public class Jokenpo {
    private Strategy strategy;
    
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void jogar(StrategyType type) {
        this.strategy.execute(type);
    }
}
