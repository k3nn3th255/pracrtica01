
package com.practica01.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "practica01-a74c0.appspot.com";

    //Esta es la ruta básica de este proyecto practica01
    final String rutaSuperiorStorage = "Practica01";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "practica01-a74c0-firebase-adminsdk-9ody0-208721648b.Json";
}
