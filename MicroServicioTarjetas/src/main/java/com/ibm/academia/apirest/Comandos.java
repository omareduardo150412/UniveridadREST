package com.ibm.academia.apirest;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.apirest.entities.Tarjeta;
import com.ibm.academia.apirest.enums.TipoTarjeta;
import com.ibm.academia.apirest.services.EdadDAO;
import com.ibm.academia.apirest.services.PasionDAO;
import com.ibm.academia.apirest.services.SalarioDAO;
import com.ibm.academia.apirest.services.TarjetaDAO;


@Component
public class Comandos implements CommandLineRunner 
{
	@Autowired
	private TarjetaDAO tarjetaDao;
	
	@Autowired
	private PasionDAO pasionDao;
	
	@Autowired
	private SalarioDAO salarioDao;
	
	@Autowired
	private EdadDAO edadDao;
	
	public void run(String... args) throws Exception 
	{
		
	Tarjeta tarjetaAmerica= new Tarjeta(null,TipoTarjeta.AMÉRICA_DEPORTEÍSMO);
	Tarjeta tarjetaApac= new Tarjeta(null,TipoTarjeta.APAC);
	Tarjeta tarjetaTeleton= new Tarjeta(null,TipoTarjeta.BANAMEX_TELETÓN);
	Tarjeta tarjetaBest= new Tarjeta(null,TipoTarjeta.BEST_BUY_BANAMEX);
	Tarjeta tarjeaBsmart= new Tarjeta(null,TipoTarjeta.BPLUSSMART);
	Tarjeta tarjetaCiti= new Tarjeta(null,TipoTarjeta.CITI_ADDVANTAGE);
	Tarjeta tarjetaClasica= new Tarjeta(null,TipoTarjeta.CLASICA);
	Tarjeta taretaCostco= new Tarjeta(null,TipoTarjeta.COSTCO);
	Tarjeta tarjetaVerde= new Tarjeta(null,TipoTarjeta.LA_VERDE_DEPORTEÍSMO);
	Tarjeta tarjetaMarti= new Tarjeta(null,TipoTarjeta.MARTÍ_CLASICA_CITIBANAMEX);
	Tarjeta tarjetaOffice= new Tarjeta(null,TipoTarjeta.OFFICE_DEPOT);
	Tarjeta tarjetaOro= new Tarjeta(null,TipoTarjeta.ORO);
	Tarjeta tarjetaPlatinum= new Tarjeta(null,TipoTarjeta.PLATINUM);
	Tarjeta tarjetaPumas= new Tarjeta(null,TipoTarjeta.PUMAS_DEPORTEÍSMO);
	Tarjeta tarjetaHome= new Tarjeta(null,TipoTarjeta.THE_HOME_DEPOT);
	Tarjeta tarjetaToluca= new Tarjeta(null,TipoTarjeta.TOLUCA_DEPORTEÍSMO);
	
	
	tarjetaDao.guardar(tarjetaAmerica);
	tarjetaDao.guardar(tarjetaApac);
	tarjetaDao.guardar(tarjetaBest);
	tarjetaDao.guardar(tarjetaCiti);
	tarjetaDao.guardar(tarjetaClasica);
	tarjetaDao.guardar(tarjetaHome);
	tarjetaDao.guardar(tarjetaMarti);
	tarjetaDao.guardar(tarjetaOffice);
	tarjetaDao.guardar(tarjetaOro);
	tarjetaDao.guardar(tarjetaPlatinum);
	tarjetaDao.guardar(tarjetaPumas);
	tarjetaDao.guardar(tarjetaTeleton);
	tarjetaDao.guardar(tarjetaToluca);
	tarjetaDao.guardar(tarjetaVerde);
	

	}
}