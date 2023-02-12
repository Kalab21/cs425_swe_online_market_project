package edu.miu.cs.cs425.swe_online_market_project.service;

import edu.miu.cs.cs425.swe_online_market_project.model.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddress();
    Address createAddress(Address address);
    Address  updateAddress(Address address, Long id);
    void deleteAddressById(Long id);
}
