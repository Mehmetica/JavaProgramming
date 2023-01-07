package day_44_Interface_Intro.Abstraction_Task;

public interface Playable {


    void play();//    public ve abstract yazmasak bile default olarak öyledir

    boolean isFriendly = true;// interface de static blok olmadığından hemen initilaze etmeliyiz.default olarak static ve final dir





}
