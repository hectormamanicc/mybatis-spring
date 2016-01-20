/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybatis.mapper;
import domain.Paises;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
/**
 *
 * @author Hector Mamani CC
 */
public interface PaisesMapper {
@Select("SELECT idcat,nombre FROM categoria")
List<Paises> query();

@Select("SELECT idcat,nombre FROM categoria WHERE idcat=#{idcat}")
Paises get(@Param("idcat") Integer idcat);

@Insert("INSERT INTO categoria(nombre) VALUES(#{nombre})")
int insert(Paises nombre);

@Update("UPDATE categoria SET nombre=#{nombre} WHERE  idcat=#{idcat}")
int update(Paises nombre);

@Update("DELETE FROM categoria WHERE idcat=#{idcat}")
int delete(@Param("idcat") Integer idcat);
}

