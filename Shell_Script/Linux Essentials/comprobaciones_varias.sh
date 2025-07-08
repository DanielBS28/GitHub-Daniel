#!/bin/bash

#!EXP (Negación: cierto si la expresión es falsa y viceversa)
#EXP1 -a EXP2 (Verdad si EXP1 y EXP2 son ambas verdaderas, es un AND &&)
#EXP1 -o EXP2 (Verdad si EXP1 o EXP2 son alguna de las dos verdaderas, es un OR ||)


#Vamos a ver un ejemplo de juntar expresiones, haremos un script que nos dirá si un número aleatorio está entre dos límites en este caso 
# entre 10 y 20 pero generaremos números entre 0 y 29

n1=$(($RANDOM%30))

if [ $n1 -ge 10 -a $n1 -le 20 ];then
	echo "El número $n1 está entre 10 y 20"
fi





