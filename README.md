# HackaCode-Back



El diagrama de clases se presenta en formato jpg 
al igual que el documento de supuestos.

presentacion: https://youtube.com/watch?v=LJtMBf8EqbY&feature=share


## Environment

Para iniciar la base de datos se realizar una copia del archivo `.env.example` y se renombra a `.env`

```bash
  cp .env.example .env
```
y luegoi reemplazar el valor de las variables de entorno por su respectivo valor y luego ejecutar el siguiente comando
```bash
  docker-compose up -d
```


## Swagger 
Para poder visualizar los endpoint de la api se debe ingresar a la siguiente ruta
```bash
  http://localhost:8080/swagger-ui/index.html
```