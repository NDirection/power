package api.controol;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dto.Library;


//@RequestMapping("/appointments")
@RestController
public class Company {

    public Company() {

        System.out.println("dddd================");

    }


    @RequestMapping(value="/new", method = RequestMethod.GET)
    public Library getNewForm() {

        System.out.println("222x");

        Library library = new Library();
        library.setAge(233);

        return library;




    }

    @RequestMapping(value="/new2", method = RequestMethod.GET)
    public ResponseEntity<String> responseEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("header1", "heaer1-value");
        HttpStatus status = HttpStatus.NOT_FOUND;
        return new ResponseEntity<>("text content222222222222", headers, status);
    }







}
