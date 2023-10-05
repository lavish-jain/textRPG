package org.example.models;

import java.util.List;

public class Level {
    private int level;
    private Level nextLevel;
    private int reqXpLevelUp;
    private List<Attack> availableAttacks;
    private int maxHp;
    private int maxStamina;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Level getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(Level nextLevel) {
        this.nextLevel = nextLevel;
    }

    public int getReqXpLevelUp() {
        return reqXpLevelUp;
    }

    public void setReqXpLevelUp(int reqXpLevelUp) {
        this.reqXpLevelUp = reqXpLevelUp;
    }

    public List<Attack> getAvailableAttacks() {
        return availableAttacks;
    }

    public void setAvailableAttacks(List<Attack> availableAttacks) {
        this.availableAttacks = availableAttacks;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }
}
