#/bin/bash

# El bucle for ejecutará las líneas que contenga hasta que termine de recorrer los elementos de una lista

#Hay distintas formas de poner el for, solamente tengo que actualizar las variables en el for tradicional, las listas se iteran solas.

echo -e "=== FOR CON SEQ ===\n"

#seq me permite tener una lista con un rango de números donde el primero es el inicio y el segundo el final
for i in $(seq 5 8); do
	echo "Variable i = $i"
done

echo -e "\n=== FOR CON LISTA SIN SEQ (MISMO DE ANTES) ===\n"

for i in 5 6 7 8; do #Los elementos de una lista manual, van separados por espacios, observar también el for de nobres
	echo "Variable i = $i"
done

echo -e "\n=== FOR CON COMANDO ===\n"

for nombre in $(ls *.sh); do
	echo "Nombre del fichero: $nombre"
done

echo -e "\n=== FOR CON NOMBRES EN LISTA===\n"

for nombre in Daniel Asela Ricardo Oliver Juan Yako; do
	echo "Familia: $nombre"
done

echo -e "\n=== FOR TRADICIONAL ===\n"

for((i=1;i<=5;i++))
	do
		echo "Variable i = $i"
	done


