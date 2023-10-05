package org.example.models;

public class Attack {
    private String name;
    private int baseDamage;
    private int requiredStamina;
    private int minLevelRequired;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getRequiredStamina() {
        return requiredStamina;
    }

    public void setRequiredStamina(int requiredStamina) {
        this.requiredStamina = requiredStamina;
    }

    public int getMinLevelRequired() {
        return minLevelRequired;
    }

    public void setMinLevelRequired(int minLevelRequired) {
        this.minLevelRequired = minLevelRequired;
    }
}
