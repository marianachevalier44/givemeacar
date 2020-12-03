package fr.car.car.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class IndexController {

    @GetMapping("cars/{id}")
    public ResponseEntity getCar(@PathVariable int id){
        return ResponseEntity.ok().body("vous avez demandé la voiture " + id);
    }

    @PostMapping("cars")
    public ResponseEntity postCar(){

        return ResponseEntity.ok().body("Vous avez créé une voiture");
    }

    @PutMapping("cars/{id}")
    public ResponseEntity putCar(@PathVariable int id){

        return ResponseEntity.ok().body("Vous avez mis à jour la voiture");
    }

    @DeleteMapping("cars/{id}")
    public ResponseEntity deleteCar(@PathVariable int id){

        return ResponseEntity.ok().body("Vous avez supprimé la voiture " + id);
    }
}
