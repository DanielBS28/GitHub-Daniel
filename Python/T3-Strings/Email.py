#Hay que normalizar la información, quitar espacios en el nombre y añadir puntos, en el correo quitar espacios y añadir la extension y la @

nombre = "  Daniel Baldazo Sanchez  "
dominio = " Universidad Politecnica Madrid  "
extension = ".es"

nombre_normalizado = nombre.strip()  #strip es como el trim de java, quita espacios al principio y al final. 
dominio_normalizado = dominio.strip()

nombre_normalizado = nombre_normalizado.replace(" ", ".").lower()

dominio_normalizado = dominio_normalizado.replace(" ", "").lower()

email = f"{nombre_normalizado}@{dominio_normalizado}{extension}"
print(email)