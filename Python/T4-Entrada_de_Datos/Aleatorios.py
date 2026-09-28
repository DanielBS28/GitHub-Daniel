#Usaremos la función randint(), que es parte del módulo random. 

#randint(a,b) devuelve un número entre a y b ambos incluidos.

#Para importar el módulo usaremos import random

import random #Esta linea de código debe de estar antes de randint()
#Otra forma es: from random import randint
from random import randint

#Generar un número aleatorio entre 1 y 10
numero = random.randint(1,10)
numero2 = randint(1,10) #Si pongo from random import randint no hace falta poner random.randint(a,b)

print(f"Número: {numero}")
print(f"Número: {numero2}")

#Simulamos un dado de 6 caras
dado = randint(1,6)
print(f"Dado: {dado}")




