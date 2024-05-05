```json
{
  "openapi": "3.0.1",
  "info": {
    "title": "OpenAPI definition",
    "version": "v0"
  },
  "servers": [
    {
      "url": "http://localhost:8080",
      "description": "Generated server url"
    }
  ],
  "paths": {
    "/point/{id}": {
      "get": {
        "tags": [
          "base-point-controller"
        ],
        "summary": "get base points by id",
        "description": "Загружает данные о геодеческом пункте с указанным идентификатором",
        "operationId": "getBasePointById",
        "parameters": [
          {
            "name": "id",
            "in": "path",
            "required": true,
            "schema": {
              "type": "integer",
              "format": "int64"
            }
          }
        ],
        "responses": {
          "404": {
            "description": "Not found",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          },
          "500": {
            "description": "Internal server error",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          },
          "200": {
            "description": "Success",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          }
        }
      },
      "put": {
        "tags": [
          "base-point-controller"
        ],
        "summary": "Updates base point with desired id",
        "description": "Обновляет информацию о геодезическом пункте с указанным идентификатором",
        "operationId": "updateBasePoint",
        "parameters": [
          {
            "name": "id",
            "in": "path",
            "required": true,
            "schema": {
              "type": "integer",
              "format": "int64"
            }
          }
        ],
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/Пункт геодезической сети"
              }
            }
          },
          "required": true
        },
        "responses": {
          "404": {
            "description": "Not found",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          },
          "500": {
            "description": "Internal server error",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          },
          "200": {
            "description": "Success",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          }
        }
      },
      "delete": {
        "tags": [
          "base-point-controller"
        ],
        "summary": "removes base point by id",
        "description": "Удаляет запись с указанным идентификатором из базы данных",
        "operationId": "removeBasePointById",
        "parameters": [
          {
            "name": "id",
            "in": "path",
            "required": true,
            "schema": {
              "type": "integer",
              "format": "int64"
            }
          }
        ],
        "responses": {
          "404": {
            "description": "Not found",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          },
          "500": {
            "description": "Internal server error",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          },
          "200": {
            "description": "Success",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          }
        }
      }
    },
    "/point": {
      "get": {
        "tags": [
          "base-point-controller"
        ],
        "summary": "gets all the basic geodetic points",
        "description": "Загружает данные обо всех геодезических пунктах, хранящихся в базе данных",
        "operationId": "getAllBasePoints",
        "responses": {
          "404": {
            "description": "Not found",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          },
          "500": {
            "description": "Internal server error",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          },
          "200": {
            "description": "Success",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          }
        }
      },
      "post": {
        "tags": [
          "base-point-controller"
        ],
        "summary": "creates new base point",
        "description": "Создаёт в базе данных новую запись с информацией о геодезическом пункте",
        "operationId": "createBasePoint",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/Пункт геодезической сети"
              }
            }
          },
          "required": true
        },
        "responses": {
          "404": {
            "description": "Not found",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          },
          "500": {
            "description": "Internal server error",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          },
          "201": {
            "description": "Created",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          },
          "200": {
            "description": "Success",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Пункт геодезической сети"
                }
              }
            }
          }
        }
      }
    },
    "/point/area": {
      "post": {
        "tags": [
          "base-point-controller"
        ],
        "summary": "Gets list of base points inside the specified area",
        "description": "Загружает список пунктов, внутри указанной области",
        "operationId": "getByArea",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/Прямоугольная область поиска"
              }
            }
          },
          "required": true
        },
        "responses": {
          "404": {
            "description": "Not found",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          },
          "500": {
            "description": "Internal server error",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          },
          "200": {
            "description": "Success",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/point/sheet/{sheet}": {
      "get": {
        "tags": [
          "base-point-controller"
        ],
        "summary": "get base points by sheet",
        "description": "Загружает список пунктов, название листа или объекта которых содержит указанный фрагмент",
        "operationId": "getBasePointBySheet",
        "parameters": [
          {
            "name": "sheet",
            "in": "path",
            "required": true,
            "schema": {
              "type": "string"
            }
          }
        ],
        "responses": {
          "404": {
            "description": "Not found",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          },
          "500": {
            "description": "Internal server error",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          },
          "200": {
            "description": "Success",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/point/name/{name}": {
      "get": {
        "tags": [
          "base-point-controller"
        ],
        "summary": "get base points by name",
        "description": "Загружает список пунктов, название которых содержит указанный фрагмент",
        "operationId": "getBasePointByName",
        "parameters": [
          {
            "name": "name",
            "in": "path",
            "required": true,
            "schema": {
              "type": "string"
            }
          }
        ],
        "responses": {
          "404": {
            "description": "Not found",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          },
          "500": {
            "description": "Internal server error",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          },
          "200": {
            "description": "Success",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/Пункт геодезической сети"
                  }
                }
              }
            }
          }
        }
      }
    }
  },
  "components": {
    "schemas": {
      "Пункт геодезической сети": {
        "required": [
          "Координата X, мм.",
          "Координата Y, мм.",
          "Координата Z, мм.",
          "Название пункта"
        ],
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int64"
          },
          "Название пункта": {
            "type": "string"
          },
          "Координата X, мм.": {
            "type": "integer",
            "format": "int64"
          },
          "Координата Y, мм.": {
            "type": "integer",
            "format": "int64"
          },
          "Координата Z, мм.": {
            "type": "integer",
            "format": "int64"
          },
          "Номенклатура листа карты Масштаба 1:100 000 или название объекта": {
            "type": "string"
          },
          "Класс точности сети пункта": {
            "type": "string"
          },
          "Название системы координат": {
            "type": "string"
          }
        }
      },
      "Прямоугольная область поиска": {
        "required": [
          "Высота области (протяжённость с юга на север), мм.",
          "Ширина области (протяжённость с востока на запад), мм.",
          "Юго-западный угол X, мм.",
          "Юго-западный угол Y, мм."
        ],
        "type": "object",
        "properties": {
          "Юго-западный угол X, мм.": {
            "type": "integer",
            "format": "int64"
          },
          "Юго-западный угол Y, мм.": {
            "type": "integer",
            "format": "int64"
          },
          "Высота области (протяжённость с юга на север), мм.": {
            "type": "integer",
            "format": "int64"
          },
          "Ширина области (протяжённость с востока на запад), мм.": {
            "type": "integer",
            "format": "int64"
          }
        }
      }
    }
  }
}
```