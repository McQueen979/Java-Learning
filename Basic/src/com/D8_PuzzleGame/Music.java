package com.D8_PuzzleGame;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
    音乐类
        1.在模块下创建lib包保存
            jl-1.0.1.jar -> 右键 Add As Lib...添加到依赖
        2.在模块下创建Music包保存mp3文件
*/

/*public class Music {
    public Music() throws FileNotFoundException, JavaLayerException {
        //关联mp3文件, 最后一个字符串中的数据可以改
        String str = System.getProperty("user.dir") + "/Basic/Music/music.mp3";
        BufferedInputStream name = new BufferedInputStream(new FileInputStream(str));
        //根据读取的文件, 初始化Player类
        Player player = new Player(name);
        //调用播放的方法
        player.play();
    }
如果运行后完全没有窗口弹出，只有音乐播放，核心问题通常是主线程被音乐播放阻塞，导致窗口初始化流程未完成。结合代码细节分析如下：
关键原因：音乐播放阻塞主线程
在 PictureFrame 类的 initFrame() 方法中，通过 new Music() 播放音乐时，Music 类的逻辑存在阻塞主线程的问题：
Music 类的构造方法中调用了 player.play()，而 javazoom.jl.player.Player 的 play() 方法是阻塞式执行的（会一直占用当前线程，直到音乐播放完毕才释放）。
由于 Java 程序的窗口初始化（JFrame 的创建、显示）依赖主线程执行，当主线程被 play() 方法阻塞时，PictureFrame 的初始化流程（如 paintView() 绘制组件、setVisible(true) 显示窗口）会被中断，导致窗口无法弹出。
}*/

public class Music {
    // 构造方法中启动线程播放音乐，避免阻塞
    public Music() throws FileNotFoundException, JavaLayerException {
        // 启动新线程执行播放逻辑
        new Thread(() -> {
            try {
                String str = System.getProperty("user.dir") + "/Basic/Music/music.mp3";
                BufferedInputStream name = new BufferedInputStream(new FileInputStream(str));
                Player player = new Player(name);
                player.play(); // 此方法阻塞，但在独立线程中，不影响主线程
            } catch (FileNotFoundException | JavaLayerException e) {
                e.printStackTrace();
            }
        }).start(); // 启动线程
    }
}