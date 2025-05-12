package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        if (partRepository.count()==0) {

            OutsourcedPart wheels = new OutsourcedPart();
            wheels.setName("Wheels (4 Pack");
            wheels.setInv(5);
            wheels.setPrice(20.0);
            wheels.setMinInv(3);
            wheels.setMaxInv(10);
            outsourcedPartRepository.save(wheels);

            InhousePart bearings = new InhousePart();
            bearings.setName("Bearings (2 Pack)");
            bearings.setInv(5);
            bearings.setPrice(30.0);
            bearings.setMinInv(3);
            bearings.setMaxInv(10);
            inhousePartRepository.save(bearings);

            OutsourcedPart trucks  = new OutsourcedPart();
            trucks.setName("Trucks  (2 Pack)");
            trucks.setInv(5);
            trucks.setPrice(40.0);
            trucks.setMinInv(3);
            trucks.setMaxInv(10);
            outsourcedPartRepository.save(trucks);

            InhousePart deck  = new InhousePart();
            deck.setName("Deck");
            deck.setInv(5);
            deck.setPrice(50.0);
            deck.setMinInv(3);
            deck.setMaxInv(10);
            inhousePartRepository.save(deck);

            OutsourcedPart griptape = new OutsourcedPart();
            griptape.setName("Griptape");
            griptape.setInv(5);
            griptape.setPrice(10.0);
            griptape.setMinInv(3);
            griptape.setMaxInv(10);
            outsourcedPartRepository.save(griptape);

        }

        if (productRepository.count() == 0) {

            Product streetboard = new Product("Street Board", 100.0, 20);
            Product longboard = new Product("Long Board", 150.0, 10);
            Product cruiser = new Product("Cruiser", 125.0, 8);
            Product oldSchool = new Product("Old School Board", 110.0, 5);
            Product miniBoard = new Product("Mini Board", 75.0, 5);

            productRepository.save(streetboard);
            productRepository.save(longboard);
            productRepository.save(cruiser);
            productRepository.save(miniBoard);
            productRepository.save(oldSchool);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
