package org.grails.guides

import grails.gorm.services.Service

@Service(Vehicle)
interface VehicleService {

    Vehicle get(Serializable id)

    List<Vehicle> list(Map args)

    Long count()

    void delete(Serializable id)

    Vehicle save(String name, Make make, Model model, Integer year)

}