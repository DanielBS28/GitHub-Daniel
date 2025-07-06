#!/bin/bash

tipoDeArchivo=0
nombreFichero=""
textoFichero=""

echo "Vamos a crear un archivo o un directorio, pulsa 1 para crear un archivo o pulsa 2 para crear un directorio"

read -p "¿Qué te gustaría crear? 1- Archivo | 2- Directorio: " tipoDeArchivo

if(( $tipoDeArchivo == 1 ));then
	read -p "Dime el nombre del archivo: " nombreFichero
	> $nombreFichero
	read -p "Introduce un texto para el arhivo $nombreFichero: " textoFichero
	echo $textoFichero >> $nombreFichero
fi

if(( $tipoDeArchivo == 2)); then
	read -p "Dime el nombre del directorio: " nombreFichero
	mkdir $nombreFichero
fi
