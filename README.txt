Este proyecto se creó a partir del arquetipo "wildfly-jakartaee-webapp-archetype".

Para desplegarlo:
Ejecuta los objetivos de maven "install wildfly:deploy"

Para desinstalarlo:
Ejecuta los objetivos de maven "wildfly:undeploy"

==========================

Fuente de datos:
Este ejemplo incluye un archivo "persistence.xml" en "src/main/resources/META-INF". Este archivo define
una unidad de persistencia "demo64PersistenceUnit" que utiliza la base de datos por defecto JakartaEE.

En un entorno de producción, debe definir una base de datos en WildFly config y apuntar a esta base de datos
en "persistence.xml".

Si no utiliza beans de entidad, puede eliminar "persistence.xml".
==========================

JSF:
La aplicación web está preparada para JSF 4.0 incluyendo un "faces-config.xml" vacío en "src/main/webapp/WEB-INF".
En caso de que no desee utilizar JSF, simplemente elimine este archivo y "src/main/webapp/beans.xml".
==========================

Pruebas:
Esta muestra está preparada para ejecutar pruebas unitarias JUnit5 con el framework Arquillian.

La configuración se encuentra en "demo64/pom.xml":

Se definen tres perfiles:
- "default": no se ejecutan pruebas de integración.
-arq-remote": tienes que iniciar un servidor WildFly en tu máquina. Las pruebas se ejecutan desplegando
 la aplicación en este servidor.
 Aquí se habilita el "maven-failsafe-plugin" para poder ejecutar las pruebas de integración.