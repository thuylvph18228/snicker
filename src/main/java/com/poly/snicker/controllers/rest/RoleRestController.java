package com.poly.snicker.controllers.rest;

import com.poly.snicker.models.Roles;
import com.poly.snicker.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin/role")
public class RoleRestController {

    @Autowired
    RoleService roleService;

    @GetMapping("/list_role")
    public ResponseEntity<Roles> list() {
        try {
            List<Roles> listRoles = roleService.findAll();
            System.out.println("ok");
            return new ResponseEntity<Roles>((Roles) listRoles, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("not ok");
            return new ResponseEntity<Roles>(HttpStatus.NOT_FOUND);
        }
    }

//    @PostMapping("/create_role")
//    public void create(@RequestBody Roles roles) {
//        roleService.saveAndFlush(roles);
//    }
//
//    @PutMapping("/update_roles/{id}")
//    public ResponseEntity<Roles> update(@RequestBody Roles roles, @PathVariable Long id) {
//        try {
//            Roles rolesEdit = roleService.getById(id);
//            roleService.saveAndFlush(roles);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/delete_role/{id}")
//    public void delete(@PathVariable Long id) {
//        Iterable<Roles> roles = (Iterable<Roles>) roleService.getById(id);
//        roleService.deleteAllInBatch(roles);
//    }
}

