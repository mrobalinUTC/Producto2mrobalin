package models;
import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Comida extends Model {
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;
    @Constraints.Required
    public String precio;
    @Constraints.Required
    public String ingrediente;
   
    
    public static Find<Long,Comida> find = new Find<Long,Comida>(){};
	public static <find> List<Comida> listadoComidas() {
		// TODO Auto-generated method stub
		return find.all();
	}

}
