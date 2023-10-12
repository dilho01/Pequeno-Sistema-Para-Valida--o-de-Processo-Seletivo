package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
    String [] candidatos ={"gabriel", "felipe", "migrul", "diego", "yuri"};
    for(String candidato: candidatos) {
            entrandoEmContato(candidato);
    }
    }

    static void entrandoEmContato(String canditato){
        int tentativasRealizadas = 1;
        boolean continuarTentado = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentado = !atendeu;
            if(continuarTentado){
                tentativasRealizadas++;
            } 
            else{
                System.out.println("contato realizado com sucesso");
            }

        }while(continuarTentado &&  tentativasRealizadas < 3);
        if(atendeu){
            System.out.println("consegui canto com " + canditato + " na " + tentativasRealizadas + " tentativa");
        }else{
            System.out.println("não conseguimos contato com " + canditato + " , numero tentativas " + tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos ={"gabriel", "felipe", "migrul", "diego", "yuri"};
        System.out.println("imptimindo a lista de candidatos informando o indice do elemento");

         for(int indice = 0; indice < candidatos.length;indice++ ){
        System.out.println("O canditado de nª " + (indice+1) + " e " + candidatos[indice]);
    }
     
    }

    static void selecaoCandidato(){
    String [] candidatos = {"gabriel", "felite", "miguel", "diego", "yuri", "lavia", "vitoria", "carla", "duda", "paulo"};
    

    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
        String candidato = candidatos[ candidatosAtual];
        double salarioPretendido = valorPrentendido();
        
        System.out.println("O candidato" + candidato +"solicitou este desalario" + salarioPretendido);

        if(salarioBase >= salarioPretendido){
            System.out.println("O candidatos" + candidato + "foi selecionado para a vaga");
            candidatosSelecionados++;
        }
        candidatosAtual++;
    }
}
    static double valorPrentendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    

    static void analisarCanditado(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Lingar para o Candidato");
        }else if (salarioPretendido == salarioBase){
            System.out.println("ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguadando o resuktado dos demais candidatos");
        }
    }
}
