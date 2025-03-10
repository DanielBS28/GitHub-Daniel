#!/bin/bash
#Autor: Daniel
#Esto es una demostración sobre como usar arrays y bucles en bash

#Para diferenciar elementos dentro de un array tengo que poner un espacio entre
#cada elemento 
numeros=(1 2 3 4 5 6 7 8 9)
palabras=(Daniel Javier Diego Julian Rosa)
rangos=({A..Z} {20..30})

echo -e "=== Imprimir los arrays ===\n"

#Para imprimir el array entero se muestr la sintaxis: ${nombrearray[*]}
echo "Array de números: ${numeros[*]}"
echo "Array de palabras: ${palabras[*]}"
echo "Array de rangos: ${rangos[*]}"

#Array con nombres y apellidos

#Para poner espacios en un array lo tengo que poner entre comillas cada elemento
nombres_apellidos=("Daniel BS" "Juan SF")

echo "Array con nombres y apellidos: ${nombres_apellidos[*]}"

echo -e "=== Tamaño de los arrays ===\n"
#Mostrar el tamaño de los arrays

echo "Tamaño del array de números: ${#numeros[*]}"
echo "Tamaño del array de palabras: ${#palabras[*]}"
echo "Tamaño del array de rangos: ${#rangos[*]}"
echo -e "Tamaño del array nombres_apellidos: ${#nombres_apellidos[*]}\n"

echo -e "=== Imprimir la posición 3 de los arrays ===\n"

echo "La posición número 3 del array números es: ${numeros[3]}"
echo "La posición número 3 del array palabras: ${palabras[3]}"

echo -e "\n=== Manipular arrays ===\n"

#Para eliminar datos de un array usaremos la palabra unset
unset numeros[0]
#Esto eliminará la posisición 0 del array números. (Es el primer número)
echo "${numeros[*]}"
#Para añadir un elemnto a un array lo haremos de la siguiente manera:
numeros[0]=7
#Esto ha añadido en la posición 0 del array (Primer número) el número 7
echo "${numeros[*]}"

echo -e "\n=== Bucle for \"each\" ===\n"
#En cada vuelta se guarda la iteración en la variable num y se imprime con el echo

iteracion=0
for num in ${numeros[*]}
do
	
	echo "Número $((iteracion+=1)): $num"
done

echo -e "\n=== Bucle for tradicional ===\n"
for((i=0; i<${#numeros[*]};i++))
do
	echo "Numero $((i+1)): ${numeros[i]}"
done
