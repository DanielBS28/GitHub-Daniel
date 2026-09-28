#Es el mecanismo que python para determinar la existencia o vacio de un dato.

#Devuelve true o false

#Falsy: Nada o vacio 0 (int o float), "" (string vacio) , [] (lista vacia), None
#Truthy: Cualquier cosa que existe: 1,5,-7... "Hola", o espacio " ", [0] lista con datos, True

print(bool(0)) #False
print(bool(0.0))  #False
print(bool(42)) #True

print(bool("")) #False
print(bool(" ")) #True
print(bool("Hola")) #True

print(bool([])) #False
print(bool([0])) #True

print(bool(None)) #False

print(bool(False)) #False
print(bool(True)) #True

print(bool("False")) #True ya que es una cadena al estar entre "" y no está vacia. 
