package app.service.outputport;

import java.util.List;

public interface PrestadorRepositoryInterface {
    PrestadorRepositoryInterface savePrestador(PrestadorRepositoryInterface prestadorRepositoryInterface);

    List<PrestadorRepositoryInterface> selectAllPrestadorRepositoryInterface();

    PrestadorRepositoryInterface selectPrestadorRepositoryInterfaceById(int id);

    PrestadorRepositoryInterface updatePrestadorRepositoryInterface(PrestadorRepositoryInterface prestadorRepositoryInterface);

    void deletedPrestadorRepositoryInterface(int id);
}
