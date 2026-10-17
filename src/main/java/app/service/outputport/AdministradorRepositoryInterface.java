package app.service.outputport;

import java.util.List;

public interface AdministradorRepositoryInterface {


    AdministradorRepositoryInterface saveAdministrador(AdministradorRepositoryInterface administradorRepositoryInterface);

    List<AdministradorRepositoryInterface> selectAllAdministradorRepositoryInterface();

    AdministradorRepositoryInterface selectAdministradorRepositoryInterfaceById(int id);

    AdministradorRepositoryInterface updateAdministradorRepositoryInterface(AdministradorRepositoryInterface administradorRepositoryInterface);

    void deletedAdministradorRepositoryInterface(int id);
}
