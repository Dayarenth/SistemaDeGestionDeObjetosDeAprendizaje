<?php
session_start();
if (@!$_SESSION['usuario']) {
    header("Location:../../index.php");
} elseif ($_SESSION['tipo_usuario'] == 'EST') {
    //header("Location:index2.php");
    echo "eres estudiante";
} elseif ($_SESSION['tipo_usuario'] == 'ADM') {
    echo "eres estudiante";
}
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="es">
    <head>

        <meta charset="utf-8"></meta>
        <meta name="viewport" content="width=device-width, initial-scale=1"></meta>
        <link rel="stylesheet" href="../../plugins/bootstrap/css/bootstrap.min.css"></link>
        <link href="../../estilos/estilosHerramientas.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="../../plugins/bootstrap/js/jquery-3.3.1.js"></script>
        <script type="text/javascript" src="../../plugins/bootstrap/js/bootstrap.min.js"></script>
        <title>Proyecto SGOA</title>
    </head>
    

    <body data-spy="scroll" data-target="#myScrollspy" data-offset="20">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                    <a class="navbar-brand" href="#">Bienvenid@: <strong><?php echo $_SESSION['usuario'] ?></strong></a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li ><a href="../modulos_profesor/pro_importar_catalogar.php">Importar y catalogar</a></li>
                        <li><a href="../modulos_profesor/pro_buscar.php">Buscar</a></li>
                        <li class="active"><a href="../modulos_profesor/pro_herramientas.php">Herramientas</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="../desconectar_sesion.php"><span class="glyphicon glyphicon-log-out"></span> Salir</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <!--   <div class="container-fluid"  style="background-color: #B0C4DE; color: #fff; height:100px;text-align: center;">
               <h1>SISTEMA DE GESTION DE OBJETOS DE APRENDIZAJE</h1>-->
        </div>

        <!-- --------------------------------------------- -->

        </div>
        </div>
        </div>
        <!-- --------------------------------------------- -->
        <div class="container">
            <div class="row">
                <nav class="col-sm-3" id="myScrollspy">
                    <ul class="nav nav-pills nav-stacked" data-spy="affix" data-offset-top="205">
                        <li class="active"><a style="font-size:14px;" href="#">Herramientas para:</a></li>
                        <li><a style="font-size:14px;" href="#section1">Crear OA</a></li>
                        <li><a style="font-size:14px;" href="#section2">Apoyo de OA</a></li>
                        <li><a style="font-size:14px;" href="#section3">Desarrollo de SGOA</a></li>

                    </ul>
                </nav>
                <!-- --------------------INICIO SECCION 1------------------------- -->
                <div class="col-sm-9">
                    <div id="section1">
                        <h1 style="text-align: center; color: #000000;">Herramientas para la creación de objetos de aprendizaje</h1>
                        <div class="container-fluid bg-3 text-center">    
                            <div class="row">
                                <div class="col-sm-6">
                                    <img src="../../images/exe.png" class="img-responsive" style="width:100%" alt="Image"></br>
                                        <p style="text-align: justify; color: #000000;">eXeLearning es un programa libre y abierto bajo licencia GPL-2 para ayudar a 
                                            los docentes en la creación y publicación de contenidos, y que permite a profesores 
                                            y académicos la publicación de contenidos didácticos en soportes informáticos 
                                            (CD, memorias USB, en la web, en la nube), sin necesidad de ser ni convertirse en expertos en HTML, XML o HTML5.
                                            eXeLearning está disponible en GNU/Linux, Microsoft Windows y Mac OS X.</br>

                                            <p>Puedes acceder haciendo click <a href="http://exelearning.net/">aquí</a></p>
                                        </p>
                                </div>
                                <div class="col-sm-6"> 
                                    <img src="../../images/quizFaber.png" class="img-responsive" style="width:100%" alt="Image"></br></br>
                                        <p style="text-align: justify; color: #000000;">
                                            Es un software gratuito para Windows que le permite crear cuestionarios multimedia
                                            como documentos HTML . Este programa simplifica la creación de cuestionarios en HTML 
                                            sin ningún conocimiento previo de HTML o JavaScript.</br></br>
                                            El cuestionario está listo para ser publicado en Internet, 
                                            en una red local (con protocolo de Intranet) o en una PC local.
                                            <p>Puedes acceder haciendo click <a href="http://www.quizfaber.com/index.php/en/">aquí</a></p>
                                        </p>
                                </div>
                                <div class="col-sm-6"> 
                                    <img src="../../images/edilim.png" class="img-responsive" style="width:100%" alt="Image"></br>
                                        <p style="text-align: justify; color: #000000;">
                                            EdiLIM es un editor de libros LIM (Libros Interactivos Multimedia) para la creación de materiales educativos en entornos Microsoft Windows.

                                            Es una sencilla aplicación con la que se puede preparar cualquier libro educativo para su distribución 
                                            o publicación en Internet.

                                            Se compone de archivos que se denominan libros, y de actividades que se denominan páginas. 
                                            Las páginas pueden ser interactivas (sopas de letras, rompecabezas, preguntas, etc.) o descriptivas (muestran información).

                                            Se presenta como un programa ejecutable de pequeño 
                                            tamaño que no precisa instalación.
                                            <p>Puedes acceder haciendo click <a href="http://www.educalim.com/cinicio.htm">aquí</a></p>
                                        </p>
                                </div>

                                <div class="col-sm-6"> 
                                    <img src="../../images/xarxatic.jpg" class="img-responsive" style="width:100%" alt="Image"></br>
                                        <p style="text-align: justify; color: #000000;">
                                            Unas de las herramientas más útiles que nos brinda a los docentes la web 2.0 
                                            es la posibilidad de la “creación de actividades educativas multimedia” 
                                            mediante determinados sitios donde ni tan sólo es necesario bajar ningún 
                                            programa y, que permiten realizar dicha creación/edición del material de
                                            manera muy sencilla.
                                            Muchas veces intercambiamos el término actividades educativas, por uno más
                                            amplio denominado “material didáctico multimedia”, pero a la postre, 
                                            lo que nos interesa es disponer de un abanico de herramientas que nos permitan 
                                            (en caso que no queramos reutilizar el numerosísimo material en cuanto 
                                            a actividades multimedia- que hay en la red).
                                            <p>Puedes acceder haciendo click <a href="http://www.xarxatic.com/edutuiteros/">aquí</a></p>
                                        </p>
                                </div>


                            </div>
                        </div>


                    </div></br>
                    <!-- --------------------INICIO SECCION 2------------------------- -->
                    <div id="section2">
                        <h1 style="text-align: center; color: #000000;">Herramientas  de apoyo para la creación de objetos de aprendizaje</h1>
                        <div class="container-fluid bg-3 text-center">    
                            <div class="row">
                                <div class="col-sm-6"> 
                                    <img src="../../images/mindMeister.png" class="img-responsive" style="width:100%; " alt="Image"></br></br>
                                        <p style="text-align: justify; color: #000000;">
                                            MindMeister es un software de desarrollo conjunto de mapas mentales en línea, 
                                            que es tanto versátil como fácil de usar. Estudiantes de todas las edades pueden
                                            utilizar MindMeister para estudiar de manera más eficiente, dar rienda suelta a
                                            su potencial creativo y avanzar en su desarrollo intelectual.</br>
                                            <p>Puedes acceder haciendo click <a href="https://www.mindmeister.com/es">aquí</a></p>
                                        </p>
                                </div>
                                <div class="col-sm-6"> 
                                    <img src="../../images/krut.gif"class="img-responsive" style="width:100%; " alt="Image"></br>
                                        <p style="text-align: justify; color: #000000;">
                                            Krut es otra aplicación que se suma a la larga 
                                            ista de posibles para realizar la grabación de
                                            una secuencia de acciones sobre nuestro escritorio.
                                            Al estar desarrollada en Java, se trata de una aplicación
                                            multiplataforma, la cual nos permitirá tanto el registro 
                                            de vídeos (formato mov) como de audio (formato wav). 
                                            Una solución más para realizar nuestros vídeo tutoriales.
                                            <p>Puedes acceder haciendo click <a href="http://krut.sourceforge.net/">aquí</a></p>
                                        </p>
                                </div> 
                                <div class="col-sm-6"> 
                                    <img src="../../images/cmaptools.jpg" class="img-responsive" style="width:70%; " alt="Image"></br>
                                        <p style="text-align: justify; color: #000000;">
                                            CmapTools es una herramienta gratuita que les permite a los usuarios navegar,
                                            compartir y debatir modelos representados como mapas conceptuales. 
                                            Se utilizó como herramienta de desarrollo de mapas conceptuales que 
                                            se usaron como organizadores y Representadores del conocimiento, que 
                                            facilitaban a los estudiantes identificar los conceptos claves a 
                                            comprender durante el desarrollo del curso.
                                            <p>Puedes acceder haciendo click <a href="https://cmap.ihmc.us/">aquí</a></p>
                                        </p>
                                </div>

                                <div class="col-sm-6"> 
                                    <img src="../../images/gimp.png" class="img-responsive" style="width:100%; " alt="Image"></br>
                                        <p style="text-align: justify; color: #000000;">
                                            GIMP (GNU Image Manipulation Program) es un programa de edición de imágenes 
                                            digitales en forma de mapa de bits, tanto dibujos como fotografías. Es un 
                                            programa libre y gratuito. Forma parte del proyecto GNU y está disponible
                                            bajo la Licencia pública general de GNU y GNU Lesser General Public License.</br></br>
                                            GIMP tiene herramientas que se utilizan para el retoque y edición de imágenes, 
                                            dibujo de formas libres, cambiar el tamaño, recortar, hacer fotomontajes, 
                                            convertir a diferentes formatos de imagen, y otras tareas más especializadas. 
                                            Se pueden también crear imágenes animadas en formato GIF e imágenes animadas en formato 
                                            MPEG usando un plugin de animación.
                                            <p>Puedes acceder haciendo click <a href="http://www.gimp.org.es/">aquí</a></p>
                                        </p>
                                </div>


                            </div>
                        </div>
                    </div></br>
                    <!-- --------------------INICIO SECCION 3------------------------- -->
                    <div id="section3">
                        <h1 style="text-align: center; color: #000000;">Herramientas usadas en el desarrollo del SGOA</h1>
                        <div class="container-fluid bg-3 text-center">    
                            <div class="row">
                                <div class="col-sm-6"> 
                                    <img src="../../images/Netbeans.png" class="img-responsive" style="width:100%; " alt="Image"></br>
                                        <p style="text-align: justify; color: #000000;">
                                            NetBeans es un entorno de desarrollo integrado libre, hecho principalmente para el 
                                            lenguaje de programación Java. Existe además un número importante de módulos 
                                            para extenderlo. NetBeans IDE2​ es un producto libre y gratuito sin restricciones de uso.
                                            NetBeans es un proyecto de código abierto de gran éxito con una gran base de
                                            usuarios, una comunidad en constante crecimiento, y con cerca de 100 
                                            socios en todo el mundo. </br></br>
                                            El NetBeans IDE soporta el desarrollo de todos los tipos de aplicación Java 
                                            (J2SE, web, EJB y aplicaciones móviles). Entre sus características se encuentra
                                            un sistema de proyectos basado en Ant, control de versiones y refactoring.
                                            <p>Puedes acceder haciendo click <a href="https://netbeans.org/">aquí</a></p>
                                        </p>
                                </div> 

                                <div class="col-sm-6"> 
                                    <img src="../../images/phpMysqlJsCss.png"  class="img-responsive" style="width:100%; " alt="Image"></br></br>
                                        <p style="text-align: justify; color: #000000;">
                                            HTML es un lenguaje de marcado para páginas web. Indica qué elementos componen cada página, y que contiene cada uno de esos elementos.</br></br>

                                            CSS es un lenguaje de presentación. Para cada uno de los elementos HTML de una página web, especifica que aspecto deben tener.</br></br>

                                            PHP es un lenguaje de programación de uso general. Entre otras utilidades, puede usarse para generar el código HTML de una página web a partir de ciertos parámetros de entrada.</br></br>

                                            MySQL es un motor de bases de datos. Almacena información de forma estructurada.</br></br>

                                            Javascript es otro lenguaje de programación que permite alterar dinámicamente el aspecto y funcionalidades de la página web una vez mostrada en el navegador 
                                            <p>Puedes acceder haciendo click <a href="https://www.w3schools.com/">aquí</a></p>
                                        </p>
                                </div>

                                <div class="col-sm-6"> 
                                    <img src="../../images/Mantis.jpg" class="img-responsive" style="width:100%; " alt="Image"></br>
                                        <p style="text-align: justify; color: #000000;">
                                            Mantis Bug Tracker es un software que constituye una solución completa para gestionar
                                            tareas en un equipo de trabajo. Es una aplicación OpenSource desarrollada en php y 
                                            mysql que destaca por su facilidad y flexibilidad para la instalación y configuración.

                                            Esta aplicación se utiliza para probar soluciones automatizadas, llevando un registro 
                                            histórico de las alteraciones y gestionando equipos de trabajo de forma remota.

                                            Esta aplicación permite la creación de diversas cuentas de usuario desde las cuales 
                                            se puede informar de los bugs detectados. Con Mantis se puede dividir un proyecto 
                                            en varias categorías, lo cual permite hacer un seguimiento más exacto de éste. 
                                            El flujo de trabajo también se puede configurar desde la propia herramienta, 
                                            de forma que puede definirse quién puede causar problemas, quién puede analizarlos y quién puede atenderlos.
                                            <p>Puedes acceder haciendo click <a href="https://www.mantisbt.org/">aquí</a></p>
                                        </p>
                                </div>

                                <div class="col-sm-6"> 
                                    <img src="../../images/GitHub.jpg" class="img-responsive" style="width:100%; " alt="Image"></br>
                                        <p style="text-align: justify; color: #000000;">
                                            GitHub es una forja (plataforma de desarrollo colaborativo) para alojar
                                            proyectos utilizando el sistema de control de versiones Git. Se la utiliza
                                            principalmente para la creación de código fuente de programas de computadora. 
                                            El software que opera GitHub fue escrito en Ruby on Rails. Desde enero de 2010, 
                                            GitHub opera bajo el nombre de GitHub, Inc. Anteriormente era conocida como
                                            Logical Awesome LLC. El código de los proyectos alojados en GitHub se almacena 
                                            típicamente de forma pública, aunque utilizando una cuenta de pago, también
                                            permite hospedar repositorios privados.
                                            <p>Puedes acceder haciendo click <a href="https://github.com/">aquí</a></p>
                                        </p>
                                </div>


                            </div>

                        </div>
                        </br>

                    </div>
                    </br>
                    <!-- --------------------INICIO SECCION 4------------------------- -->
                </div>
            </div>

            <!-- --------------------------------------------- -->

            <footer class="container-fluid text-center">
                <p>Diseño y programación: Elsa Vasco, Edison Tamayo, José Criollo</p>
            </footer>
            </script>
    </body>

</html>