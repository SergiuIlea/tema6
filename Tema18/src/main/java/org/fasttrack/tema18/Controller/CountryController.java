package org.fasttrack.tema18.Controller;

import org.fasttrack.tema18.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    private CountryService service;

    @Autowired
    public CountryController(CountryService service) {
        this.service = service;
    }
}
