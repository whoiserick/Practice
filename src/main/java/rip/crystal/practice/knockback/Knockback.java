package rip.crystal.practice.knockback;

import rip.crystal.practice.cPractice;
import lombok.Getter;
import lombok.Setter;
import rip.crystal.practice.knockback.impl.*;

public class Knockback {

    @Getter @Setter public static KnockbackProfiler knockbackProfiler;

    public static void init() {
        switch (cPractice.get().getServer().getName()) {
            case "GxSpigot":
                knockbackProfiler = new GxSpigot();
                System.out.print("Hooked into GxSpigot");
                break;
            case "FoxSpigot":
                knockbackProfiler = new FoxSpigot();
                System.out.print("Hooked into FoxSpigot");
                break;
            case "pSpigot":
                knockbackProfiler = new pSpigot();
                System.out.print("Hooked into pSpigot");
                break;
            case "InsanePaper":
                knockbackProfiler = new InsanePaperSpigot();
                System.out.print("Hooked into InsanePaper");
                break;
            case "gSpigot":
                knockbackProfiler = new gSpigot();
                System.out.print("Hooked into gSpigot");
                break;
            default:
                knockbackProfiler = new Default();
                System.out.print("You don't have a spigot compatible with Hysteria's Knockbacks");
                System.out.print("You don't have a spigot compatible with Hysteria's Knockbacks");
                System.out.print("You don't have a spigot compatible with Hysteria's Knockbacks");
                break;
        }
    }
}
