package mx.sep.poho.dao;

import java.util.Date;
import java.util.List;
import mx.sep.poho.modelo.Tsh82ConfigModeloContrato;
import mx.sep.poho.modelo.Tsh82ConfigModeloContratoExample;
import org.apache.ibatis.annotations.Param;

public interface Tsh82ConfigModeloContratoMapper {
    int countByExample(Tsh82ConfigModeloContratoExample example);

    int deleteByExample(Tsh82ConfigModeloContratoExample example);

    int deleteByPrimaryKey(@Param("annio") Short annio, @Param("vigInicio") Date vigInicio, @Param("vigFinal") Date vigFinal, @Param("cveUnidad") String cveUnidad);

    int insert(Tsh82ConfigModeloContrato record);

    int insertSelective(Tsh82ConfigModeloContrato record);

    List<Tsh82ConfigModeloContrato> selectByExample(Tsh82ConfigModeloContratoExample example);

    Tsh82ConfigModeloContrato selectByPrimaryKey(@Param("annio") Short annio, @Param("vigInicio") Date vigInicio, @Param("vigFinal") Date vigFinal, @Param("cveUnidad") String cveUnidad);

    int updateByExampleSelective(@Param("record") Tsh82ConfigModeloContrato record, @Param("example") Tsh82ConfigModeloContratoExample example);

    int updateByExample(@Param("record") Tsh82ConfigModeloContrato record, @Param("example") Tsh82ConfigModeloContratoExample example);

    int updateByPrimaryKeySelective(Tsh82ConfigModeloContrato record);

    int updateByPrimaryKey(Tsh82ConfigModeloContrato record);
}