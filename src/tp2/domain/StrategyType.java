package tp2.domain;


public enum StrategyType {
    PAPEL(1), TESOURA(2), PEDRA(3), LAGARTO(4), SPOCK(5);
    
    private Integer id;
    
    StrategyType(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public static StrategyType getById(Integer id) {
        for(StrategyType t : StrategyType.values()) {
            if (t.getId().equals(id)) return t;
        }
        throw new RuntimeException("ID: " + id);
    }

}
