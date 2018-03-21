package com.ownk.contador;

import java.io.File;

public class GetContador {
	//¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦Standart¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦
	private int metodoLineaInicial;
	private int metodoLineaFinal;
	private int numeroMetodos;
	private String nombreMetodo;
	private String nombreClase;
	//¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦lineas de metodo¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦
	private int corcheteAbrierto;
	private int crocheteCerrado;
	private int lineaFinalDeMetodo;
	//¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦Es una Linea lineaInvalida¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦
	private int lineaInvalida;
	//¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦GettersAndSetters¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦
	
	public int getCorcheteAbrierto() {
		return corcheteAbrierto;
	}
	public int getLineaInvalida() {
		return lineaInvalida;
	}
	public void setLineaInvalida(int lineaInvalida) {
		this.lineaInvalida = lineaInvalida;
	}
	public void setCorcheteAbrierto(int corcheteAbrierto) {
		this.corcheteAbrierto = corcheteAbrierto;
	}
	public int getCrocheteCerrado() {
		return crocheteCerrado;
	}
	public void setCrocheteCerrado(int crocheteCerrado) {
		this.crocheteCerrado = crocheteCerrado;
	}
	public int getLineaFinalDeMetodo() {
		return lineaFinalDeMetodo;
	}
	public void setLineaFinalDeMetodo(int lineaFinalDeMetodo) {
		this.lineaFinalDeMetodo = lineaFinalDeMetodo;
	}
	public String getNombreMetodo() {
		return nombreMetodo;
	}
	public void setNombreMetodo(String nombreMetodo) {
		this.nombreMetodo = nombreMetodo;
	}
	public String getNombreClase() {
		return nombreClase;
	}
	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}
	public int getMetodoLineaInicial() {
		return metodoLineaInicial;
	}
	public void setMetodoLineaInicial(int metodoLineaInicial) {
		this.metodoLineaInicial = metodoLineaInicial;
	}
	public int getMetodoLineaFinal() {
		return metodoLineaFinal;
	}
	public void setMetodoLineaFinal(int metodoLineaFinal) {
		this.metodoLineaFinal = metodoLineaFinal;
	}
	public int getNumeroMetodos() {
		return numeroMetodos;
	}
	public void setNumeroMetodos(int numeroMetodos) {
		this.numeroMetodos = numeroMetodos;
	}
	
	
}