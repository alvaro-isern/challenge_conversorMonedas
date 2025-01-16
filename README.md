# Conversor de Moneda

<!-- 
  Aquí podrías incluir una imagen de portada para tu proyecto. 
  Por ejemplo, un banner o logotipo representativo. 
  Ejemplo:
  ![Portada](ruta/hacia/imagen.png)
-->

## Insignias

<!-- 
  Sección opcional para colocar distintivos, 
  como estado del build, cobertura de tests, etc. 
  Ejemplo:
  [![Estado del build](https://img.shields.io/badge/build-passing-brightgreen.svg)](...)
  [![Cobertura de tests](https://img.shields.io/badge/Coverage-80%25-green.svg)](...)
-->

[![Estado del Proyecto](https://img.shields.io/badge/STATUS-TERMINADO-brightgreen.svg)]()

---

## Índice
1. [Descripción del Proyecto](#descripción-del-proyecto)  
2. [Estado del Proyecto](#estado-del-proyecto)  
3. [Características de la Aplicación y Demostración](#características-de-la-aplicación-y-demostración)  
4. [Acceso al Proyecto](#acceso-al-proyecto)  
5. [Tecnologías Utilizadas](#tecnologías-utilizadas)  
6. [Personas Contribuyentes](#personas-contribuyentes)  
7. [Personas-Desarrolladores del Proyecto](#personas-desarrolladores-del-proyecto)  
8. [Licencia](#licencia)  
9. [Conclusión](#conclusión)

---

## Descripción del Proyecto
El **Conversor de Moneda** es una aplicación escrita en **Java** que facilita la conversión entre diferentes monedas en tiempo real, aprovechando una API de tipo de cambio.  
Se ha desarrollado siguiendo el paradigma de programación orientada a objetos, usando **Gson** para procesar JSON y las clases `HttpClient`, `HttpRequest` y `HttpResponse` disponibles a partir de Java 11.

Sus objetivos principales incluyen:  
- Ofrecer una experiencia fácil de usar para convertir montos entre monedas.  
- Demostrar buenas prácticas de consumo de APIs REST.  

---

## Estado del Proyecto
> **Terminado**  
El proyecto se encuentra **finalizado** y cumple sus objetivos principales. Sin embargo, si surgen nuevas ideas o propuestas de mejora, se podrían integrar en versiones posteriores.  
Algunas posibles mejoras que podrían añadirse en el futuro incluyen:  
- Interfaz gráfica (GUI) usando frameworks como JavaFX o Swing.  
- Funcionalidades de histórico de conversiones.  
- Registros con Marca de Tiempo.
- Utilizar otras API's de tasa de cambio de moneda como Open Exchange Rates y CoinGecko API.

---

## Características de la Aplicación y Demostración
- **Menú Interactivo por Consola**: El usuario puede seleccionar diferentes opciones para convertir monedas (por ejemplo, USD a EUR, USD a MXN, EUR a GPB, PEN a BRL) o ingresar manualmente cualquier par de monedas.  
- **Consumo de API**: Emplea [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener los últimos valores de conversión.  
- **Programación Orientada a Objetos**: Separación clara de clases como `class ConsultarMoneda`, `record Moneda`, `class ConvertirMoneda` y `class ConversorApp` .  
- **Gson para JSON**: Procesamiento y validación del JSON recibido, acceso al atributo `"conversion_rates"` para filtrar la moneda de origen y destino (moneda convertida).  
- **Escalabilidad**: Permite agregar fácilmente nuevas monedas, ya que las tasas se obtienen de forma dinámica.  

### Capturas

![image](https://github.com/user-attachments/assets/abf8e4d0-e253-4f9b-9963-084ef641a181)<br>
![image](https://github.com/user-attachments/assets/76038dcb-b8d5-4931-8215-c5c23f0ca468)

---

## Acceso al Proyecto
Para **clonar** o **descargar** este repositorio:

```bash
git clone https://github.com/alvaro-isern/challenge_conversorMonedas.git
```
1. **Abre el proyecto** en tu IDE favorito (Eclipse, IntelliJ, NetBeans, etc.).
2. **Asegúrate** de contar con **Java 17**.
3. **Incluye** la dependencia de **Gson**.
4. **Compila** y ejecuta la clase principal `ConversorApp`.

---

## Tecnologías Utilizadas
- **Java 17**  
  - Clases `HttpClient`, `HttpRequest`, `HttpResponse` y `Map`
- **Gson**  
  - Manejo de estructuras JSON

---

## Personas-Desarrolladores del Proyecto
- **Alvaro Isern** (Desarrollador Principal)  
  - [LinkedIn](www.linkedin.com/in/alvaro-isern-904808315)  
  - [GitHub](https://github.com/alvaro-isern)  
  - *Email:* <sss12345iiialvaro@gmail.com>

---

## Conclusión
El **Conversor de Moneda** sirve como ejemplo práctico de cómo integrar distintas herramientas de Java (POO, `HttpClient`, `Gson`) junto con una API REST, para lograr conversiones de moneda en tiempo real. Su diseño modular y sencillo promueve la fácil ampliación de funcionalidades y la colaboración.

**¡Gracias por tu interés y por visitar este proyecto!**
