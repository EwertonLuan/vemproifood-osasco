## Pré-requisitos

- [Java JDK 8](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven](https://maven.apache.org/install.html)

Para poder utilizar o docker será necessário installar os seguintes programas:
- [Docker](https://www.docker.com/)
- [Docker-compose](https://docs.docker.com/compose/)

## Iniciando a API

Para iniciar a API localmente utilizando uma IDE basta rodar o arquivo DishListServiceApplication.java.

Antes de iniciar a API através do Docker é necessário criar o arquivo app.jar, dentro da pasta do projeto rode o comando:
```
$ mvn package
```
Após ter criado o app.jar utilize o docker-composose para iniciar a API:
```
$ docker-compose up
```

## Contratos da API

`/spotify/coordinates/:lat/:lon`

Realiza a indicação de musicas pelo clima da codernada

Parametros:
- :lat - latitude
- :lon - longitude

Retorna:
- Array com as tracks

`/spotify/city/:city`

Realiza a indicação de musicas pelo clima da cidade

Parametros:
- :city - nome da cidade

Retorna:
- Array com as tracks

Exemplo:

```
{
    "tracks": [
        {
            "artists": [
                {
                    "name": "The 1975"
                }
            ],
            "name": "Love It If We Made It"
        },
        {
            "artists": [
                {
                    "name": "Bobby Shmurda"
                }
            ],
            "name": "Hot N*gga"
        }
}
```
