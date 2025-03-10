#!/bin/bash
#Voy a pasar parametros desde la línea de comandos a este script
 nombre=$1
 apellido=$2
 echo "Mi nombre es $nombre y mi apellido es $apellido"
 echo "La cantidad de parametros que tienes que pasar a este script son $#"
 echo "Los parametros que has pasado son: $*"
