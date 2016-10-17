/*
SQLyog Ultimate v9.02 
MySQL - 5.6.16 : Database - agenda
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`agenda` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `agenda`;

/*Table structure for table `authorities` */

DROP TABLE IF EXISTS `authorities`;

CREATE TABLE `authorities` (
  `username` varchar(128) DEFAULT NULL,
  `authority` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `authorities` */

insert  into `authorities`(`username`,`authority`) values ('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER'),('dave','ROLE_USER');

/*Table structure for table `contacto` */

DROP TABLE IF EXISTS `contacto`;

CREATE TABLE `contacto` (
  `id_contacto` int(11) NOT NULL AUTO_INCREMENT,
  `direccion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `usuario_id_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_contacto`),
  KEY `FKckgpsqqkpcb6meejbk2p0xm9g` (`usuario_id_usuario`),
  CONSTRAINT `FKckgpsqqkpcb6meejbk2p0xm9g` FOREIGN KEY (`usuario_id_usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `contacto` */

insert  into `contacto`(`id_contacto`,`direccion`,`nombre`,`telefono`,`usuario_id_usuario`) values (1,'Guatemala','C1','66309980',1),(2,'Mexico','c2','6546546',2);

/*Table structure for table `rol` */

DROP TABLE IF EXISTS `rol`;

CREATE TABLE `rol` (
  `id_rol` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_rol`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `rol` */

insert  into `rol`(`id_rol`,`nombre`) values (1,'ROL_ADMIN'),(2,'ROL_CLIENTE');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `username` varchar(128) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `enabled` tinyint(4) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`username`,`password`,`enabled`) values ('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1),('dave','secret',1);

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `contrasena` varchar(255) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `habilitado` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `rol_id_rol` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `FK53p14xu8lx79r6lyweraumgqt` (`rol_id_rol`),
  CONSTRAINT `FK53p14xu8lx79r6lyweraumgqt` FOREIGN KEY (`rol_id_rol`) REFERENCES `rol` (`id_rol`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`id_usuario`,`contrasena`,`correo`,`habilitado`,`nombre`,`token`,`rol_id_rol`) values (1,'123','inforetana@gmail.com','1','Francisco Retana',NULL,1),(2,'321','jp@gmail.com','1','Juan Perez',NULL,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
