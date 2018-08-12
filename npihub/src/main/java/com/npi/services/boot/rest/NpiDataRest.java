package com.npi.services.boot.rest;

import java.util.List;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.npi.dao.NpiDao;
import com.npi.pojo.NpiData;

@Named
@Path("/npi")
public class NpiDataRest {

	@GET
	@Path("getNpiList")
	@Produces(MediaType.APPLICATION_JSON)
	@CrossOrigin
	public List<NpiData> getNpiList(@QueryParam("q") String name, @QueryParam("i") int startIndex,
			@QueryParam("r") int maxRecords) {

		System.out.println("NpiDataRest.getNpiList - Started");
		System.out.println("NpiDataRest.getNpiList - q - " + name);
		NpiDao npiDao = new NpiDao();
		List<NpiData> npiList = npiDao.getNpiByName(name, startIndex, maxRecords);
		
		System.out.println("NpiDataRest.getNpiList - Ended");
		return npiList;
	}

	@GET
	@Path("getNpiInfo")
	@Produces(MediaType.APPLICATION_JSON)
	@CrossOrigin
	public NpiData getNpiInfo(@QueryParam("nid") String nid) {
		System.out.println("NpiDataRest.getNpiInfo - Started");
		NpiDao npiDao = new NpiDao();
		NpiData npi = npiDao.getNpiData(nid);
		System.out.println("NpiDataRest.getNpiInfo - Ended");
		return npi;
	}
}
