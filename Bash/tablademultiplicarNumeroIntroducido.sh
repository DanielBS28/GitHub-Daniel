#!/bin/bash

NumeroSolicitado=0

read -p "Dime un número y te diré su tabla de multiplicar del 1 al 10: " NumeroSolicitado

echo -e "=== Tabla de multiplicar del número $NumeroSolicitado ===\n"

for((i=0;i<=10;i++))
do
	echo "$i x $NumeroSolicitado = $((i*NumeroSolicitado))"
done

