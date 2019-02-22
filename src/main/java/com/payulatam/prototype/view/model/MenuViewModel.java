package com.payulatam.prototype.view.model;

import lombok.Getter;
import lombok.Setter;
import org.zkoss.bind.annotation.*;
import org.zkoss.essentials.chapter5.MenuNode;
import org.zkoss.zk.ui.event.SelectEvent;
import org.zkoss.zkmax.zul.Navitem;

import java.util.Arrays;
import java.util.List;

@Getter @Setter
public class MenuViewModel {

    // -----------------------------------------------------------------------------------------------------------------
    // View Attributes
    // -----------------------------------------------------------------------------------------------------------------

    private List<MenuNode> menuNodes;
    private String currentPage;

    // -----------------------------------------------------------------------------------------------------------------
    // View Initialization
    // -----------------------------------------------------------------------------------------------------------------

    @Init
    public void init() {
        menuNodes = Arrays.asList(
                new MenuNode("Inicio", "z-icon-home"),
                new MenuNode("Clientes", "z-icon-group"),
                new MenuNode("Cuentas", "z-icon-credit-card"),
                new MenuNode("Movimientos", "z-icon-home"),
                new MenuNode("Reportes", "z-icon-bar-chart-o")
        );
    }

    // -----------------------------------------------------------------------------------------------------------------
    // View Events
    // -----------------------------------------------------------------------------------------------------------------

    @Command
    @SmartNotifyChange("currentPage")
    public void navigate(@ContextParam(ContextType.TRIGGER_EVENT) SelectEvent<Navitem, Object> event) {
        currentPage = event.getSelectedItems().iterator().next().getLabel();
    }
}
