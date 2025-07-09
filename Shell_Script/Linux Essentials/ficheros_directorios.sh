#!/bin/bash

#En este documento veremos shell script para ficheros y directorios

#Sintaxis (descripción)

# -d ruta (Cierto si la ruta existe y es un directorio)
# -e ruta (Cierto si la ruta existe sea el elemento que sea)
# -f ruta (Cierto si la ruta existe y es un fichero)
# -r ruta (Cierto si la ruta existe y se puede leer)
# -w ruta (Cierto si la ruta existe y se puede escribir)
# -x ruta (Cierto si la ruta existe y se puede ejecutar)
# -s ruta (Cierto si la ruta existe y su tamaño es mayor de cero)

read -p "Introduzca una ruta: " ruta

if [ -e $ruta ]; then
	echo "Esta ruta existe"
fi


if [ ! -e $ruta ]; then
	echo "Esta ruta no  existe"
	exit 1 #Si ponemos exit numero del error se acabará el script con el número de error que queramos
	#El número debe ser distinto de cero ya que cero es éxito. El número de error lo elige el programador y su significado igual
	#Si queremos saber el número de error una vez ha terminado el programa, en la consola pondremos $? y devolverá el código de exit.
fi

if [ -d $ruta ]; then
	echo "y es un directorio"
fi

if [ -f $ruta -a -w $ruta ]; then
	echo "y es un fichero que se puede escribir"
fi
