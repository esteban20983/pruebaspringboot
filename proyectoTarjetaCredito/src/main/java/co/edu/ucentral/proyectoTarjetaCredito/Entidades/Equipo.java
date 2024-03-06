package co.edu.ucentral.proyectoTarjetaCredito.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.PrimitiveIterator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "equipos")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EQUIPOS")
    @SequenceGenerator(name = "SEQ_EQUIPOS", sequenceName = "SEQ_EQUIPOS", allocationSize = 1)
    @Column(name = "EQU_CODIGO", nullable = false)
    private long serial;
    @Column(name = "EQU_NOMBRE")
    private  String Nombre;
    @Column(name = "EQU_DESCRIPCION")
    private String Descirpcion;


}
