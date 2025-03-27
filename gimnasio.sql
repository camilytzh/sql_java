USE gimnasio;

CREATE TABLE IF NOT EXISTS usuario(
	cedula VARCHAR(10) PRIMARY KEY NOT NULL,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    contraseña VARCHAR(50) NOT NULL,
    rol ENUM('cliente', 'administrador', 'entrenador', 'recepcionista') NOT NULL
);

CREATE TABLE IF NOT EXISTS membresia(
	id INT PRIMARY KEY NOT NULL,
    tipo ENUM('mensual','trimestral','semestral','anual') NOT NULL,
    costo DECIMAL(10,2) NOT NULL,
    duracion INT NOT NULL
);

CREATE TABLE IF NOT EXISTS cliente(
	ced_usuario VARCHAR(10) PRIMARY KEY NOT NULL,
    membresia_id int NOT NULL,
    estado_membresia ENUM('activo','inactivo') NOT NULL,
    fecha_inicio_membresia DATE NOT NULL,
    fecha_fin_membresia DATE NOT NULL,
    FOREIGN KEY(ced_usuario) REFERENCES Usuario(cedula)
);

CREATE TABLE IF NOT EXISTS entrenador(
	ced_usuario VARCHAR(10) PRIMARY KEY NOT NULL,
    especialidad VARCHAR(50) NOT NULL,
    FOREIGN KEY(ced_usuario) REFERENCES Usuario(cedula)
);

CREATE TABLE IF NOT EXISTS administrador(
	ced_usuario VARCHAR(10) PRIMARY KEY NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    FOREIGN KEY(ced_usuario) REFERENCES Usuario(cedula)
);

CREATE TABLE IF NOT EXISTS clase(
	id INT PRIMARY KEY NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    ced_entrenador VARCHAR(10) NOT NULL,
    horario VARCHAR(255) NOT NULL,
    cupo INT NOT NULL,
    FOREIGN KEY(ced_entrenador) REFERENCES Entrenador(ced_usuario)
);

CREATE TABLE IF NOT EXISTS inscripcion(
	id INT PRIMARY KEY NOT NULL,
    ced_cliente VARCHAR(10) NOT NULL,
    clase_id INT NOT NULL,
    FOREIGN KEY(ced_cliente) REFERENCES Cliente(ced_usuario),
    FOREIGN KEY(clase_id) REFERENCES Clase(id)
);

CREATE TABLE IF NOT EXISTS rutina(
	id INT PRIMARY KEY NOT NULL,
    ced_cliente VARCHAR(10) NOT NULL,
    ced_entrenador VARCHAR(10) NOT NULL,
    descripcion VARCHAR(266),
    FOREIGN KEY(ced_cliente) REFERENCES Cliente(ced_usuario),
    FOREIGN KEY(ced_entrenador) REFERENCES Entrenador(ced_usuario)
);

CREATE TABLE IF NOT EXISTS pago(
	id INT PRIMARY KEY NOT NULL,
    ced_cliente VARCHAR(10) NOT NULL,
    membresia_id INT NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    fecha DATE NOT NULL,
    FOREIGN KEY(ced_cliente) REFERENCES Cliente(ced_usuario),
    FOREIGN KEY(membresia_id) REFERENCES Membresia(id)
);

CREATE TABLE IF NOT EXISTS ejercicio(
	id INT PRIMARY KEY NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    grupo_muscular VARCHAR(100) NOT NULL,
    repeticiones INT NOT NULL,
    series INT NOT NULL
);

CREATE TABLE IF NOT EXISTS ejercicio_rutina(
	id INT PRIMARY KEY NOT NULL,
    rutina_id INT NOT NULL,
    ejercicio_id INT NOT NULL,
    FOREIGN KEY(rutina_id) REFERENCES Rutina(id),
    FOREIGN KEY(ejercicio_id) REFERENCES Ejercicio(id)
);



