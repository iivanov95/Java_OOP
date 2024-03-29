package lab.rpg_lab;

import java.util.Optional;

public interface Target {
    boolean isDead();
    int giveExperience();
    void takeAttack(int attackPoints);

    Optional<Weapon> getLoot();
}
