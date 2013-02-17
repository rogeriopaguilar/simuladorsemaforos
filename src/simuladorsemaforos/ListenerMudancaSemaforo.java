package simuladorsemaforos;

public interface ListenerMudancaSemaforo {

    public void tempoAlterado(Semaforo semaforo, int tempoAnterior, int novoTempo);

}
