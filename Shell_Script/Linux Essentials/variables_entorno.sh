#!/bin/bash

#Ejemplo de ejecución ./variables_entorno.sh parámetro1

echo El script $0 #Devuelve el nombre del script
echo Lo está ejecutando el usuario: $USER #Devuelve el nombre del usuario
echo Se le ha asignado el PID: $$ #Devuelve el PID del proceso
echo Usamos el parámetro $1 #Parámetro1
mensaje="Hola mundo"
echo Para decir... $mensaje
