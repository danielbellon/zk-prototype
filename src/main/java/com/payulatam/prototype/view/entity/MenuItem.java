package com.payulatam.prototype.view.entity;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class MenuItem {

    // -----------------------------------------------------------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------------------------------------------------------

    private String label;
    private String iconSclass;
    private String viewTemplate;

    // -----------------------------------------------------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------------------------------------------------

    /**
     *
     * @param label
     * @param iconSclass
     * @param viewTemplate
     */
    public MenuItem(String label, String iconSclass, String viewTemplate) {
        this.label = label;
        this.iconSclass = iconSclass;
        this.viewTemplate = viewTemplate;
    }
}
