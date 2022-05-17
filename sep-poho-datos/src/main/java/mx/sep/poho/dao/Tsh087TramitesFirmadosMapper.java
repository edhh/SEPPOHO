package mx.sep.poho.dao;

import java.util.List;
import mx.sep.poho.modelo.Tsh087TramitesFirmados;
import mx.sep.poho.modelo.Tsh087TramitesFirmadosExample;
import org.apache.ibatis.annotations.Param;

public interface Tsh087TramitesFirmadosMapper {
    int countByExample(Tsh087TramitesFirmadosExample example);

    int deleteByExample(Tsh087TramitesFirmadosExample example);

    int deleteByPrimaryKey(@Param("annio") Short annio, @Param("nuTramite") Integer nuTramite);

    int insert(Tsh087TramitesFirmados record);

    int insertSelective(Tsh087TramitesFirmados record);

    List<Tsh087TramitesFirmados> selectByExample(Tsh087TramitesFirmadosExample example);

    Tsh087TramitesFirmados selectByPrimaryKey(@Param("annio") Short annio, @Param("nuTramite") Integer nuTramite);

    int updateByExampleSelective(@Param("record") Tsh087TramitesFirmados record, @Param("example") Tsh087TramitesFirmadosExample example);

    int updateByExample(@Param("record") Tsh087TramitesFirmados record, @Param("example") Tsh087TramitesFirmadosExample example);

    int updateByPrimaryKeySelective(Tsh087TramitesFirmados record);

    int updateByPrimaryKey(Tsh087TramitesFirmados record);
}