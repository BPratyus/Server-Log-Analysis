/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverloganalysis;

//import java.util.String;

/**
 *
 * @author basul
 */
public class bean {
     int sno=0;
     String client=null;
     String dateTime=null;
     String method=null;
     String request=null;
     String status=null;
     int size=0;
     String referer=null;
     String useragent=null;
    // public RentalPropertyBean(float amt,int num,)
    public void setsno(int num){
        sno=num;
    }
    public void setclient(String cli){
        client=cli;
    }
    public void setdateTime(String num){
        dateTime=num;
    }
    public void setmethod(String meth){
        method=meth;
    }
    public void setrequest(String request){
        this.request=request;
    }
    public void setstatus(String ref){
        status=ref;
    }
    public void setsize(int s){
        size=s;
    }
    public void setreferer(String id){
        referer=id;
    }
    public void setuseragent(String id){
        useragent=id;
    }

    public int getsno() {
        return sno;
    }
    public String getclient() {
        return client;
    }
    public String getdateTime() {
        return dateTime;
    }
    public String getmethod() {
        return method;
    }
    public String getrequest() {
        return request;
    }
    public String getstatus() {
        return status;
    }
    public int getsize() {
        return size;
    }
    public String getreferer() {
        return referer;
    }
    public String getuseragent() {
        return useragent;
    }
}
