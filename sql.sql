CREATE TABLE personalsalud (
    id INT PRIMARY KEY,
    especialidad INT,
    clinica INT
);

CREATE TABLE estado (
    id INT PRIMARY KEY,
    descripcion VARCHAR(50)
);

CREATE TABLE clinica (
    id INT PRIMARY KEY,
    nombre VARCHAR(100),
    direccion VARCHAR(200)
);
