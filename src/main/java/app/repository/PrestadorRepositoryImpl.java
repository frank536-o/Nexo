package app.repository;

import app.service.outputport.PrestadorRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

public class PrestadorRepositoryImpl implements PrestadorRepositoryInterface {
    List<PrestadorRepositoryInterface> owners = new ArrayList<>();


    @Override
    public PrestadorRepositoryInterface savePrestador(PrestadorRepositoryInterface prestadorRepositoryInterface){

        owners.add(prestadorRepositoryInterface);

        return prestadorRepositoryInterface;
    }


    @Override
    public List<PrestadorRepositoryInterface> selectAllPrestadorRepositoryInterface() {

        return owners;
    }

    @Override
    public PrestadorRepositoryInterface selectPrestadorRepositoryInterfaceById(int id) {
        return null;
    }

    @Override
    public PrestadorRepositoryInterface updatePrestadorRepositoryInterface(PrestadorRepositoryInterface prestadorRepositoryInterface) {
        return null;
    }

    @Override
    public void deletedPrestadorRepositoryInterface(int id) {

    }

}
