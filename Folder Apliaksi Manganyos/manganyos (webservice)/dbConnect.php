<?php

	//Defining Constants
	define('HOST','localhost');
	define('USER','itsf4394_admin_manganyos');
	define('PASS','akukamudia123');
	define('DB','itsf4394_manganyos');

	//Connecting to Database
    $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Reach our Servers!');
    mysqli_set_charset($con, 'utf8');
