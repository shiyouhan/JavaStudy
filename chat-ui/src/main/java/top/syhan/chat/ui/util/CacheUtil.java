package top.syhan.chat.ui.util;

import top.syhan.chat.ui.view.chat.group_bar_chat.ElementTalk;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 缓存工具
 * @author mqxu
 */
public class CacheUtil {

    /**
     * 对话框组
     */
    public static Map<String, ElementTalk> talkMap = new ConcurrentHashMap<>(16);

}
