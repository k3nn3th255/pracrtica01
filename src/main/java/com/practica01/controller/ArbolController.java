
package com.practica01.controller;

import com.practica01.domain.Arbol;
import com.practica01.service.ArbolService;
import com.practica01.service.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/arbol")
public class ArbolController {

    @Autowired
    private ArbolService arbolService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = arbolService.getArbols(false);

        model.addAttribute("arbols", lista);
        model.addAttribute("total arbols ", lista.size());
        return "/Arbol/listado";
    }

    @Autowired
    private FirebaseStorageService firebaseStorageService;

    @PostMapping("/guardar")
    public String guardar(Arbol arbol,
            @RequestParam("imagenFile") MultipartFile imagenFile) {

        if (!imagenFile.isEmpty()) {
            arbolService.save(arbol);
            firebaseStorageService.cargaImagen(imagenFile, "arbol", arbol.getIdArbol());
        }
        arbolService.save(arbol);

        return "redirect:/arbol/listado";
    }

    @GetMapping("/modificar/{idArbol}")
    public String modifica(Arbol arbol,
            Model model) {
        arbol=arbolService.getArbol(arbol);
        model.addAttribute("arbol",arbol);
        return "Arbol/modifica";
    }
    @GetMapping("/eliminar/{idArbol}")
    public String elimina(Arbol arbol) {
        arbolService.delete(arbol);
        
        return"redirect:/arbol/listado";
    }
}
