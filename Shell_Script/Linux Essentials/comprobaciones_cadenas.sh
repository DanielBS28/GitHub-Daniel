#!/bin/bash

#Sintaxis para comparar texto (se compara por orden alfabético):

#OJO (Importante los espacios antes y después del = ya que así estamos comparando, si no estaríamos asignando)

#CAD1 = CAD2 (CAD1 es que CAD2)
#CAD1 > CAD2 (CAD1 es que CAD2)
#CAD1 < CAD2 (CAD1 es que CAD2)
#CAD1 != CAD2 (CAD1 es que CAD2)
#-n CAD1 (CAD1 es que CAD2)

v1="a"
v2="a"

if [ $v1 = $v2 ];then #Si ponemos[ $v1=$v2 ]sería también verdad por que la asignación se hace correctamente
	echo "V1 es igual a V2"
fi
