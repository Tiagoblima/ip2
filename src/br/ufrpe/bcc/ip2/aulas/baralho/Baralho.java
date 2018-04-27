package br.ufrpe.bcc.ip2.aulas.baralho;

/**
 * Classe com métodos para geração de um deck de cartas e de sequências aleatórias de cartas.
 */
public class Baralho {

    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private String[] naipes = {"♣", "♦", "♥", "♠"};

    public static void main(String[] args) {
        Baralho baralho = new Baralho();

        System.out.println("----- BARALHO -----");
        String[] deckCartas = baralho.gerarDeckCartas();

        for (String carta : deckCartas) {
            System.out.print(carta + ", ");
        }

        System.out.println("\n----- SEQUENCIA (n=4) -----");
        for (String carta : baralho.gerarSequencia(4)) {
            System.out.print(carta + ", ");
        }
    }

    /**
     * Método para gerar um deck de cartas
     *
     * @return um array com o deck de cartas
     */
    public String[] gerarDeckCartas() {
        String[] deck = new String[52];
        int i = 0;
        for (String naipe : naipes) {
            for (String rank : ranks) {
                deck[i] = rank + naipe;
                i++;
            }
        }
        return deck;
    }

    /**
     * Método para gerar uma sequência aleatória (com repetição) de N cartas
     *
     * @param n o número de cartas na sequência a ser gerada
     * @return um array com a sequência gerada
     */
    public String[] gerarSequencia(int n) {

        String[] sequencia = new String[n];
        String[] deckCartas = this.gerarDeckCartas();
        for (int j = 0; j < sequencia.length; j++) {
            int i = (int) (Math.random() * 52);
            sequencia[j] = deckCartas[i];
        }
        return sequencia;
    }

}
