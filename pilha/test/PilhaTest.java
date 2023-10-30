import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PilhaTest {

    @Test
    public void pilhaVazia() {
        Pilha p = new Pilha();
        assertTrue(p.estaVazia());
        assertEquals(0, p.tamanho());
    }

    @Test
    public void empilhaUmElemento() {
        Pilha p = new Pilha();
        p.empilha("primeiro");
        assertFalse(p.estaVazia());
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
    }

    @Test
    void empilhaDoisElementos() {
        Pilha p = new Pilha();

        p.empilha("primeiro");
        p.empilha("segundo");

        assertFalse(p.estaVazia());

        assertEquals(2, p.tamanho());
        assertEquals("segundo", p.topo());

        Object desempilhado = p.desempilha();

        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());

        assertEquals("segundo", desempilhado);

    }
}