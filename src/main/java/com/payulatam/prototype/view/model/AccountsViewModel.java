package com.payulatam.prototype.view.model;

import com.payulatam.prototype.model.Account;
import lombok.Getter;
import lombok.Setter;
import org.zkoss.bind.annotation.Init;

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
}
