package app.repository;

import app.service.outputport.AdministradorRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

public class AdministradorRepositoryImpl implements AdministradorRepositoryInterface {

        List<AdministradorRepositoryInterface> owners = new ArrayList<>();


        @Override
        public AdministradorRepositoryInterface saveAdministrador(AdministradorRepositoryInterface administradorRepositoryInterface){

            owners.add(administradorRepositoryInterface);

            return administradorRepositoryInterface;
        }


        @Override
        public List<AdministradorRepositoryInterface> selectAllAdministradorRepositoryInterface() {

            return owners;
        }

        @Override
        public AdministradorRepositoryInterface selectAdministradorRepositoryInterfaceById(int id) {
            return null;
        }

        @Override
        public AdministradorRepositoryInterface updateAdministradorRepositoryInterface(AdministradorRepositoryInterface administradorRepositoryInterface) {
            return null;
        }

        @Override
        public void deletedAdministradorRepositoryInterface(int id) {

        }

    }

