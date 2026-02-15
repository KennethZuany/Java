package Semana5.Actividad4;

// Main
public class SistemaControlEscolar {
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                 SISTEMA DE CONTROL ESCOLAR                 ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");
        
        // Crear Materias
        System.out.println("─".repeat(60));
        System.out.println("PASO 1: Creando Materias");
        System.out.println("─".repeat(60));
        
        Materia matematicas = new Materia("Matemáticas Avanzadas", "MAT301", 8, 5);
        Materia fisica = new Materia("Física II", "FIS202", 7, 4);
        Materia quimica = new Materia("Química Orgánica", "QUI203", 6, 4);
        Materia programacion = new Materia("Programación Orientada a Objetos", "POO401", 10, 6);
        Materia baseDatos = new Materia("Base de Datos", "BD301", 8, 5);
        Materia redes = new Materia("Redes de Computadoras", "RED202", 7, 4);
        
        System.out.println("─".repeat(60));
        System.out.println("    6 materias creadas");
        System.out.println("─".repeat(60));
        
        // Crear cursos
        System.out.println("─".repeat(60));
        System.out.println("PASO 2: Creando Cursos (Composición)");
        System.out.println("─".repeat(60));
        
        Curso cursoIngenieria = new Curso("Ingeniería 3er Semestre", matematicas, fisica, quimica);
        Curso cursoInformatica = new Curso("Informática 4to Semestre", programacion, baseDatos, redes);
        
        System.out.println("─".repeat(60));
        System.out.println("    Curso 1: " + cursoIngenieria.getNombre());
        System.out.println("    Créditos totales: " + cursoIngenieria.calcularCreditosTotales());
        System.out.println("    Curso 2: " + cursoInformatica.getNombre());
        System.out.println("     Créditos totales: " + cursoInformatica.calcularCreditosTotales());
        System.out.println("─".repeat(60));
        
        // Crear profesores
        System.out.println("─".repeat(60));
        System.out.println("PASO 3: Creando Profesores (Agregación)");
        System.out.println("─".repeat(60));
        
        Profesor prof1 = new Profesor("Dr. Juan Pérez", "P1001", 250.0, matematicas);
        Profesor prof2 = new Profesor("Dra. María López", "P1002", 280.0, programacion);
        Profesor prof3 = new Profesor("M.C. Carlos Ramírez", "P1003", 300.0, baseDatos);
        
        System.out.println("─".repeat(60));
        System.out.println("    Profesor 1: " + prof1.getNombre());
        System.out.println("    Materia: " + prof1.getMateriaImpartida().getNombre());
        System.out.println("    Sueldo semanal: $" + prof1.calcularSueldoSemanal());
        System.out.println();
        System.out.println("    Profesor 2: " + prof2.getNombre());
        System.out.println("    Materia: " + prof2.getMateriaImpartida().getNombre());
        System.out.println("    Sueldo semanal: $" + prof2.calcularSueldoSemanal());
        System.out.println();
        System.out.println("    Profesor 3: " + prof3.getNombre());
        System.out.println("    Materia: " + prof3.getMateriaImpartida().getNombre());
        System.out.println("    Sueldo semanal: $" + prof3.calcularSueldoSemanal());
        System.out.println("─".repeat(60));

        
        // Crear Alumnos
        System.out.println("─".repeat(60));
        System.out.println("PASO 4: Creando Alumnos (Agregación)");
        System.out.println("─".repeat(60));
        
        Alumno alumno1 = new Alumno("2024001", "Pedro Martínez", 20, cursoIngenieria);
        Alumno alumno2 = new Alumno("2024002", "Laura González", 19, cursoInformatica);
        Alumno alumno3 = new Alumno("2024003", "Miguel Fernández", 21, cursoIngenieria);
        Alumno alumno4 = new Alumno("2024004", "Sofía Ramírez", 18, cursoInformatica);
        
