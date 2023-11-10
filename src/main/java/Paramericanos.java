import java.util.ArrayList;
import java.util.Date;

class Atleta {
    String nombre;
    String pais;
    int edad;
    ArrayList<Disciplina> disciplinas;

    public Atleta(String nombre, String pais, int edad) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.disciplinas = new ArrayList<>();
    }

    public void agregarDisciplina(Disciplina disciplina) {
        if (!this.disciplinas.contains(disciplina)) {
            this.disciplinas.add(disciplina);
        }
    }

    public void eliminarDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }

    public String mostrarInformacion() {
        return "Nombre: " + this.nombre + ", Pais: " + this.pais + ", Edad: " + this.edad;
    }
}

class Disciplina {
    String nombre;
    int numParticipantes;
    String recordMundial;

    public Disciplina(String nombre, int numParticipantes, String recordMundial) {
        this.nombre = nombre;
        this.numParticipantes = numParticipantes;
        this.recordMundial = recordMundial;
    }

    public String mostrarInformacion() {
        return "Nombre: " + this.nombre + ", Numero de Participantes: " + this.numParticipantes + ", Record Mundial: " + this.recordMundial;
    }
}

class Equipo {
    String nombre;
    ArrayList<Atleta> atletas;
    Disciplina disciplina;

    public Equipo(String nombre, Disciplina disciplina) {
        this.nombre = nombre;
        this.atletas = new ArrayList<>();
        this.disciplina = disciplina;
    }

    public void agregarAtleta(Atleta atleta) {
        if (!this.atletas.contains(atleta)) {
            this.atletas.add(atleta);
        }
    }

    public void eliminarAtleta(Atleta atleta) {
        this.atletas.remove(atleta);
    }

    public String mostrarInformacion() {
        return "Nombre: " + this.nombre + ", Disciplina: " + this.disciplina.nombre;
    }
}

class Evento {
    Disciplina disciplina;
    ArrayList<Equipo> equipos;
    Date fecha;

    public Evento(Disciplina disciplina, Date fecha) {
        this.disciplina = disciplina;
        this.equipos = new ArrayList<>();
        this.fecha = fecha;
    }

    public void agregarEquipo(Equipo equipo) {
        if (!this.equipos.contains(equipo)) {
            this.equipos.add(equipo);
        }
    }

    public void eliminarEquipo(Equipo equipo) {
        this.equipos.remove(equipo);
    }

    public String mostrarInformacion() {
        return "Disciplina: " + this.disciplina.nombre + ", Fecha: " + this.fecha;
    }
}

class JuegosPanamericanos {
    ArrayList<Atleta> atletas;
    ArrayList<Disciplina> disciplinas;
    ArrayList<Equipo> equipos;
    ArrayList<Evento> eventos;

    public JuegosPanamericanos() {
        this.atletas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void agregarAtleta(Atleta atleta) {
        if (!this.atletas.contains(atleta)) {
            this.atletas.add(atleta);
        }
    }

    public void agregarDisciplina(Disciplina disciplina) {
        if (!this.disciplinas.contains(disciplina)) {
            this.disciplinas.add(disciplina);
        }
    }

    public void agregarEquipo(Equipo equipo) {
        if (!this.equipos.contains(equipo)) {
            this.equipos.add(equipo);
        }
    }

    public void agregarEvento(Evento evento) {
        if (!this.eventos.contains(evento)) {
            this.eventos.add(evento);
        }
    }

    // Otros métodos según sea necesario
}

