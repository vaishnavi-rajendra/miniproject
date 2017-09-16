package com.rajendra.vaishnavi.miniproject.datasource;



import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * Created by Admin on 12-02-2017.
 */

public class datasource {
    String result = null;
    InputStream is = null;
    StringBuilder sb = null;

    public String getValueRegistration(String email, String user, String pass, String country) {
        try {
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost("http://192.168.43.185:8090/Miniproject/index.jsp?username=" + user + "&password=" + pass + "&mail=" + email + "&country=" + country);
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();


        } catch (Exception e) {
            Log.e("log_tag", "error in http connection int test book" + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            sb = new StringBuilder();
            sb.append(reader.readLine() + "\n");
            String line = "0";
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            result = sb.toString();
        } catch (Exception e) {
            Log.e("log_tag", "Error converting result" + e.toString());
        }
        return result;
    }

    public String checkLogin(String user, String pass) {
        try {
            HttpClient httpclient = new DefaultHttpClient();

            HttpPost httppost = new HttpPost(
                    "http://192.168.43.185:8090/Miniproject/Logincheck.jsp?uname=" + user
                            + "&password=" + pass);


            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();

        } catch (Exception e) {
            Log.e("log_tag",
                    "Error in http connection int test book " + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            sb = new StringBuilder();
            sb.append(reader.readLine() + "\n");

            String line = "0";
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            result = sb.toString();
        } catch (Exception e) {
            Log.e("log_tag", "Error converting result " + e.toString());
        }
        return result;
    }

    public String fetch_db(String startpoint, String day) {
        try {
            HttpClient httpclient = new DefaultHttpClient();

            HttpPost httppost = new HttpPost(
                    "http://192.168.43.185:8090/Miniproject/fetch.jsp?start=" + startpoint
                            + "&day=" + day);


            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();

        } catch (Exception e) {
            Log.e("log_tag",
                    "Error in http connection int test book " + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            sb = new StringBuilder();
            sb.append(reader.readLine() + "\n");

            String line = "0";
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            result = sb.toString();
        } catch (Exception e) {
            Log.e("log_tag", "Error converting result " + e.toString());
        }
        return result;

    }

    public String route(String startpoint, String day) {
        try {
            HttpClient httpclient = new DefaultHttpClient();

            HttpPost httppost = new HttpPost(
                    "http://192.168.43.185:8090/Miniproject/route.jsp?start=" + startpoint
                            + "&day=" + day);


            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();

        } catch (Exception e) {
            Log.e("log_tag",
                    "Error in http connection int test book " + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            sb = new StringBuilder();
            sb.append(reader.readLine() + "\n");

            String line = "0";
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            result = sb.toString();
        } catch (Exception e) {
            Log.e("log_tag", "Error converting result " + e.toString());
        }
        return result;
    }
    public String image(String username1) {
        try {
            HttpClient httpclient = new DefaultHttpClient();


            HttpPost httppost = new HttpPost(
                    "http://192.168.43.185:8090/Miniproject/desp.jsp?username1="+ username1);



            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();

        } catch (Exception e) {
            Log.e("log_tag",
                    "Error in http connection int test book " + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            sb = new StringBuilder();
            sb.append(reader.readLine() + "\n");

            String line = "0";
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            result = sb.toString();
        } catch (Exception e) {
            Log.e("log_tag", "Error converting result " + e.toString());
        }
        return result;
    }





    public String recommend(String username1,String rev) {
        String uname=username1.replaceAll(" ","-");
        String rev1=rev.replaceAll(" ","-");
        try {
            HttpClient httpclient = new DefaultHttpClient();


            HttpPost httppost = new HttpPost(
                    "http://192.168.43.185:8090/Miniproject/review.jsp?username1="+uname+"&rev="+rev1);



            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();

        } catch (Exception e) {
            Log.e("log_tag",
                    "Error in http connection int test book " + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            sb = new StringBuilder();
            sb.append(reader.readLine() + "\n");

            String line = "0";
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            result = sb.toString();
        } catch (Exception e) {
            Log.e("log_tag", "Error converting result " + e.toString());
        }
        return result;
    }
    public String getRev() {
        try {
            HttpClient httpclient = new DefaultHttpClient();


            HttpPost httppost = new HttpPost(
                    "http://192.168.43.185:8090/Miniproject/getreview.jsp");



            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();

        } catch (Exception e) {
            Log.e("log_tag",
                    "Error in http connection int test book " + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            sb = new StringBuilder();
            sb.append(reader.readLine() + "\n");

            String line = "0";
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            result = sb.toString();
        } catch (Exception e) {
            Log.e("log_tag", "Error converting result " + e.toString());
        }

        return result;
    }
    public String getRev1(String user2) {
        try {
            HttpClient httpclient = new DefaultHttpClient();


            HttpPost httppost = new HttpPost(
                    "http://192.168.43.185:8090/Miniproject/getreview1.jsp?user="+ user2);



            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();

        } catch (Exception e) {
            Log.e("log_tag",
                    "Error in http connection int test book " + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            sb = new StringBuilder();
            sb.append(reader.readLine() + "\n");

            String line = "0";
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            result = sb.toString();
        } catch (Exception e) {
            Log.e("log_tag", "Error converting result " + e.toString());
        }
        return result;
    }
}
