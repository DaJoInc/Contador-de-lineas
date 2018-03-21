package com.ownk.contador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.stream.events.StartDocument;
public class ContadorUtils {
	/**
	 * -------------
	 * archivosDeProyecto
	 * --------------
	 * Metodo Encargado de buscar todos los archivos que finalizen con .java de un proyecto y listar su respectiva ruta
	 * @param path= Ruta del proyecto que actua como inicializador del metodo.
	 * @param rutaArchivo=Lista que de manera recursiva se vuelve a llamar para usar el mismo espacio de memoria y llene de manera continua su contenido con rutas de archivos .java 
	 * @return
	 */
	public List<String> archivosDeProyecto(String path,List<String> rutaArchivo)
    {
		GetContador getContador= new GetContador();
        File folder = new File(path);
         
        File[] files = folder.listFiles();
         
        for (File file : files) 
        {
            if (file.isFile())
            {
            	if (file.getName().trim().endsWith(".java")) {
            		//System.out.println("rrr"+file);
              		rutaArchivo.add(String.valueOf(file.getAbsolutePath()));
				}
            }
            else if (file.isDirectory())
            {
            	archivosDeProyecto(file.getAbsolutePath(),rutaArchivo);
            }
        }
        return rutaArchivo;
    }
/**
 * ---------------------
 * contenidoCliente
 * ---------------------
 * Metodo encargado de imprimir el contenido final, el cual toma las lineas de todos los archivos, compara cada una con ciertos parametros, estos parametros indican la salida esperada y cada uno de ellos se guarda en las listas de la clase GetContador que actua como un DTO, luego se devuelven y se imprimen en el orden deseado.
 * @param lineasArchivos= Lista que contiene las lineas de archivos leidas previamente de n archivos.
 * @return
 */
	public boolean contenidoCliente(List<String> lineasArchivos){
		GetContador getContador= new GetContador();
		List<String> numerodeMetodos=new ArrayList<>();
		List<GetContador> numerosDeNombre= new ArrayList<GetContador>();
		int contadorA=1;
		String nombreClase=""; 
		for (String lineaClases : lineasArchivos) {
			if (lineaClases.trim().startsWith("p")&& !lineaClases.endsWith(";")) {
				if (lineaClases.trim().contains("class")) {
					nombreClase ="";
					nombreClase = lineaClases;
				}
				else if(lineaClases.trim().startsWith("p")&&lineaClases.trim().endsWith("{")){
				getContador=new GetContador();
					System.out.println(lineaClases+contadorA);
					getContador.setNombreClase(nombreClase);
					getContador.setNombreMetodo(lineaClases);
					getContador.setMetodoLineaInicial(contadorA);
					numerodeMetodos.add(String.valueOf(lineasArchivos.size()));
					getContador.setNumeroMetodos(numerodeMetodos.size());
				}
			}
			if (lineaClases.trim().startsWith("r")||lineaClases.trim().startsWith("t")) {
				getContador.setMetodoLineaFinal(contadorA);
				numerosDeNombre.add(getContador);
			}
			contadorA++;
	}
       int imprimirTitulo = 0;
       int imprimirMetodo = 0;
		for (GetContador getContadorChiquito : numerosDeNombre) {
			
			if (imprimirTitulo==0) {
				System.out.println("**************************************** ");
				System.out.println("Nombre de Clase: "+getContadorChiquito.getNombreClase());
				imprimirTitulo=imprimirTitulo+1;
				System.out.println("Número de metodos de la clase: "+numerosDeNombre.size());
				imprimirMetodo=imprimirMetodo+1;
			}
			System.out.println("Nombre Metodo: "+getContadorChiquito.getNombreMetodo());
			int resultadoMetodos= getContadorChiquito.getMetodoLineaFinal()-getContadorChiquito.getMetodoLineaInicial();
			System.out.println("Lineas del metodo: "+resultadoMetodos);
			System.out.println("-------------------------------------- ");
		}
		return false;	
	}
	/**
	 * lineasEnMetodos
	 * @param lineasArchivos
	 * @return
	 */
	public boolean lineasEnMetodos(List<String> lineasArchivos){
		GetContador getContador = new GetContador();
		List<Integer>numeroDeLineasEnMetodo= new ArrayList<Integer>();	
		int contadorA=1;
		String nombreClase=""; 
		for (String lineaClases : lineasArchivos) {
			if (lineaClases.trim().startsWith("p")&& !lineaClases.endsWith(";")) {
				if (lineaClases.trim().contains("String")||lineaClases.trim().contains("void")||lineaClases.trim().contains("file")||lineaClases.trim().contains("int")) {
					nombreClase ="";
					nombreClase = lineaClases;
				}
				else if(lineaClases.trim().startsWith("p")&&lineaClases.trim().endsWith("{")){
				getContador=new GetContador();
				}
			}
		contadorA++;
		}
		return false;
	}
}
