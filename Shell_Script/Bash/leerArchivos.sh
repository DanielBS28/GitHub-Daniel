#!/bin/bash

nombreArchivo=$1

echo "====== Lectura de archivos ======"
cat $nombreArchivo

echo "IFS (INTERNAL FIELD SEPARATOR), para leer linea a linea"

while IFS= read line 
do
	echo "$line"
done < $nombreArchivo
