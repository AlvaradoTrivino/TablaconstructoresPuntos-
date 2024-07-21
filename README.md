## Presentacion de Tabla de total de puntos de Contructor
![Captura de pantalla (229)](https://github.com/user-attachments/assets/d657cfb8-f1c4-46ae-8c6e-ef3f0f66684c)

## Gráfico de la Estructura del Proyecto
project
├── App.java                      
├── controller
│   └── TotalPointsConstruc.java  
├── model
│   ├── Conexion.java             
│   └── ConstructorPoints.java     
├── repository
│   └── ContructorPoints.java     
├── view
│   └── fxml
│       └── tablaConstrucPoints.fxml 
└── module-info.java    

## Estructura del Proyecto
App.java: Clase principal de la aplicación que inicia JavaFX y carga la interfaz FXML.
controller/TotalPointsConstruc.java: Controlador que configura y carga la tabla de puntos de constructores desde el repositorio.
model/Conexion.java: Clase que maneja la conexión a la base de datos (MySQL o PostgreSQL).
model/ConstructorPoints.java: Modelo que representa los datos de puntos de un constructor.
repository/ContructorPoints.java: Repositorio que obtiene los puntos de los constructores desde la base de datos utilizando una consulta SQL.
view/fxml/tablaConstrucPoints.fxml: Archivo FXML que define la interfaz de la tabla de puntos de constructores.
module-info.java: Configuración del módulo que especifica las dependencias y las exportaciones necesarias.

## App.java
Clase principal de la aplicación que inicia JavaFX y carga la interfaz FXML.

Método start(): Configura la escena principal y carga el archivo FXML tablaConstrucPoints.fxml.
Método main(): Inicia la aplicación JavaFX.
controller/TotalPointsConstruc.java
Controlador que configura y carga la tabla de puntos de constructores desde el repositorio.

## Implementa Initializable para inicializar los componentes de la interfaz.
Método initialize(): Configura las columnas de la tabla y carga los datos.
Método loadConstructorsData(): Obtiene los datos de constructores desde el repositorio y los agrega a la tabla.
model/Conexion.java
Clase que maneja la conexión a la base de datos (MySQL o PostgreSQL).

Método EstablecerConexion(): Establece y retorna una conexión a la base de datos especificada.
model/ConstructorPoints.java
Modelo que representa los datos de puntos de un constructor.

Contiene los atributos constructorName y points.
Métodos get y set para cada atributo.
repository/ContructorPoints.java
Repositorio que obtiene los puntos de los constructores desde la base de datos utilizando una consulta SQL.

Método getConstructorTotalPoints(): Ejecuta una consulta SQL para obtener los puntos de los constructores y retorna una lista de ConstructorPoints.
view/fxml/tablaConstrucPoints.fxml
Archivo FXML que define la interfaz de la tabla de puntos de constructores.

##  Define la estructura de la tabla y sus columnas.
module-info.java
Configuración del módulo que especifica las dependencias y las exportaciones necesarias.

Requiere módulos javafx.controls, javafx.fxml y java.sql.
Abre paquetes a javafx.fxml y exporta paquetes necesarios.

Esta estructura permite una gestión clara y modular del código, facilitando el mantenimiento y la escalabilidad del proyecto. Cada componente tiene una responsabilidad específica, lo que mejora la organización y la legibilidad del código.

