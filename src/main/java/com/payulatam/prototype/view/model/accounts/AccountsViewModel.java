package com.payulatam.prototype.view.model.accounts;

import com.payulatam.prototype.model.Account;
import lombok.Getter;
import lombok.Setter;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.Window;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AccountsViewModel {

    // -----------------------------------------------------------------------------------------------------------------
    // View Attributes
    // -----------------------------------------------------------------------------------------------------------------

    private List<Account> accountsList;

    // -----------------------------------------------------------------------------------------------------------------
    // View Initialization
    // -----------------------------------------------------------------------------------------------------------------

    @Init
    public void init() {
        accountsList = new ArrayList<Account>();
    }

    // -----------------------------------------------------------------------------------------------------------------
    // View Events
    // -----------------------------------------------------------------------------------------------------------------

    @Command
    public void showCreationModal() {
        String modalTemplate = "/view/accounts/account-creation.zul";
        ((Window) Executions.createComponents(modalTemplate, null, null)).doModal();
    }
}
