#!/bin/bash
nombre=""
edad=0
year=0

read -p "Ingresa tu nombre: " nombre
read -p "ingresa tu edad: " edad
read -p "ingresa el año actual: " year

echo "Tu nombre es $nombre y tienes $edad años"


if (($edad >= 18)); then
	echo "$nombre, Eres mayor de edad"
else
	echo "$nombre, No eres mayor de edad"
fi

echo "============================================="

: '
En Bash, no puedes usar gt directamente dentro de los corchetes [] para realizar comparaciones numéricas. En su lugar, debes usar los operadores numéricos prefijados con un guion (-) para las comparaciones.

(( )) es la forma más recomendada para comparaciones y operaciones aritméticas con números en Bash.

Dentro de (( )), no necesitas comillas ni el prefijo $ para las variables, ya que Bash las interpreta correctamente como números en el contexto de aritmética.

En Bash, cuando usas (( )) para operaciones aritméticas, no necesitas poner comillas alrededor de las variables, incluso si estas contienen números con espacios o son vacías (aunque si las variables son vacías, obtendrás un error, pero no por el uso de comillas).
'

if [ $edad -ge 18 ] && [ $year -eq 2025 ]; then
	echo "$nombre, eres mayor de edad y estas en el año $year"
else
	echo "No has cumplido las condiciones anteriores"
fi
