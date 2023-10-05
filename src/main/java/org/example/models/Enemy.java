package org.example.models;

public class Enemy {
    private String name;
    private Level minRequiredLevel;
    private Level maxRequiredLevel;
    private int hp;
    private int maxAttackDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getMinRequiredLevel() {
        return minRequiredLevel;
    }

    public void setMinRequiredLevel(Level minRequiredLevel) {
        this.minRequiredLevel = minRequiredLevel;
    }

    public Level getMaxRequiredLevel() {
        return maxRequiredLevel;
    }

    public void setMaxRequiredLevel(Level maxRequiredLevel) {
        this.maxRequiredLevel = maxRequiredLevel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxAttackDamage() {
        return maxAttackDamage;
    }

    public void setMaxAttackDamage(int maxAttackDamage) {
        this.maxAttackDamage = maxAttackDamage;
    }
}
