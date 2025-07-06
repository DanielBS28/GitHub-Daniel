#!/bin/bash


echo -e "=== Tabla de multiplicar de los 10 primeros números ===\n"

for((i=0;i<=10;i++))
do
	echo -e "Tabla de multiplicar del número: $i\n"
		for((j=0;j<=10;j++))
		do
			echo "$i x $j = $((i*j))"
		done
	echo ""
done

