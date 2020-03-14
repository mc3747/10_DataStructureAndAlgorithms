package day6;
//继承的例子
public class StudyDay6_2 {
    public static void main(String[] args) {
        MessageImpl ims = new MessageImpl("帅！") ;
        Object OI = ims ; //向上转型
        IChannel IC = (IChannel) OI ; //向下转型
        IMessage IM = (IMessage) ims ; //向下转型
        ims.setKey("帅！"); ;
        System.out.println(ims.getInfo()) ;

    }
}


interface IMessage{
    public static final String INFO = "帅！" ;
    public abstract String getInfo() ;
    public default void demo(){}
}

interface IChannel{
    public abstract boolean connect() ;
}

abstract class AMessage{
    public abstract void aMessage() ;
}

class MessageImpl extends AMessage implements IMessage,IChannel{//一个子类可以继承一个抽象类同时 实现 多接口 。
    String Key = "" ;
    public MessageImpl(String Key){
        this.Key = Key ;
    }

    public  String getInfo(){
        if(this.connect()) {
            return "消息通道已建立......\n得到一个机密消息！\n"+"哇，小哥哥你 好 帅 哦" ;
        }
        return "密码错误！通道建立失败！无法得到消息！\n你输入的弱者密码为：<"+this.Key+"> 请重新输入！" ;
    }

    public boolean connect(){
        if(INFO.equals(this.Key))
            return true ;
            return false ;
    }

    public void setKey(String Key){
        this.Key =Key ;
    }

    public void aMessage(){
        System.out.println();
    } ;
}
