package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Package;
import java.util.List;


@Mapper
public interface PackageMapper {
    List<Package> selectAll();
    void insert(@Param("package") Package pack);
}
