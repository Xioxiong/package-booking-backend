package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.service.PackageService;
import tws.entity.Package;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/packages")
public class PackageController {

    @Autowired
    private PackageService packageService;

    @CrossOrigin
    @PostMapping("")
    public ResponseEntity<Package> insert(@RequestBody Package pack) {
        packageService.addPackage(pack);
        return ResponseEntity.created(URI.create("/packages/" + pack.getId())).body(pack);
    }
    @CrossOrigin
    @GetMapping("")
    public ResponseEntity<List<Package>> getAll() {
        return ResponseEntity.ok(packageService.getPackages());
    }
}
