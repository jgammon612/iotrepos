package org.jboss.as.quickstarts.datagrid.spring.core.client;

import java.util.List;

import org.infinispan.AdvancedCache;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

import com.brinker.example.BrinkerPatron;

public class PatronCache {
	
	
	 private Cache cache;
	 private AdvancedCache<String, BrinkerPatron> nativeCache;

	    public PatronCache(CacheManager cacheManager) {
	        this.cache = cacheManager.getCache("patrons");
	        this.nativeCache = (AdvancedCache<String, BrinkerPatron>) cache.getNativeCache();
	        this.preLoadCache();
	    }

	    public void clearCache() {
	        cache.clear();
	    }

	    public BrinkerPatron getCachedPatron(String key) {
	        return (BrinkerPatron) nativeCache.get(key);
	        
	    }
	    private void preLoadCache() {
	    	PatronCacheLoader pcl = new PatronCacheLoader();
	    	List<BrinkerPatron> patronsList = pcl.loadCache();
	    	for (int i = 0; i < patronsList.size(); ++i) { 
	    		nativeCache.put(patronsList.get(i).getPhoneNumber(), patronsList.get(i));
	    	}
	    }

}
