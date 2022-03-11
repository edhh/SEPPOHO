package mx.sep.poho.dao;

import java.util.List;
import mx.sep.poho.modelo.Tsh003Tramite;
import mx.sep.poho.modelo.Tsh003TramiteExample;
import org.apache.ibatis.annotations.Param;

public interface Tsh003TramiteMapper {
    int countByExample(Tsh003TramiteExample example);

    int deleteByExample(Tsh003TramiteExample example);

    int deleteByPrimaryKey(@Param("annio") Short annio, @Param("nuTramite") Integer nuTramite, @Param("cveConsecTram") Short cveConsecTram);

    int insert(Tsh003Tramite record);

    int insertSelective(Tsh003Tramite record);

    List<Tsh003Tramite> selectByExample(Tsh003TramiteExample example);

    Tsh003Tramite selectByPrimaryKey(@Param("annio") Short annio, @Param("nuTramite") Integer nuTramite, @Param("cveConsecTram") Short cveConsecTram);

    int updateByExampleSelective(@Param("record") Tsh003Tramite record, @Param("example") Tsh003TramiteExample example);

    int updateByExample(@Param("record") Tsh003Tramite record, @Param("example") Tsh003TramiteExample example);

    int updateByPrimaryKeySelective(Tsh003Tramite record);

    int updateByPrimaryKey(Tsh003Tramite record);
}