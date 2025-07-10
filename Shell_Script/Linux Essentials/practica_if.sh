#!/bin/bash

#TRANSFORMAR CALIFICACIONES

#En este ejercicio, se recibirá un número del 1 al 10 y luego nos devolverá la nota en texto correspondiente.

# 0-4 SUSPENSO, 5 APROBADO, 6 BIEN, 7-8 NOTABLE, 9-10 SOBRESALIENTE

read -p "Intruduzca la nota númerica: " nota

if [ $nota -ge 0 -a $nota -le 10 ]; then
	if [ $nota -ge 5 ]; then
		echo "Has aprobado"
		if [ $nota -lt 6 ];then
			echo "Tienes un aprobado"
		elif [ $nota -lt 7 ]; then
			echo "Tienes un bien"
		elif [ $nota -lt 9 ]; then
			echo "Tienes un notable"
		elif [ $nota -le 10 ]; then
			echo "Tienes un sobresaliente"
		fi
	else
		echo "Has suspendido"
	fi
else
	echo "No has introducido un número en el rango [0-10]"
fi

