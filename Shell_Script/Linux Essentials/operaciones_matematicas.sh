#!/bin/bash 

# + SUMA, - RESTA, * MULTIPLICACIÓN, / DIVISÓN, % RESSTO DE LA DIVISIÓN

#Para realizar una operación, tendremos que ponerla sin espacios y dentro de $(())

echo 1+1 # Imprime 1+1
echo $((1+1)) #Imprime 2
echo $((123+15))

read -p "Introduzca el primer número:" n1
read -p "Introduzca el segundo  número:" n2

echo "La suma es $((n1+n2))"
echo "La resta es $((n1-n2))"
echo "La multiiplicación es $((n1*n2))"
echo "La división es $((n1/n2))"
echo "El módulo (resto) es $((n1%n2))"

echo "Un número random: $RANDOM" #La variable de entorno RANDOM da un número aleatoro, muy útil para generar números al azar por ejemplo para sorteos.

#Si el sorteo es entre 0 y 25 haré el modulo de 26 por que el resto estará siempre entre 0 y 25 (Si no quiero el 0 le sumo 1)
echo "Número entre 0 y 25: $(($RANDOM%26))"


