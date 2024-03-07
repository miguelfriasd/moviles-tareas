package frias.miguel.lista_tareas

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
@Dao
interface TareaDAO {

    @Query("SELECT * FROM tareas")
    fun obtenerTareas(): List<Tarea>

    @Delete
    fun eliminarTarea(tarea: Tarea)

    @Query("SELECT * from tareas where `desc` = :descripcion")
    fun getTarea (descripcion: String): Tarea

    @Insert
    fun agregarTarea(tarea: Tarea)
}