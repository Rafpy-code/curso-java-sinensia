
package com.sinensia.becariosController;

			import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.SpringApplication;
			import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.ModelAndView;

import com.sinensia.becario.BacarionApplication;

			@Autowired
			public class Becario {
			
				@Entity
				@Table(name="BECARIO")
				public class Alumno {

					@Id
					private String dni= ("482482482L");	
					private String nombre =("jUAN") ;
					private String apellido1 = ("lOPEZ" );
					private String apellido2 = ("ARCADI" );
                    private int calificacion = ("10" ) ;
					
					public Becario () {
				public static void main(String[] args) {
					SpringApplication.run(becariosController.class, args);
		        	
						@GetMapping("//becario/")
                 public ModelAndView getListbecarios () {
			      ModelAndView mav= new ModelAndView ("becarios");
			      mav.addObject("becarios,becarios Repository.finf All());"
		       	return mav
			
		       			public Becario() {
		    		
		    	}

		    	public String getDni( ) {
		    		return dni;
		    	}

		    	public void setDni(String dni) {
		    		this.dni = dni;
		    	}

		    	public String getNombre() {
		    		return nombre;
		    	}

		    	public void setNombre(String nombre) {
		    		this.nombre = nombre;
		    	}

		    	public String getApellido1() {
		    		return apellido1;
		    	}

		    	public void setApellido1(String apellido1) {
		    		this.apellido1 = apellido1;
		    	}

		    	public String getApellido2() {
		    		return apellido2;
		    	}

		    	public void setApellido2(String apellido2) {
		    		this.apellido2 = apellido2;
		    	}

		    	public int getCalificacion() {
		    		return calificacion;
		    	}

		    	public void setCalificacion(int calificacion) {
		    		this.calificacion = calificacion;
		    	}

		    	@Override
		    	public String toString() {
		    		return "becario [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
		    				+ ", calificacion=" + calificacion + "]";
		    	}
		    	
		    }
		{