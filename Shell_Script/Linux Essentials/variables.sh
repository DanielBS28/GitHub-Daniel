#!/bin/bash

v1="Hola"
v2="mundo"

echo $v1 Mundo

#Forma de acceder al contenido con $ y con ${}
echo $v1 ${v2}

nombre="Juan"
echo "Hola ${nombre}ito" #Si no ponemos {} y usamos solo $ daría error, ya que la variable Juanito no existe, si queremos poner Juan + ito hay que usar {}

#IMPORTANTE: No es lo mismo V1 que v1, se contemplan las mayúsculas y minúsculas en BASH
