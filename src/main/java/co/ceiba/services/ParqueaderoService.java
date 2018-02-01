package co.ceiba.services;



import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.ceiba.dominio.Parqueadero;
import co.ceiba.entity.ParqueaderoEntity;
import co.ceiba.repositorio.RepositorioParqueadero;

@RestController
@RequestMapping("/rest/parqueadero")
@EnableJpaRepositories("co.ceiba.repositorio")
public class ParqueaderoService {	
	private ModelMapper modelMapper = new ModelMapper();
	private ParqueaderoEntity parqueaderoEntity;
	@Autowired
	private RepositorioParqueadero repositorioParqueadero;
	
	
	@PostMapping ("/crear")
	public void crear(@RequestBody Parqueadero parqueadero) {
		parqueaderoEntity = modelMapper.map(parqueadero, ParqueaderoEntity.class);
		repositorioParqueadero.save(parqueaderoEntity);		
	}
	
	@RequestMapping("/consultar")
	public List<ParqueaderoEntity> consultar() {
		List<ParqueaderoEntity>parqueaderos = repositorioParqueadero.findAll();
		return parqueaderos;
	}
}
