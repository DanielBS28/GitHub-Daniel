# IDENTIFICADOR_VARIABLE = VALOR

numero = 5 #Python usa referencias, en python son todo objetos.
print(numero) #Imprime el valor de la variable numero. 
# numero almacena una referencia.

numero = 10 # Se apunta a un nuevo objeto aunque lo hayamos reasignado, el numero = 5 lo recolecta el recolector de basura.
print(numero)

#id(varibale) devuelve la dirección de memoria de cada objeto.
numero = 5
print(id(numero))  # Imprime, por ejemplo: 140733192

numero = 10
print(id(numero))  # Imprime un número totalmente distinto: 140733232