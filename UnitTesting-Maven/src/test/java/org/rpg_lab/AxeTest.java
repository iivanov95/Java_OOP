package org.rpg_lab;

import lab.rpg_lab.Axe;
import lab.rpg_lab.Dummy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {

    private static final int ATTACK = 13;
    private static final int DURABILITY = 42;
    private static final int HEALTH = 100;
    private static final int EXPERIENCE = 200;
    private Axe axe;
    private Dummy dummy;

    @Before
    public void setUp(){
        this.axe = new Axe(ATTACK, DURABILITY);
        this.dummy = new Dummy(HEALTH, EXPERIENCE);
    }

    @Test (expected = IllegalArgumentException.class)
    public void test_CreateAxe_ShouldSet_CorrectValues_ForAttackAndDurability() {
        assertEquals(ATTACK, axe.getAttackPoints());
        assertEquals(DURABILITY , axe.getDurabilityPoints());
    }

    @Test
    public void test_AttackRemoves_DurabilityPoints() {
        axe.attack(dummy);
        assertEquals(DURABILITY - 1, axe.getDurabilityPoints());
    }

    @Test
    public void test_Attack_WithBrokenWeapon_ShouldFail() {
        Axe axe = new Axe(ATTACK, 0);
        axe.attack(dummy);
        assertThrows(IllegalStateException.class, () -> axe.attack(dummy));
    }

}
