# Introducción: Clonar un proyecto
Para la resolución del siguiente ejercicio, será necesario que cada alumno tenga un repositorio personal, que contendrá la solución a entregar. Para eso, será necesario realizar un `fork` de este repositorio.

## Fork y Clone
1. Estando logueado en su cuenta personal de github, clickear en `fork`
![Captura Fork](http://i.imgur.com/Xd1rkXO.jpg) Esto generará un nuevo repositorio en su cuenta de github, y los redirigirá a él.

2. Desde Git Bash, clonar el recién creado repositorio
```
git clone https://github.com/<<SU USUARIO>>/empleartec-java
```
Esto creará un directorio con nombre "empleartec-java".
3. Situarse en el repositorio clonado
```
cd empleartec-java
```

## Resolución de ejercicio y entrega

Los archivos deberán ser guardados en el directorio `src` dentro `empleartec-java`.
Al finalizar la solución, para realizar la entrega deberán seguir los siguientes pasos, desde Git Bash:

1. Agregar los archivos creados o modificados
```
git add .
```
2. Generar un `commit` con los archivos recién agregados
```
git commit -m "Entrega de resolución de ejercicio de operaciones"
```
3. Subir la solución a github
```
git push
```
4. Verificar en la web de su repositorio en github, que los archivos han sido agregados.

# Ejercicio: Operaciones
Dado el siguiente diagrama de clases, generar el código correspondiente, y subirlo a su repositorio en github.

![Diagrama de Clases](http://i.imgur.com/zaeAfaG.jpg)
