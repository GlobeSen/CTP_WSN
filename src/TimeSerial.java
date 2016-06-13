import java.io.IOException;
import java.util.Random;

import net.tinyos.message.*;
import net.tinyos.packet.*;
import net.tinyos.util.*;

import java.util.HashSet;  
import java.util.Iterator;  
import java.util.Set;  
import java.util.Random;
import java.io.*;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TimeSerial implements MessageListener {

  private MoteIF moteIF;
  
  int counter=0;
  
  public TimeSerial(MoteIF moteIF) {
    this.moteIF = moteIF;
//    this.moteIF.registerListener(new TestSerialMsg(), this);
    this.moteIF.registerListener(new CTPWSN(), this);
  }

  public int set_payload_LL()
  {
    int random = new Random().nextInt(5);
    return random;
  }

  public void sendPackets() {
    int counter = 0;
   
    //TestSerialMsg payload = new TestSerialMsg();
    CTPWSN_Time payload = new CTPWSN_Time();
    
    try {
      
	System.out.println("Sending packet " + counter);
	payload.set_msgType(0);
	payload.set_time(0);


	//payload.set_counter(counter);
	moteIF.send(1, payload);
	//javaSystem.out.println(payload.get_downLeft_Lon());
	counter++;
	// try {Thread.sleep(3000);}
	// catch (InterruptedException exception) {}
      
    }
    catch (IOException exception) {
      System.err.println("Exception thrown when sending packets. Exiting.");
      System.err.println(exception);
    }
  }

  public void messageReceived(int to, Message message) {
    
    CTPWSN_Time msg = (CTPWSN_Time)message;
    counter++;
    System.out.println("Received packet sequence number " + counter);
    
  }
  
  private static void usage() {
    System.err.println("usage: TestSerial [-comm <source>]");
  }
  
  public static void main(String[] args) throws Exception {
    String source = null;
    if (args.length == 2) {
      if (!args[0].equals("-comm")) {
	usage();
	System.exit(1);
      }
      source = args[1];
    }
    else if (args.length != 0) {
      usage();
      System.exit(1);
    }
    
    PhoenixSource phoenix;
    
    if (source == null) {
      phoenix = BuildSource.makePhoenix(PrintStreamMessenger.err);
    }
    else {
      phoenix = BuildSource.makePhoenix(source, PrintStreamMessenger.err);
    }

    MoteIF mif = new MoteIF(phoenix);
    TimeSerial serial = new TimeSerial(mif);
    serial.sendPackets();
  }


}