        System.out.println("─".repeat(60));
        System.out.println("    Alumno 1: " + alumno1.getNombre());
        System.out.println("    Curso: " + alumno1.getCurso().getNombre());
        System.out.println("    Carga académica: " + alumno1.obtenerCargaAcademica() + " créditos");
        System.out.println();
        System.out.println("    Alumno 2: " + alumno2.getNombre());
        System.out.println("    Curso: " + alumno2.getCurso().getNombre());
        System.out.println("    Carga académica: " + alumno2.obtenerCargaAcademica() + " créditos");
        System.out.println();
        System.out.println("    Alumno 3: " + alumno3.getNombre());
        System.out.println("    Curso: " + alumno3.getCurso().getNombre());
        System.out.println("    Carga académica: " + alumno3.obtenerCargaAcademica() + " créditos");
        System.out.println();
        System.out.println("    Alumno 4: " + alumno4.getNombre());
        System.out.println("    Curso: " + alumno4.getCurso().getNombre());
        System.out.println("    Carga académica: " + alumno4.obtenerCargaAcademica() + " créditos");
        System.out.println("─".repeat(60));
        
        // Mostrar Información
        System.out.println("─".repeat(60));
        System.out.println("PASO 5: Información Detallada");
        System.out.println("─".repeat(60));
        
        System.out.println("─".repeat(60));
        System.out.println("    CURSO: " + cursoInformatica.getNombre());
        System.out.println(cursoInformatica);
        System.out.println();
        System.out.println("        ALUMNO COMPLETO:");
        System.out.println(alumno2);
        System.out.println();
        System.out.println("        PROFESOR COMPLETO:");
        System.out.println(prof2);
        System.out.println("─".repeat(60));
        
        // Demostrar Copia
        System.out.println("─".repeat(60));
        System.out.println("PASO 6: Demostrando Constructores de Copia");
        System.out.println("─".repeat(60));
        
        // Constructor de copia de Materia
        System.out.println("─".repeat(60));
        Materia copiaMateria = new Materia(programacion);
        System.out.println("    Copia de materia creada: " + copiaMateria.getNombre());
        System.out.println("─".repeat(60));

        // Constructor de copia de Curso (Composición)
        System.out.println("─".repeat(60));
        Curso copiaCurso = new Curso(cursoInformatica);
        copiaCurso.setNombre("Informática 4to Semestre - Grupo B");
        System.out.println("    Copia de curso creada: " + copiaCurso.getNombre());
        
        // Constructor de copia de Profesor (Agregación)
        System.out.println("─".repeat(60));
        Profesor copiaProfesor = new Profesor(prof2);
        copiaProfesor.setNombre("Dr. Roberto García (Suplente)");
        System.out.println("    Copia de profesor creada: " + copiaProfesor.getNombre());
        System.out.println("    Materia compartida: " + copiaProfesor.getMateriaImpartida().getNombre());
        
        // Constructor de copia de Alumno (Agregación)
        System.out.println("─".repeat(60));
        Alumno copiaAlumno = new Alumno(alumno2);
        copiaAlumno.setMatricula("2024005");
        copiaAlumno.setNombre("Ana Torres");
        System.out.println("    Copia de alumno creada: " + copiaAlumno.getNombre());
        System.out.println("    Curso compartido: " + copiaAlumno.getCurso().getNombre());
        System.out.println("─".repeat(60));
        
        // Resumen
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                    RESUMEN DEL SISTEMA                     ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.println("    Materias creadas: 6");
        System.out.println("    Cursos creados: 3 (1 original + 1 original + 1 copia)");
        System.out.println("    Profesores registrados: 4 (3 originales + 1 copia)");
        System.out.println("    Alumnos inscritos: 5 (4 originales + 1 copia)");
        System.out.println("        Relaciones demostradas:");
        System.out.println("        Composición: Curso -> 3 Materias");
        System.out.println("        Agregación: Profesor -> Materia");
        System.out.println("        Agregación: Alumno -> Curso");
        System.out.println("    Constructores demostrados:");
        System.out.println("        Constructor por defecto");
        System.out.println("        Constructor con parámetros");
        System.out.println("        Constructor de copia");
        System.out.println("    ¡Sistema funcionando correctamente!");
        System.out.println("════════════════════════════════════════════════════════════════\n");
    }
}