package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.client.Foo;
import com.mycompany.myapp.client.FooClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * Created on 28.09.16.
 *
 * @author David Steiman, K-TEL Communications GmbH
 */
@RestController
@RequestMapping("/api/clients")
public class FeignClientController {

    @Inject
    private FooClient fooClient;

    @GetMapping("/foo")
    public ResponseEntity<List<Foo>> getFooFromClient() {
        return ResponseEntity.ok(fooClient.getFooEntities());
    }
}
