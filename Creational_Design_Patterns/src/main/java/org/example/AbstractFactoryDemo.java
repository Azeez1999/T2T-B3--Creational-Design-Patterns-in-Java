package org.example;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        String theme = (args.length > 0 ? args[0] : "light").toLowerCase();
        ThemeFactory factory = switch (theme) {
            case "dark" -> new DarkThemeFactory();
            case "light" -> new LightThemeFactory();
            default -> throw new IllegalArgumentException("Unknown theme: " + theme);
        };


        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();


        button.paint();
        checkbox.check();
    }
}


// Abstract products
interface Button { void paint(); }
interface Checkbox { void check(); }


// Abstract factory
interface ThemeFactory {
    Button createButton();
    Checkbox createCheckbox();
}


// Light family
class LightButton implements Button {
    @Override public void paint() { System.out.println("[Light] Button rendered"); }
}
class LightCheckbox implements Checkbox {
    @Override public void check() { System.out.println("[Light] Checkbox toggled"); }
}
class LightThemeFactory implements ThemeFactory {
    @Override public Button createButton() { return new LightButton(); }
    @Override public Checkbox createCheckbox() { return new LightCheckbox(); }
}


// Dark family
class DarkButton implements Button {
    @Override public void paint() { System.out.println("[Dark] Button rendered"); }
}
class DarkCheckbox implements Checkbox {
    @Override public void check() { System.out.println("[Dark] Checkbox toggled"); }
}
class DarkThemeFactory implements ThemeFactory {
    @Override public Button createButton() { return new DarkButton(); }
    @Override public Checkbox createCheckbox() { return new DarkCheckbox(); }
}