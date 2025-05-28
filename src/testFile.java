import javax.swing.*;
import java.awt.*;

public class testFile {
    public static void main(String[] args) {
        RegularVM regularVM = new RegularVM();
        SpecialVM specialVM = new SpecialVM();

//        specialVM.setItemChoices();
        Item[] items = regularVM.getItemChoices();

        for(int i = 0; i < items.length; i++) {
            System.out.println(items[i].getName());
        }
    }
}
