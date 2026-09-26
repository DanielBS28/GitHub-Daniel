#En python no existen constantes, pero para indicarlo con la intención de que no se modifique se pone en mayúsculas el nombre de la constante.

import math


print("Constantes en python, NUNCA hay que cambiarles el valor aunque python lo permita")
PI = 3.14
MENSAJE_ERROR = "Datos mal introducidos"
NOMBRE_BASE_DE_DATOS = "myDb.sql"

print()
print("El valor de PI es:", PI)
print("Error:", MENSAJE_ERROR)
print("Nombre de la base de datos: ", NOMBRE_BASE_DE_DATOS)

#Constante del lenguage python, (aunque no usa mayuscula es una constante de la libreria math):

print("Valor de math.pi", math.pi)
