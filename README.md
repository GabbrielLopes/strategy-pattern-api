# Strategy Pattern API

Esse projeto simula uma leitura em diversos formatos de arquivo, sendo eles txt, csv, xlsx e xml. É enviado uma string apenas por parâmetro com o nome do arquivo e o formato, pois o foco do projeto é no pattern e não na leitura de arquivo em si... E de acordo com o arquivo é direcionado ao service correto para a leitura do arquivo.

## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

### 📋 Pré-requisitos

De que coisas você precisa para instalar o software e como instalá-lo?

```
IDE de sua preferência - para rodar o projeto
Postman para testar a aplicação
```

### 🔧 Instalação

Uma série de exemplos passo-a-passo que informam o que você deve executar para ter um ambiente de desenvolvimento em execução.

Clone e suba o projeto.

Collection para testar no postman:

```
{
	"info": {
		"_postman_id": "c912bf63-0ff6-44de-a29e-0886813f743f",
		"name": "Read File- Strategy Pattrern",
		"schema": "https://schema.getpostman.com/json/collection/v2.0.0/collection.json",
		"_exporter_id": "28860635"
	},
	"item": [
		{
			"name": "Read Files",
			"request": {
				"method": "POST",
				"header": [],
				"url": {
					"raw": "localhost:8080/v1/file/read?file=file-simulation1.txt",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"v1",
						"file",
						"read"
					],
					"query": [
						{
							"key": "file",
							"value": "file-simulation1.txt"
						},
						{
							"key": "file",
							"value": "file-simulation2.csv",
							"disabled": true
						},
						{
							"key": "file",
							"value": "file-simulation3.xlsx",
							"disabled": true
						},
						{
							"key": "file",
							"value": "file-simulation4.xml",
							"disabled": true
						},
						{
							"key": "file",
							"value": "file-sumilation-error.pdf",
							"disabled": true
						}
					]
				}
			},
			"response": []
		}
	]
}
```

### Exemplo Postman
![image](https://github.com/GabbrielLopes/strategy-pattern-api/assets/101233353/ab61df0a-0f28-4961-bfec-51ab9dd70229)


## 🛠️ Construído com

* [SpringBoot](https://start.spring.io/)
* [Maven](https://maven.apache.org/)
* [Lombok](https://projectlombok.org/)
