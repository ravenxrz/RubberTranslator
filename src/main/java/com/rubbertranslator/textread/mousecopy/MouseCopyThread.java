package com.rubbertranslator.textread.mousecopy;
import com.rubbertranslator.textread.mousecopy.initiator.MouseCopyInitiator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/5/7 15:01
 */
public class MouseCopyThread extends Thread{
    @Override
    public void run() {
        // 初始化后就退出，无需做保活
        MouseCopyInitiator.initialize();
    }
}
