/*Se crea la base de datos */
drop schema if exists practica;
-- Eliminar el usuario solo si existe
DELETE FROM mysql.user WHERE user = 'usuario_practica' AND host = '%';
FLUSH PRIVILEGES;
CREATE SCHEMA practica ;

/*Se crea un usuario para la base de datos llamado "usuario_practica" y tiene la contraseña "la_Clave"*/
create user 'usuario_practica'@'%' identified by 'la_Clave';

/*Se asignan los prvilegios sobre la base de datos practica al usuario creado */
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;

/* Se crea la tabla arbol*/
create table practica.arbol (
  id_arbol INT NOT NULL AUTO_INCREMENT,
  ruta_imagen VARCHAR(1024),
  nombre_comun VARCHAR(50),
  tipo_flor VARCHAR(50),
  dureza INT,
  PRIMARY KEY (id_arbol))

ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;