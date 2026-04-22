# android-tp3 - Aplicación de Búsqueda de Libros - Patrón MVVM

## Descripción de la aplicación

Esta es una aplicación móvil desarrollada en Android (Java) que permite buscar información sobre libros. La aplicación está diseñada bajo el patrón de arquitectura MVVM (Model-View-ViewModel) y cuenta con las siguientes características:

1. **Búsqueda por título:** Permite al usuario ingresar el título de un libro y obtener información detallada sobre él.
2. **Validación de Entradas:** El sistema verifica que los campos no estén vacíos y muestra mensajes de error apropiados cuando la búsqueda no produce resultados.
3. **Interfaz Responsiva:** La aplicación muestra una vista de detalle con información completa del libro encontrado, incluyendo título, autor, año de publicación, cantidad de páginas, géneros, descripción y una imagen de portada.

## Integrantes

Esta actividad se realizó de manera individual.

- **Apellido:** Emanuel.
- **Nombre:** Angel.
- **Número de Documento:** 44600506.

## Detalles Técnicos y Arquitectura

La aplicación fue desarrollada implementando el patrón de arquitectura **MVVM (Model - View - ViewModel)**, separando las responsabilidades en tres capas fundamentales:

- **View (`SearchActivity` y `DetailsActivity`):** Se encarga única y exclusivamente de gestionar la interfaz gráfica y capturar las interacciones del usuario. Se utiliza `ViewBinding` para enlazar los componentes de la vista. Esta capa no contiene lógica de negocio; simplemente observa los datos expuestos por el ViewModel para actualizar la pantalla (por ejemplo, mostrando el libro encontrado o los mensajes de error).
- **ViewModel (`SearchActivityViewModel` y `DetailsActivityViewModel`):** Actúa como puente entre la Vista y el Modelo. Recibe los datos crudos de la vista, realiza las validaciones lógicas necesarias y utiliza `MutableLiveData` para exponer el estado actual a la vista de manera reactiva. Aquí se decide qué método del Modelo invocar según las acciones del usuario.
- **Model (`Book` y `BookRepository`):** Representa la lógica de negocio central. La clase `Book` es un modelo de datos puro que contiene la información del libro, mientras que `BookRepository` maneja la colección de libros y proporciona métodos para buscarlos. Es completamente independiente y no tiene referencias al framework de Android.

_Proyecto académico desarrollado para la Universidad de La Punta (ULP)._
