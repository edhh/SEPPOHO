package mx.sep.poho.dao;

import java.util.List;
import mx.sep.poho.modelo.Tsh086ParametrosFirma;
import mx.sep.poho.modelo.Tsh086ParametrosFirmaExample;
import org.apache.ibatis.annotations.Param;

public interface Tsh086ParametrosFirmaMapper {
    int countByExample(Tsh086ParametrosFirmaExample example);

    int deleteByExample(Tsh086ParametrosFirmaExample example);

    int deleteByPrimaryKey(Integer nidParametroFirma);

    int insert(Tsh086ParametrosFirma record);

    int insertSelective(Tsh086ParametrosFirma record);

    List<Tsh086ParametrosFirma> selectByExample(Tsh086ParametrosFirmaExample example);

    Tsh086ParametrosFirma selectByPrimaryKey(Integer nidParametroFirma);

    int updateByExampleSelective(@Param("record") Tsh086ParametrosFirma record, @Param("example") Tsh086ParametrosFirmaExample example);

    int updateByExample(@Param("record") Tsh086ParametrosFirma record, @Param("example") Tsh086ParametrosFirmaExample example);

    int updateByPrimaryKeySelective(Tsh086ParametrosFirma record);

    int updateByPrimaryKey(Tsh086ParametrosFirma record);
}