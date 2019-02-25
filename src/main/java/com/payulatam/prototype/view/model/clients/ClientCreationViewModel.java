package com.payulatam.prototype.view.model.clients;

import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Window;

public class ClientCreationViewModel {

    // -----------------------------------------------------------------------------------------------------------------
    // UI Attributes
    // -----------------------------------------------------------------------------------------------------------------

    @Wire("#modal") Window window;

    // -----------------------------------------------------------------------------------------------------------------
    // Init methods
    // -----------------------------------------------------------------------------------------------------------------

    @AfterCompose
    public void initUiComponents(@ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // View Events
    // -----------------------------------------------------------------------------------------------------------------

    @Command
    public void closeWindow() {
        window.detach();
    }
}
