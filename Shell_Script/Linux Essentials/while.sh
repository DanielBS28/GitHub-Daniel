#!/bin/bash

# El bucle while ejecutará las lineas que contenga mientras se cumpla una condición.

CONT=0

while [ $CONT -lt 5 ]; do
	echo "Contador $CONT"
	CONT=$(($CONT+1)) # Tengo que actualizar la variable para poder salir alguna vez del while, sino sería un bucle infinito.
done
