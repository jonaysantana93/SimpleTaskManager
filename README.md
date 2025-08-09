# 📋 SimpleTaskManager

Aplicación Android sencilla para gestionar tareas, creada con **Jetpack Compose** y **Room**.  
Permite **añadir, editar, marcar como completadas y eliminar tareas**, almacenándolas de forma local en el dispositivo.  
Diseño minimalista siguiendo **Material Design**, ideal como base para futuras mejoras y sincronización en la nube.

---

## 📖 Descripción breve
Aplicación Android desarrollada con Jetpack Compose y Room para la gestión de tareas offline.  
Se ha implementado arquitectura **MVVM** para mantener un código limpio, escalable y fácil de mantener.

---

## 🎯 Objetivos de esta versión
- Añadir, editar, completar y eliminar tareas.
- Guardar datos de forma persistente usando Room.
- Interfaz minimalista con Material Design.
- 100% funcional sin conexión a Internet.

---

## 📱 Pantallas

### 1. **Listado de tareas**
- **Descripción:** Lista todas las tareas registradas por el usuario.
- **Elementos:**
  - Checkbox para marcar como completada/pendiente.
  - Texto con título de la tarea.
  - Indicador visual para tareas completadas.
  - Botón flotante (+) para añadir tarea.
- **Diseño:** Basado en Material Design, con `LazyColumn` y colores claros.

### 2. **Crear/Editar tarea**
- **Descripción:** Formulario para añadir o modificar una tarea.
- **Elementos:**
  - Campo de texto para el título.
  - Botón para guardar.
- **Diseño:** Disposición vertical simple, botón destacado.

### 3. **Confirmación de eliminación** *(opcional en esta versión)*
- **Descripción:** Diálogo emergente para confirmar borrado.
- **Elementos:**
  - Texto de confirmación.
  - Botón aceptar y botón cancelar.
 
<img width="1024" height="1024" alt="image" src="https://github.com/user-attachments/assets/05248831-10c3-4948-807c-19c188d6df73" />

---

## 🏗 Arquitectura
El proyecto sigue **MVVM**:
- **Model:** Entidad Tarea y base de datos Room.
- **ViewModel:** Lógica de negocio y conexión con DAO.
- **View:** Interfaz hecha en Jetpack Compose, reactiva a los cambios de estado.

---

## 🔮 Futuras mejoras
- Sincronización con backend en **Railway**.
- Autenticación de usuario.
- Filtros por estado (pendiente/completada).
- Recordatorios mediante notificaciones.

---

## 🚀 Instalación y ejecución

1. Clonar el repositorio:

  git clone https://github.com/jonaysantana93/simple-task-manager.git

3. Abrir el proyecto en **Android Studio** (versión recomendada: última estable).
4. Sincronizar las dependencias Gradle.
5. Ejecutar en emulador o dispositivo físico Android.

---

## 📄 Licencia
Este proyecto está licenciado bajo los términos de la [Apache License 2.0](LICENSE).

Copyright 2025 @jonaysantana93

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at:

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

---

