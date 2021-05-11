package com.tangerine.mvc.controller;

import com.tangerine.mvc.model.Proyecto;
import com.tangerine.mvc.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Controller
@RequestMapping("/proyectos")
public class ProyectoController {

    @Autowired
    ProyectoService proyectoService;

    private static final Logger log = LoggerFactory.getLogger(ProyectoController.class);

    @GetMapping("")
    public String getAllProyectos() {
        List<Proyecto> proyectos = proyectoService.getProyectos();
        proyectos.forEach(proyecto -> System.out.println(proyecto));
        return "home";
    }

    // Add proyecto
    @PostMapping("/addProyecto")
    public String addProyecto(Proyecto proyecto) {
        return "proyectos";
    }

    //editar proyecto
    @GetMapping("/edit")
    public String editUser() {
        return "";
    }

    //borra proyecto
    @GetMapping("/delete")
    public String deleteUser(@RequestParam("id") int id) {
        //TO_BE_CHANGED.deleteById(id);
        return "UserList";
    }

    //guardar proyecto
    @PostMapping("/save")
    public String saveUser() {
        return "";
    }
}
