#!/bin/bash

cadena1=""
cadena2=""

echo "Vamos a comparar dos palabras para ver si son iguales"
read -p "Introduce la palabra número uno para comparla con la dos: " cadena1
read -p "Introduce la palanra número dos para compararla con la uno: " cadena2

: '

En bash, para comparar cadenas, debes usar = en lugar de eq. eq se usa para comparar números, no cadenas. Además, es recomendable poner las variables entre comillas para manejar correctamente los casos donde las cadenas contienen espacios.

if [ $cadena1 eq $cadena2 ] ; then
	echo "La palabra $cadena1 y la palabra $cadena2 son iguales"
else
	echo "La palabra $cadena1 y la palabra $cadena2 no son iguales"
fi
'

# Solución correcta
: '
[] y [[ ]]: Se utilizan para realizar pruebas condicionales o comparaciones (comparar cadenas, comprobar condiciones, etc.).

(): Se utiliza principalmente para ejecutar comandos en un subshell o para definir funciones.

El uso de == dentro de los corchetes también puede funcionar en versiones recientes de Bash, pero el operador estándar y más seguro es =, ya que == es más específico de Bash y puede no ser compatible en todas las versiones o entornos de Shell.

[ "$cadena1" = "$cadena2" ]: Aquí usamos = para comparar las cadenas. Es importante usar las comillas alrededor de las variables para manejar correctamente los espacios o caracteres especiales en las cadenas o que estén vacías.
'

if [ "$cadena1" = "$cadena2" ] ; then
	echo "La palabra $cadena1 y la palabra $cadena2 son iguales"
else
	echo "La palabra $cadena1 y la palabra $cadena2 no son iguales"
fi
