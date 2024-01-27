package org.rpg_lab;

import lab.rpg_lab.Dummy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {
    private Dummy dummy;
    private Dummy deadDummy;
    @Before
    public void setUp() {
        this.dummy = new Dummy(HEALTH, EXPERIENCE);
        this.deadDummy = new Dummy(0, EXPERIENCE);
    }
    private static final int HEALTH = 100;
    private static final int EXPERIENCE = 200;
    private static final int ATTACK = 10;


    @Test
    public void test_DummyHealth_IsReduced_WhenAlive_AndAttacked(){
        dummy.takeAttack(ATTACK);
        assertEquals(HEALTH - ATTACK, dummy.getHealth());
    }

    @Test (expected = IllegalStateException.class)
    public void test_Dummy_CannotBeAttacked_WhenDead(){
        deadDummy.takeAttack(ATTACK);
    }

    @Test
    public void test_Dummy_GivesXP_WhenDead(){
        int actualXP = deadDummy.giveExperience();
        assertEquals(EXPERIENCE, actualXP);
    }

    @Test (expected = IllegalStateException.class)
    public void test_Dummy_GivesXP_ThrowsWhenAlive(){
        dummy.giveExperience();
    }

    @Test
    public void test_Dummy_IsDead_WhenHealth_Is_Below_Zero(){
        assertTrue(new Dummy(-1, 1).isDead());
    }

    @Test
    public void test_DummyIsAlive_WhenHealth_IsMoreThanZero(){
        assertFalse(new Dummy(1, 1).isDead());
    }
}