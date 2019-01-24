package week10.ex1;

public class Pokemon {

    private Integer number;
    private String name;
    private String type1;
    private String type2;
    private Integer total;
    private Integer hp;
    private Integer attack;
    private Integer defence;
    private Integer spAttack;
    private Integer spDef;
    private Integer speed;
    private Integer generation;
    private Boolean legendary;


    public Pokemon(Integer number, String name, String type1, String type2, Integer total, Integer hp, Integer attack,
                   Integer defence, Integer spAttack, Integer spDef,
                   Integer speed, Integer generation, Boolean legendary) {

        this.number = number;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.spAttack = spAttack;
        this.spDef = spDef;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;




    }


    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public Integer getSpAttack() {
        return spAttack;
    }

    public Integer getSpDef() {
        return spDef;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public Boolean getLegendary() {
        return legendary;
    }

}
