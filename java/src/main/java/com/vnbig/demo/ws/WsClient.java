package com.vnbig.demo.ws;

import javax.websocket.*;
import java.net.URI;

/**
 * @ClassName WsMessage
 * @Description 获取websocket实时消息
 * @Author jiangyunpeng
 * @Date 2018/12/27 16:07
 * @Version 1.0
 */
@ClientEndpoint
public class WsClient {

    Session userSession = null;
    private MessageHandler messageHandler;

    public WsClient(URI uri) {
        try {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            container.connectToServer(this, uri);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 连接事件
     * @param userSession the userSession which is opened.
     */
    @OnOpen
    public void onOpen(Session userSession) {
        System.out.println("opening websocket");
        this.userSession = userSession;
    }

    /**
     * 关闭事件
     *
     */
    @OnClose
    public void onClose(Session userSession, CloseReason reason) {
        System.out.println("closing websocket");
        this.userSession = null;
    }

    /**
     * 收到消息事件
     * @param message The text message
     */
    @OnMessage
    public void onMessage(String message) {
        if (this.messageHandler != null) {
            this.messageHandler.handleMessage(message);
        }
    }

    /**
     * addMessageHandler
     * @param msgHandler
     */
    public void addMessageHandler(MessageHandler msgHandler) {
        this.messageHandler = msgHandler;
    }

    /**
     * sendMessage
     * @param message
     */
    public void sendMessage(String message) {
        this.userSession.getAsyncRemote().sendText(message);
    }

    /**
     * messageHandler
     */
    public interface MessageHandler {

        public void handleMessage(String message);
    }
}