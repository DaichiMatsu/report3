package jp.ac.uryukyu.ie.e245759;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
@Test
void attackWithWeponSkillTest(){
    int defaultWarriorHp = 100;
    Warrior demoWarrior = new Warrior("デモ戦士", defaultWarriorHp, 10);
    Enemy slime = new Enemy("スライムもどき", 100, 10);
    for(int i = 1; i <= 3; i++){
        int slimeMximumHp = slime.getHitPoint();
        demoWarrior.attackWithWeponSkill(slime);
        slime.attack(demoWarrior);
        assertEquals(demoWarrior.getAttack() * 1.5, slimeMximumHp - slime.getHitPoint());
    }

}

}
