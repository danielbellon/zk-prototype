package com.payulatam.prototype.view.model.clients;

import com.payulatam.prototype.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Window;

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

    // -----------------------------------------------------------------------------------------------------------------
    // View Events
    // -----------------------------------------------------------------------------------------------------------------

    @Command
    public void showCreationModal() {
        String modalTemplate = "/view/clients/client-creation.zul";
        ((Window) Executions.createComponents(modalTemplate, null, null)).doModal();
    }
}
