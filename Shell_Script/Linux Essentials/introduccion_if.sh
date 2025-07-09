#!/bin/bash

#Las sentencias condicionales son estructuras de control que nos permiten ejecutar líneas de código solamente
# si se cumplen las condiciones que hemos específicado.

n1=1
n2=2

if [ $n1 -eq $n2 ]; then
	echo "Son iguales" # Si se cumple la condición imprime esto
else
	echo "No son iguales" #Si no se cumple la condición se imprime esto
fi


# IF ANIDADOS

read -p "Introduzca una ruta: " ruta

if [ -e $ruta ]; then
	if [ -d $ruta ]; then
	echo "La ruta existe y es un directorio"

	elif [ -f $ruta ]; then #Else if (Si el if de arriba (directorio) no funciona evalúo si es un fichero)
	#No puse else ya que si no es un directorio asumo que es un fichero pero podría ser otra cosa que no sea un fichero y sería erroneo si
	#pongo else, con elif compruebo que sea un fichero. Con else sería cualquier cosa que no sea un directorio (y que la ruta existe por el if anterior)
	echo "La ruta existe y es un fichero"
	fi #Cierro el if de -d ruta
else
	echo "La ruta no existe"
fi


