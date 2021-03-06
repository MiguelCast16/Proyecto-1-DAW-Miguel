package Model;

import java.sql.Date;

public class AsignanPracticas {
	
	String NIF_Alumno;
	String Num_Convenio;
	String NIF_Tutor;
	String NIF_TutorEmpresa;
	String Fecha_Inicio;
	String Fecha_Fin;
	int Horas_Dia;
	int Horas_Total;
	String  Horas_TardeInicio;
	String Horas_TardeFin;
	String Horas_MaņanaInicio;
	String Horas_MaņanaFin;
	
	public AsignanPracticas(String nIF_Alumno, String num_Convenio, String nIF_Tutor, String nIF_TutorEmpresa,
			String fecha_Inicio, String fecha_Fin, int horas_Dia, int horas_Total, String horas_TardeInicio,
			String horas_TardeFin, String horas_MaņanaInicio, String horas_MaņanaFin) {
		super();
		NIF_Alumno = nIF_Alumno;
		Num_Convenio = num_Convenio;
		NIF_Tutor = nIF_Tutor;
		NIF_TutorEmpresa = nIF_TutorEmpresa;
		Fecha_Inicio = fecha_Inicio;
		Fecha_Fin = fecha_Fin;
		Horas_Dia = horas_Dia;
		Horas_Total = horas_Total;
		Horas_TardeInicio = horas_TardeInicio;
		Horas_TardeFin = horas_TardeFin;
		Horas_MaņanaInicio = horas_MaņanaInicio;
		Horas_MaņanaFin = horas_MaņanaFin;
	}

	public String getNIF_Alumno() {
		return NIF_Alumno;
	}

	public void setNIF_Alumno(String nIF_Alumno) {
		NIF_Alumno = nIF_Alumno;
	}

	public String getNum_Convenio() {
		return Num_Convenio;
	}

	public void setNum_Convenio(String num_Convenio) {
		Num_Convenio = num_Convenio;
	}

	public String getNIF_Tutor() {
		return NIF_Tutor;
	}

	public void setNIF_Tutor(String nIF_Tutor) {
		NIF_Tutor = nIF_Tutor;
	}

	public String getNIF_TutorEmpresa() {
		return NIF_TutorEmpresa;
	}

	public void setNIF_TutorEmpresa(String nIF_TutorEmpresa) {
		NIF_TutorEmpresa = nIF_TutorEmpresa;
	}

	public String getFecha_Inicio() {
		return Fecha_Inicio;
	}

	public void setFecha_Inicio(String fecha_Inicio) {
		Fecha_Inicio = fecha_Inicio;
	}

	public String getFecha_Fin() {
		return Fecha_Fin;
	}

	public void setFecha_Fin(String fecha_Fin) {
		Fecha_Fin = fecha_Fin;
	}

	public int getHoras_Dia() {
		return Horas_Dia;
	}

	public void setHoras_Dia(int horas_Dia) {
		Horas_Dia = horas_Dia;
	}

	public int getHoras_Total() {
		return Horas_Total;
	}

	public void setHoras_Total(int horas_Total) {
		Horas_Total = horas_Total;
	}

	public String getHoras_TardeInicio() {
		return Horas_TardeInicio;
	}

	public void setHoras_TardeInicio(String horas_TardeInicio) {
		Horas_TardeInicio = horas_TardeInicio;
	}

	public String getHoras_TardeFin() {
		return Horas_TardeFin;
	}

	public void setHoras_TardeFin(String horas_TardeFin) {
		Horas_TardeFin = horas_TardeFin;
	}

	public String getHoras_MaņanaInicio() {
		return Horas_MaņanaInicio;
	}

	public void setHoras_MaņanaInicio(String horas_MaņanaInicio) {
		Horas_MaņanaInicio = horas_MaņanaInicio;
	}

	public String getHoras_MaņanaFin() {
		return Horas_MaņanaFin;
	}

	public void setHoras_MaņanaFin(String horas_MaņanaFin) {
		Horas_MaņanaFin = horas_MaņanaFin;
	}
	
	
	
	
}
	
	