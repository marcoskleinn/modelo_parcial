
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Vtv {

	
	boolean motor;
	boolean frenos;
	boolean sistemaSuspension;
	LocalDate fecha;
	
	
	public Vtv(boolean motor, boolean frenos, boolean sistemaSuspension, LocalDate fecha) {
		this.motor = motor;
		this.frenos = frenos;
		this.sistemaSuspension = sistemaSuspension;
		this.fecha = fecha;
	}


	public boolean isMotor() {
		return motor;
	}


	public void setMotor(boolean motor) {
		this.motor = motor;
	}


	public boolean isFrenos() {
		return frenos;
	}


	public void setFrenos(boolean frenos) {
		this.frenos = frenos;
	}


	public boolean isSistemaSuspension() {
		return sistemaSuspension;
	}


	public void setSistemaSuspension(boolean sistemaSuspension) {
		this.sistemaSuspension = sistemaSuspension;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	public boolean validarVtv(boolean motor, boolean frenos, boolean sistemaSuspension) {
		
		
		if (this.frenos == false || this.motor == false || this.sistemaSuspension == false ) {
			
			JOptionPane.showMessageDialog(null, "Hay que realizar cambios");
			
			
			this.frenos = true;
			this.motor = true;
			this.sistemaSuspension = true;
				
			JOptionPane.showMessageDialog(null, "El motor, frenos y el sistema de suspension ahora andan bien y la nueva de la vtv sera el " +  fecha.getYear());	
			
			
		} else {
			JOptionPane.showMessageDialog(null, "Esta todo correcto");
		}
		return true;
		
		
	}
	
}


	
	

