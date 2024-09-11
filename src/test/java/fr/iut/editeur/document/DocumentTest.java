package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testAjouterClear() {
        Document document = new Document();
        document.ajouter("Hello");
        document.ajouter("World");
        assertEquals("HelloWorld", document.toString());
        document.clear();
        assertEquals("", document.toString());
    }

    @Test
    public void testRemplacer() {
        Document document = new Document();
        document.ajouter("Hello World");
        document.remplacer(6, 10, "Java");
        assertEquals("Hello Java", document.toString());
    }

    @Test
    public void testMajuscules() {
        Document document = new Document();
        document.ajouter("Hello World");
        document.majuscules(6, 10);
        assertEquals("Hello WORLD", document.toString());
    }

    @Test
    public void testEffacer() {
        Document document = new Document();
        document.ajouter("Hello World");
        document.effacer(6, 10);
        assertEquals("Hello ", document.toString());
    }

    @Test
    public void testInserer() {
        Document document = new Document();
        document.ajouter("Hello World");
        document.inserer(5, "Java ");
        assertEquals("Hello Java World", document.toString());
    }
}