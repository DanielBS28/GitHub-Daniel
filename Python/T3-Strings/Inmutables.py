# Las cadenas en python son inmutables, si quisieramos cambiar la cadena tendriamos que sobreescribirla (concatenar o modificar la cadena desde cero) o crear una nueva

texto = "Perro"

print(texto)

# texto[0] = "G" esto da error

texto = texto + "s" #Esto si se puede
texto += " funcionó bien" #Tambien con +=
texto = f"{texto}, también con fstring"

print(texto)