package com.payulatam.prototype.view.model;

import com.payulatam.prototype.view.entity.MenuItem;
import com.payulatam.prototype.view.exception.IllegalTemplateException;
import lombok.Getter;
import lombok.Setter;
import org.zkoss.bind.annotation.*;
import org.zkoss.zk.ui.event.SelectEvent;
import org.zkoss.zkmax.zul.Navitem;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
@Getter
@Setter
public class MenuViewModel {

    // -----------------------------------------------------------------------------------------------------------------
    // View Attributes
    // -----------------------------------------------------------------------------------------------------------------

    private List<MenuItem> menuItems;
    private String currentViewTemplate;

    // -----------------------------------------------------------------------------------------------------------------
    // View Initialization
    // -----------------------------------------------------------------------------------------------------------------

    /**
     *
     */
    @Init
    public void init() {
        menuItems = Arrays.asList(
                new MenuItem("Inicio", "z-icon-home", "/view/home.zul"),
                new MenuItem("Clientes", "z-icon-group", "/view/clients.zul"),
                new MenuItem("Cuentas", "z-icon-credit-card", "/view/accounts.zul"),
                new MenuItem("Movimientos", "z-icon-dollar", "/view/movements.zul"),
                new MenuItem("Reportes", "z-icon-bar-chart-o", "/view/reports.zul")
        );
    }

    // -----------------------------------------------------------------------------------------------------------------
    // View Events
    // -----------------------------------------------------------------------------------------------------------------

    /**
     * @param event
     */
    @Command
    @SmartNotifyChange("currentViewTemplate")
    public void navigate(@ContextParam(ContextType.TRIGGER_EVENT) SelectEvent<Navitem, Object> event) {
        String currentViewLabel = event.getSelectedItems().iterator().next().getLabel();

        try {
            currentViewTemplate = findCurrentViewTemplate(currentViewLabel);
        } catch (IllegalTemplateException e) {
            currentViewTemplate = menuItems.get(0).getViewTemplate();
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Helper Methods
    // -----------------------------------------------------------------------------------------------------------------

    /**
     * Return the name of the template related to the selected menu item
     *
     * @param currentViewLabel the label for the selected menu item
     * @return a {@link String} instance that represents the template name for the current view
     * @throws IllegalTemplateException a exception throed if the current view label does not have a template
     */
    private String findCurrentViewTemplate(String currentViewLabel) throws IllegalTemplateException {
        for (MenuItem item : menuItems) {
            if (item.getLabel().equals(currentViewLabel)) {
                return item.getViewTemplate();
            }
        }
        throw new IllegalTemplateException(currentViewLabel);
    }
}
