package com.rulesapp;

import com.springapp.models.GenericContextPrototype;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public ArrayList<String> caller() {

        ArrayList<String> outputList=new ArrayList<String>();
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	// go !
            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            GenericContextPrototype gcp=new GenericContextPrototype();
            for(int i=0;i<20;i++){
            	message = new Message();
                message.setMessage("Hello World");
            	message.setStatus(gcp.getValue());
            	message.setAnother(gcp.getComparator());
            	
            	kSession.insert(message);
            	
            	kSession.fireAllRules();
                System.out.println("message from object: "+message.getOutput());
                outputList.add(message.getOutput());
            	Thread.sleep(50);
            	//System.out.println("i: "+i);
            	//kSession.fireUntilHalt();
            }
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
        return outputList;
    }

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;
        public  int ANOTHER=-5;
		public static int readInformation;
        private String message;
        private static String output;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
        public void setAnother(int another){
        	this.ANOTHER=another;
        }

        public static String getOutput(){
            return output;
        }

        public static void setOutput(String o){
           output=o;
        }

    }

}
