#!/bin/bash

#Ejemplo de uso: ./parametros.sh param1 param2 param3

echo El primer parámetro es: $1
echo El número de parámetros es $#
echo Todos los parámetros con \$\*: $*
echo Parámetros con \$\@: $@
