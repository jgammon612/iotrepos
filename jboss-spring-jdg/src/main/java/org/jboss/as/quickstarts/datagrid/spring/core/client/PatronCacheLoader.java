package org.jboss.as.quickstarts.datagrid.spring.core.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.brinker.example.BrinkerPatron;

public class PatronCacheLoader {
	
	public List<BrinkerPatron> loadCache() {
    	List<BrinkerPatron> patrons = new ArrayList<BrinkerPatron>();
    	
      	patrons.add(new BrinkerPatron("50744712", "4694467027", "viannedgarcia@yahoo.com", 
    			                       36, 
    			                       false, 
    			                       "08/31/2016 08:11:24",
    			                       "08/29/2016 15:11:34",
    			                       "50744712"));
    	
    	
    	patrons.add(new BrinkerPatron("46858443", "3475021750", "wazd198@yahoo.com", 
                0, 
                false, 
                "11/09/2015 09:01:43",
                "11/07/2015 20:30:13",
                "46858443"));
    	patrons.add(new BrinkerPatron("48793862", "9564594546", "soccermomof4@live.com", 
                142, 
                true, 
                "02/23/2017 15:11:18",
                "06/23/2017 04:50:10",
                "48793862"));
    	patrons.add(new BrinkerPatron("45238689", "6615298447", "ember216@ymail.com", 
                126, 
                false, 
                "08/15/2016 08:12:21",
                "08/13/2016 14:09:58",
                "45238689"));
    	patrons.add(new BrinkerPatron("52143394", "2145974949", "tranequea@gmail.com", 
                25, 
                false, 
                "11/15/2016 09:08:32",
                "11/15/2016 09:08:32",
                "52143394"));
    	 
    
    	return patrons;
    	
    }
  }

