package com.mycompany.myapp.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created on 28.09.16.
 *
 * @author David Steiman, K-TEL Communications GmbH
 */
@AuthorizedFeignClient(name = "foo")
public interface FooClient {
    @RequestMapping(value = "/api/foos", method = RequestMethod.GET)
    List<Foo> getFooEntities();
}
