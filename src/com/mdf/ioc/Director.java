package com.mdf.ioc;

public class Director implements IEmpleado {

	private ICreacionInforme informeNuevo;

	public Director(ICreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Mi tarea principal es supervisar la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return this.informeNuevo.getInforme();
	}

}
