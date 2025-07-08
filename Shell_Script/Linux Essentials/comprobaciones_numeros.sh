#!/bin/bash

#Los operadores condicionales me permiten saber si una expresión es verdadero o falsa, realizan comprobaciones o comprueban si se cumplen
#ciertas condiciones en (Números, cadenas de texto, ficheros...) usaremos el comando test que se puede expresar de dos formas.

#test expresión (forma 1) [ expresión ] (forma 2)

#EJEMPLOS: 

#test 10 -gt 20 (forma 1) [ 10 -gt 20] (forma 2)
#test 'Hola' = 'Holita' (forma 1) [ 'Hola' = 'Holita' ] (forma2)
#test -d /etc/ (o también) [ -d /etc/ ] esto sirve para comprobar si es un directorio (-d)

# COMPARACIÓN DE NÚMEROS (Sintaxis)

# N1 -eq N2 (N1 es igual que N2)
# N1 -ge N2 (N1 es mayor o igual que N2)
# N1 -gt N2 (N1 es mas mayor que que N2)
# N1 -le N2 (N1 es menor o igual que N2)
# N1 -lt N2 (N1 es menor que N2)
# N1 -ne N2 (N1 es no es igual que N2)

#SENTENCIA IF

#Ejecuta una o varios instrucciones sólo si se cumple una condición, sintaxis:

#if CONDICIÓN: then
# INSTRUCCIONES (Pueden ser varias líneas)
# fi

v1=10
v2=2

if test $v1 -gt $v2; then #La forma abreviada sería if [ $v1 -gt $v2 ]; then
	echo "V1 es mayor que V2"
fi

if [ $v1 -gt $v2 ];then
	echo "V1 es mayor que V2 (forma abreviada)"
fi

