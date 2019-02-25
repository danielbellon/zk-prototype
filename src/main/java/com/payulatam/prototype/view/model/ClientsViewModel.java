package com.payulatam.prototype.view.model;

import com.payulatam.prototype.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.zkoss.bind.annotation.Init;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ClientsViewModel {

    // -----------------------------------------------------------------------------------------------------------------
    // View Attributes
    // -----------------------------------------------------------------------------------------------------------------

    private List<Client> clientsList;

    // -----------------------------------------------------------------------------------------------------------------
    // View Initialization
    // -----------------------------------------------------------------------------------------------------------------

    @Init
    public void init() {
        clientsList = new ArrayList<Client>();
    }
}
