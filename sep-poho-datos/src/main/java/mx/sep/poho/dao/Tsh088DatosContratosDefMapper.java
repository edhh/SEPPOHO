package mx.sep.poho.dao;

import java.util.List;
import mx.sep.poho.modelo.Tsh088DatosContratosDef;
import mx.sep.poho.modelo.Tsh088DatosContratosDefExample;
import org.apache.ibatis.annotations.Param;

public interface Tsh088DatosContratosDefMapper {
    int countByExample(Tsh088DatosContratosDefExample example);

    int deleteByExample(Tsh088DatosContratosDefExample example);

    int deleteByPrimaryKey(@Param("annio") Short annio, @Param("nuTramite") Integer nuTramite);

    int insert(Tsh088DatosContratosDef record);

    int insertSelective(Tsh088DatosContratosDef record);

    List<Tsh088DatosContratosDef> selectByExample(Tsh088DatosContratosDefExample example);

    Tsh088DatosContratosDef selectByPrimaryKey(@Param("annio") Short annio, @Param("nuTramite") Integer nuTramite);

    int updateByExampleSelective(@Param("record") Tsh088DatosContratosDef record, @Param("example") Tsh088DatosContratosDefExample example);

    int updateByExample(@Param("record") Tsh088DatosContratosDef record, @Param("example") Tsh088DatosContratosDefExample example);

    int updateByPrimaryKeySelective(Tsh088DatosContratosDef record);

    int updateByPrimaryKey(Tsh088DatosContratosDef record);
}