#!/bin/bash

#En este script veremos como se usan las comillas simples y dobles en Shell Script

v1="Hola"
v11="Adiós"
echo $v1

echo "El contenido de la variable v1 es $v1 y el primer parámetro es $1" #Esto es con comillas dobles y lo imprime bien con el contenido de la variable
echo 'El contenido de la variable v1 es $v1 y el primer parámetro es $1' #Esto es con comillas simples y no imprime el contenido de la variable

#Cuando ponemos comillas simples no se interpreta el contenido de las variables, todo es texto, no interpreta las variables,
#las comillas dobles si lo hacen.

#Veremos los problemas que podrían dar las variables en este caso v1 vs v11

echo "$v11" #Imprime Adiós

# Para imprimir el contenido de v1 y luego añadir un uno tendríamos que añadir la variable entre corchetes ${}
echo "${v1}1"

# Para poner Adíos también se puede poner con ${}
echo "${v11}"

# Al pasarle parámetros podemos añadir espacios si queremos entre comillas ya que si no ponemos comillas serían dos parámetros

# Ejemplo ./comillas_ShellScript.sh param1 param2 (dos parámetros) ->  ./comillas_ShellScript.sh "param1 param2" (Un parametro pero con espacio)

#O también podemos usar \ para "Quitarle" el significado el espacio.  ./comillas_ShellScript.sh param1\ param2 (son más comodas las comillas)
