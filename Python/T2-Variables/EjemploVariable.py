# Programa información personal

nombre = "Daniel"
edad = 23
pais = "España"

# Forma 1 de imprimir (Funciona perfectamente, no hace falta espacio se añade uno):
print("Nombre:", nombre)
print("Edad:", edad)
print("Pais:", pais)

# Forma 2 de imprimir (Corregida transformando la edad a texto, si no da error, no es como en Java que hay conversión implicita) Python no hace esto automáticamente porque es de tipado fuerte; te obliga a convertir el entero explícitamente usando str(edad).
print("Mi nombre es " + nombre + " y mi edad es " + str(edad) + " años y soy de " + pais)

# Forma 3 (La forma "Pythonic" recomendada: f-strings):
#Introducidas a partir de Python 3.6, las cadenas formateadas (colocando una f antes de las comillas) te permiten meter variables directamente entre llaves {} sin importar su tipo de datos. Es la opción más limpia, rápida y legible.
print(f"Mi nombre es {nombre} y mi edad es {edad} años y soy de {pais}")