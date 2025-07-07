#!/bin/bash

#Ejemplo de uso: ./parametros.sh param1 param2 param3

echo El primer parámetro es: $1 #Muestra el primer parámetro
echo El número de parámetros es $# #Muestra el número de parámetros que se le han pasado al script
echo Todos los parámetros con \$\*: $* # Me devuelve todos los parámetros pero en una cadena única
echo Parámetros con \$\@: $@ # Me devuelve todos los parámetros pero en una lista con un elemento por cada parámetro recibido (mas recomendado)
#Ya que se pueden recorrer los parámetros con un for y es más "seguro".
