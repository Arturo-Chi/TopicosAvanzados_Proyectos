/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finaltopicos;
import java.io.File;
import javax.sound.sampled.*;
/**
 *
 * @author artur
 */
public class Reproductor {
    
    private BooleanControl mute;
    private Clip clip;
    public Reproductor(String ruta){
        this.reproducirPista(ruta);
    }

    public Reproductor() {
    }
    
    
    
    public void reproducirPista(String ruta){
        try {
            
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(ruta));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
             mute = (BooleanControl) clip.getControl(BooleanControl.Type.MUTE);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void reproducirEfecto(String ruta){
        try {
            
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(ruta));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
             
            clip.start();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public BooleanControl getMute() {
        return mute;
    }

    public Clip getClip() {
        return clip;
    }
    
    
    
    public void alternarSonido(){
        if(mute != null){
            mute.setValue(!mute.getValue());
        }
    }
}
