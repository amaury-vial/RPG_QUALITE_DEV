package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import java.util.Scanner;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameTest {
    
    @Test
    public void test_Game() {
        Joueur joueur = new Joueur("John");
        Game game = new Game(joueur);
        assertNotNull(game.getAdversaires());
    }



}