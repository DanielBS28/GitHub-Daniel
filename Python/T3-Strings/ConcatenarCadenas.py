#Para concatenar cadenas usaremos + 

nombre = "Daniel"
saludo = "Hola"

saludo_completo = saludo + " "  + nombre 

#o también con F Strings poniendo f delante

saludo_completo2 = f"{saludo} {nombre}"

print(saludo_completo)
print(saludo_completo2)

# Esto no funciona, tengo que combertir el 29 a str saludo_completo = saludo + " "  + nombre +29
saludo_completo3 = saludo + " "  + nombre + str(29)
print(saludo_completo3)

print("Tambien puedo usar comas", "¿Lo ves?", nombre, "¡Sí!")

#Nota: con f string no tengo que hacer conversiones puedo incluso hacer operaciones

print(f"Este año es {2025+1}")




