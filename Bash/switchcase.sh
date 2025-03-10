#!/bin/bash
#Autor: Daniel
#Esto es un ejemplo de como usar el Case en Bash Script (Switch case)

opcion=""

read -p "Introduzca una letra en el rango [A-B]: " opcion

case $opcion in
	"A") echo "Has introducido la letra A";;
	"B") echo "Has introducido la letra B";;
	[C-Z] | [a-z]) echo "Has introducido una letra fuera del rango";;
	*) echo "Por favor solo carácteres dentro del rango [A-B]"
esac
