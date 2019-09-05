package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.Package;
import tws.repository.PackageMapper;

import java.util.UUID;

@Service
public class PackageService {
    @Autowired
    private PackageMapper packageMapper;

    public void addPackage(Package pack){
        String id = UUID.randomUUID().toString();
        pack.setId(id);
        packageMapper.insert(pack);
    }
}
