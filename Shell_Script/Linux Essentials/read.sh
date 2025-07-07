#!/bin/bash

# Pedimos al usuario una variable (un valor) con read
read variable1

# Imprimimos el valor que el usuario a introducido

echo El valor introducido es: $variable1

# Si ponemos dos variables y dos palabras se asignarán a las variables.
# Si ponemos dos variables y una palabra, la palabra se asigna a la primera variable y la segunda variable quedará vacía
# Si ponemos dos variables y dos o mas palabras, la primera variable será la primera palabra mientras que la segunda variable tendrá
# todo lo que venga después (Hasta el salto de línea).

# LAS VARIABLES SE PIDEN POR CONSOLA, CADA VARIABLE SERÁ UNA PALABRA SEPARADA POR UN ESPACIO EN BLANCO, COMO SI FUERAN PARAMÉTROS

read variable12 variable22

echo El valor introducido es: $variable12
echo El valor introducido es: $variable22

# Sigue la misma lógica que el apartado con dos variables.

read variable13 variable23 variable33

echo El valor introducido es: $variable13
echo El valor introducido es: $variable23
echo El valor introducido es: $variable33
