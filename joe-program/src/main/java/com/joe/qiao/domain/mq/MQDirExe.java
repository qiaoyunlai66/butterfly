package com.joe.qiao.domain.mq;


import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

import javax.jms.*;

/**
 * @author Joe Qiao
 * @Date 20/03/2018.
 */
public class MQDirExe {

    /**
     * @param args
     * @throws JMSException
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub  
        try {
            ConnectionFactory factory = new ActiveMQConnectionFactory("vm://localhost");

            Connection connection = factory.createConnection();
            connection.start();
            //创建消息的Destination   
            Queue queue = new ActiveMQQueue("testQueue");

            final Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            //创建将要发送的消息  
            Message message = session.createTextMessage("Hello JMS!");
            //创建消息生产者发送消息   
            MessageProducer producer = session.createProducer(queue);
            producer.send(message);

            System.out.println("Send Message Completed!");
            //创建消息的接收者   
            MessageConsumer comsumer = session.createConsumer(queue);
            //消息的消费者接收消息的第一种方式：consumer.receive() 或 consumer.receive(int timeout)；  
            //Message recvMessage = comsumer.receive();    
            //System.out.println(((TextMessage)recvMessage).getText());   
            //消息的消费者接收消息的第二种方式：注册一个MessageListener  
            comsumer.setMessageListener(new MessageListener() {
                public void onMessage(Message msg) {
                    // TODO Auto-generated method stub  
                    TextMessage textMsg = (TextMessage) msg;
                    try {
                        System.out.println(textMsg.getText());
                    } catch (JMSException e) {
                        e.printStackTrace();

                    }
                }

            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
