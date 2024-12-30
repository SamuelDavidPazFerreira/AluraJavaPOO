package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("The Batman");
        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(175);
        meuFilme.setDiretor("Matt Reeves");

        meuFilme.exibeFichaTecnica();

        meuFilme.avalie(8);

        Serie minhaSerie = new Serie();

        minhaSerie.setNome("The Pinguim");
        minhaSerie.setAnoDeLancamento(2024);
        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.setDuracaoEmMinutos(67);
        minhaSerie.setTemporadas(1);
        minhaSerie.setEpisodiosPorTemporadas(10);
        minhaSerie.setAtiva(false);
        minhaSerie.setMinutosPorEpisodio(60);
        minhaSerie.setAtiva(false);

        minhaSerie.exibeFichaTecnica();

        minhaSerie.avalie(4);


        System.out.println("Média das avaliações do filme: " + meuFilme.getPegarMedia());
        System.out.println("Média das avaliações da Série: " + minhaSerie.getPegarMedia());

        System.out.println("Quantas pessoas avaliaram o filme: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Quantas pessoas avaliaram a série: " + minhaSerie.getTotalDeAvaliacoes());

        System.out.println("Para maratonar a série inteira: " + minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Superman");
        outroFilme.setAnoDeLancamento(2025);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println("Tempo total dos filmes / séries: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(minhaSerie);

    }

}