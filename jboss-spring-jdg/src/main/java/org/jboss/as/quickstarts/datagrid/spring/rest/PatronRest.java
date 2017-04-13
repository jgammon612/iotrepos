package org.jboss.as.quickstarts.datagrid.spring.rest;

import java.lang.invoke.MethodHandles;

import org.jboss.as.quickstarts.datagrid.spring.core.client.PatronCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.brinker.example.BrinkerPatron;

@RequestMapping("cache")
public class PatronRest {

	    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	    private final PatronCache patronCache;

	    public PatronRest(PatronCache patronCache) {
	        this.patronCache = patronCache;
	    }

	    @RequestMapping(method = RequestMethod.GET, value = "/patron")
	    public @ResponseBody
	    BrinkerPatron getValueFromCache(@RequestParam("key") String key) {
	        return patronCache.getCachedPatron(key);
	    }

}
