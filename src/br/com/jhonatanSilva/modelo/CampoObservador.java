package br.com.jhonatanSilva.modelo;

@FunctionalInterface
public interface CampoObservador {

    public void eventoOcoreu(Campo campo, CampoEvento evento);

}
