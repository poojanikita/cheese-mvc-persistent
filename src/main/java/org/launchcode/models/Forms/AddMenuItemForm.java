package org.launchcode.models.Forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

/**
 * Created by poojanikita on 7/23/17.
 */
public class AddMenuItemForm {

    private Menu menu;
    private Iterable<Cheese> cheeses;
    private int menuId;
    private int cheeseId;

    public AddMenuItemForm() {
    }

    public AddMenuItemForm(Menu menu, Iterable<Cheese> cheeses) {
        this.menu = menu;
        this.cheeses = cheeses;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }
}