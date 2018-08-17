package com.dyny.gms.utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.w3c.dom.Document;

import com.alibaba.fastjson.JSONObject;

/**
 * 2018-06-22 update
 *
 * @author wglbsr
 *
 */
public class Tool {
    private static Logger logger = Logger.getLogger(Tool.class);

    public static void main(String[] args) throws IOException {
        // 816~865 1~50
        // 867~916 51~100
        // System.out.println(Tool.StringUtil.isMailAddress("527109046@qq.com"));;
//        for (int i = 51; i <= 100; i++) {
//            Tool.NetUtil.downLoadFromUrl("http://media-shared.com/qr/qrcode_" + (816 + i) + ".png",
//                    "qrcode_" + i + ".png", "/Users/wglbsr/qrCode", 2000);
//        }
    }

    /**
     * 网络相关类
     *
     * @author wglbsr
     *
     */
//    public static class NetUtil {
//
//        /**
//         *
//         * @param url
//         * @param timeout_ms
//         * @param retryTimes
//         *            大于等于1
//         * @return
//         */
//        public static org.jsoup.nodes.Document getDocByFakeBrowser(String url, int timeout_ms, int retryTimes) {
//            org.jsoup.nodes.Document doc = null;
//            retryTimes = retryTimes > 0 ? retryTimes : 1;
//            timeout_ms = timeout_ms > 0 ? timeout_ms : 1500;
//            for (int i = 0; i < retryTimes; i++) {
//                try {
//                    if (Tool.StringUtil.validStr(url)) {
//                        doc = (org.jsoup.nodes.Document) Jsoup.connect(url).timeout(timeout_ms)
//                                // w伪装
//                                .userAgent(
//                                        "Mozilla/5.0?(Windows?NT?6.1;?WOW64)?AppleWebKit/537.31?(KHTML,?like?Gecko)?Chrome/26.0.1410.64?Safari/537.31")
//                                .get();
//                    }
//                } catch (Exception e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//
//            return doc;
//        }
//
//        /**
//         * 从网络Url中下载文件
//         *
//         * @param urlStr
//         * @param fileName
//         * @param savePath
//         * @throws IOException
//         */
//        public static int downLoadFromUrl(String urlStr, String fileName, String savePath, int timeout)
//                throws IOException {
//            // 文件保存位置
//            File saveDir = new File(savePath);
//            if (!saveDir.exists()) {
//                saveDir.mkdir();
//            }
//            // 首先判断文件是否已经存在
//            File file = new File(saveDir + File.separator + fileName);
//            if (file.exists()) {
//                return -1;
//            }
//            URL url = new URL(urlStr);
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setConnectTimeout(timeout);
//            // 防止屏蔽程序抓取而返回403错误
//            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
//            // 得到输入流
//            InputStream inputStream = conn.getInputStream();
//            // 获取自己数组
//            byte[] getData = Tool.FileUtil.readInputStream(inputStream);
//            FileOutputStream fos = new FileOutputStream(file);
//            fos.write(getData);
//            if (fos != null) {
//                fos.close();
//            }
//            if (inputStream != null) {
//                inputStream.close();
//            }
//            return 1;
//        }
//
//        /**
//         *
//         * @param uri
//         * @return
//         * @throws URISyntaxException
//         * @throws ClientProtocolException
//         * @throws IOException
//         */
//        public static String getURLContent(URI uri) throws URISyntaxException, ClientProtocolException, IOException {
//            if (uri == null) {
//                return null;
//            }
//            // System.out.println(uri.toString());
//            HttpGet httpget = new HttpGet(uri);
//            CloseableHttpClient httpclient = HttpClients.createDefault();
//            CloseableHttpResponse response = httpclient.execute(httpget);
//            String content = null;
//            try {
//                HttpEntity entity = response.getEntity();
//                content = EntityUtils.toString(entity);
//            } finally {
//                response.close();
//            }
//            return content;
//        }
//
//        /**
//         *
//         * @param params
//         * @param host
//         * @param path
//         * @param scheme
//         * @return
//         * @throws URISyntaxException
//         * @throws ClientProtocolException
//         * @throws IOException
//         */
//        public static String getURLContent(Map<String, String> params, String host, String path, String scheme)
//                throws URISyntaxException, ClientProtocolException, IOException {
//
//            URIBuilder uribuilder = new URIBuilder();
//            uribuilder.setHost(host);
//            uribuilder.setPath(path);
//            uribuilder.setScheme(scheme);
//            if (params == null) {
//                return null;
//            }
//            Set<String> keyset = params.keySet();
//            Iterator<String> it = keyset.iterator();
//            while (it.hasNext()) {
//                String key = (String) it.next();
//                String content = params.get(key);
//                uribuilder.setParameter(key, content);
//            }
//            URI uri = uribuilder.build();
//            return getURLContent(uri);
//        }
//
//        /**
//         * 根据参数返回内容
//         *
//         * @param params
//         * @param host
//         * @param path
//         * @param scheme
//         * @return
//         * @throws URISyntaxException
//         * @throws ClientProtocolException
//         * @throws IOException
//         */
//        public static String getURLContent(JSONObject params, String host, String path, String scheme)
//                throws URISyntaxException, ClientProtocolException, IOException {
//            URIBuilder uribuilder = new URIBuilder();
//            uribuilder.setHost(host);
//            uribuilder.setPath(path);
//            uribuilder.setScheme(scheme);
//            if (params == null) {
//                return null;
//            }
//            Set<String> keyset = params.keySet();
//            Iterator<String> it = keyset.iterator();
//            while (it.hasNext()) {
//                String key = (String) it.next();
//                String content = params.getString(key);
//                uribuilder.setParameter(key, content);
//            }
//            URI uri = uribuilder.build();
//            return getURLContent(uri);
//        }
//    }


    /**
     * 文件工具类
     *
     * @author wglbsr
     *
     */
    public static class FileUtil {
        /**
         *
         * @param proPath
         * @return
         * @throws IOException
         */
        public static Properties getPros(String proPath) throws IOException {
            String userDir = System.getProperty("user.dir");
            String prosFilePath1 = userDir + File.separator + proPath;
            String prosFilePath2 = userDir + File.separator + "src" + File.separator + proPath;
            File test1 = new File(prosFilePath1);
            File test2 = new File(prosFilePath2);
            String realPath = "";
            if (test1.exists()) {
                realPath = prosFilePath1;
            } else if (test2.exists()) {
                realPath = prosFilePath2;
            }
            if (Tool.StringUtil.validStr(realPath)) {
                FileInputStream fis = new FileInputStream(realPath);
                Properties emailPros = new Properties();
                emailPros.load(fis);
                return emailPros;
            }
            return null;
        }

        /**
         *
         * @param filePath
         * @param fileContent
         * @throws IOException
         */
        public static void fileWrite(String filePath, List<String> fileContent) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            StringBuffer sb = new StringBuffer(4096);
            for (String temp : fileContent) {
                if (Tool.StringUtil.validStr(temp.trim())) {
                    sb.append(temp.trim()).append("\r\n");
                }
            }
            bw.write(sb.toString());
            bw.close();
        }

        /**
         *
         * @param filePath
         * @return
         * @throws IOException
         */
        public static List<String> fileRead(String filePath) throws IOException {
            List<String> fileContent = new ArrayList<String>();
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String temp = null;
            while ((temp = br.readLine()) != null) {
                fileContent.add(temp.trim());
            }
            br.close();
            return fileContent;
        }

        /**
         *
         * @param filePath
         * @return
         * @throws IOException
         */
        public static String readFile(String filePath) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String temp = null;
            StringBuffer sb = new StringBuffer();
            while ((temp = br.readLine()) != null) {
                sb.append(temp.trim());
            }
            br.close();
            return sb.toString();
        }

        /**
         *
         * @return
         */
        public static String getProjectPath() {
            return System.getProperty("user.dir");
        }

        /**
         * 读取XML
         *
         * @param filename
         * @return
         * @throws IOException
         */
        public static Document readXml(String filename) throws IOException {
            File f = new File(filename);
            if (f.exists()) {
                logger.info("配置文件路径:" + filename);
            }

            DocumentBuilder db = null;
            DocumentBuilderFactory dbf = null;
            Document dt = null;
            try {
                dbf = DocumentBuilderFactory.newInstance();
                db = dbf.newDocumentBuilder();
                dt = db.parse(f);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return dt;
        }

        /**
         * 从输入流中获取字节数组
         *
         * @param inputStream
         * @return
         * @throws IOException
         */
        public static byte[] readInputStream(InputStream inputStream) throws IOException {
            byte[] buffer = new byte[1024];
            int len = 0;
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            while ((len = inputStream.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            bos.close();
            return bos.toByteArray();
        }

        /**
         * 获取配置文件
         *
         * @param key
         * @param filePath
         * @return
         * @throws IOException
         */
        public static String getPros(String key, String filePath) throws IOException {
            Properties prop = new Properties();// 属性集合对象
            FileInputStream fis = new FileInputStream(filePath);// 属性文件流
            prop.load(fis);// 将属性文件流装载到Properties对象中
            return prop.getProperty(key);
        }

    }

    /**
     * 字符串工具类
     *
     * @author wglbsr
     *
     */
    public static class StringUtil {
        /**
         * 不为null,但等于""
         *
         * @param str
         * @return
         */
        public static boolean hasEmptyStr(String str) {
            if (str != null && !"".equals(str)) {
                return false;
            }
            return true;
        }

        /**
         * 返回json,含错误信息
         *
         * @param success
         * @param data
         * @param errorMsg
         * @return
         */
        public static String returnJson(boolean success, Object data, String errorMsg) {
            JSONObject jsonObj = new JSONObject();
            if (!success) {
                jsonObj.put("result", -1);
                jsonObj.put("errorMsg", errorMsg);
            } else {
                jsonObj.put("result", 1);
                jsonObj.put("data", data);
            }

            return jsonObj.toJSONString();
        }

        /**
         * 返回json,不含错误信息
         *
         * @param success
         * @param data
         * @return
         */
        public static String returnSimpleJson(boolean success, Object data) {
            return Tool.StringUtil.returnJson(success, data, "");
        }

        /**
         * 是否为邮箱地址
         *
         * @param mailAddress
         * @return
         */
        public static boolean isMailAddress(String mailAddress) {
            // TODO Auto-generated method stub
            if (Tool.StringUtil.matchStrByRegEx(mailAddress,
                    "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$")) {
                return true;
            }
            return false;
        }

        public static boolean isAllMailAddress(String... mailAddress) {
            // TODO Auto-generated method stub
            for (String temp : mailAddress) {
                if (!Tool.StringUtil.isMailAddress(temp)) {
                    return false;
                }
            }
            return true;
        }

        /**
         * 字符串是否有效
         *
         * @param str
         * @return
         */
        public static boolean validStr(String str) {
            if (str != null && !"".equals(str)) {
                return true;
            }
            return false;
        }

        /**
         * 字符串是否有效
         *
         * @param str1
         * @return
         */
        public static boolean validStr(String... str1) {
            for (String temp : str1) {
                if (!validStr(temp))
                    return false;
            }
            return true;
        }

        /**
         * 长度是否相等
         *
         * @param str1
         * @return
         */
        public static boolean lengthEq(String[]... str1) {
            int length = str1[0].length;
            for (String[] temp : str1) {
                if (temp.length != length) {
                    return false;
                }
            }
            return true;
        }

        /**
         *
         * @param str
         * @return
         */
        public static boolean isNum(String str) {
            String regExp = "^\\d+$";
            if (validStr(str) && str.matches(regExp)) {
                return true;
            }
            return false;
        }

        public static boolean isNum(String ...str) {
            for(String temp:str){
                if(!StringUtil.isNum(temp)) return false;
            }

            return true;
        }

        /**
         *
         * @param content
         * @param regEx
         * @return
         */
        public static String findStrByRegEx(String content, String regEx) {
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(content);
            if (m.find()) {
                return m.group();
            }
            return null;
        }

        /**
         * unicode转换字符串
         */
        public static String unicode2String(String unicode) {

            StringBuffer string = new StringBuffer();

            String[] hex = unicode.split("\\\\u");

            for (int i = 1; i < hex.length; i++) {

                // 转换出每一个代码点
                int data = Integer.parseInt(hex[i], 16);

                // 追加成string
                string.append((char) data);
            }

            return string.toString();
        }

        /**
         * unfinished
         *
         * @param content
         * @param regEx
         * @param index
         * @return
         */
        public static String findStrByRegExMul(String content, String regEx, int index) {
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(content);
            if (m.find(index)) {
                System.out.println(m.end());
                return m.group(index);
            }
            return null;
        }

        /**
         *
         * @param content
         * @param regEx
         * @return
         */
        public static boolean matchStrByRegEx(String content, String regEx) {
            return Tool.StringUtil.findStrByRegEx(content, regEx) != null;
        }

        /**
         * 是否为是11位电话号码,未完成,验证条件不够严谨
         *
         * @param content
         * @return
         */
        public static boolean isPhone(String content) {
            String regExp = "^\\d{11}$";
            return content.matches(regExp);

        }

        /**
         * 字符串转换unicode
         */
        public static String string2Unicode(String string) {

            StringBuffer unicode = new StringBuffer();

            for (int i = 0; i < string.length(); i++) {

                // 取出每一个字符
                char c = string.charAt(i);

                // 转换为unicode
                unicode.append("\\u" + Integer.toHexString(c));
            }

            return unicode.toString();
        }

        /**
         * 获得通过验证的第一个字符串
         *
         * @param str1
         * @return
         */
        public static String getValidOne(String... str1) {
            for (String temp : str1) {
                if (Tool.StringUtil.validStr(temp)) {
                    return temp;
                }
            }
            return null;
        }
    }

    /**
     * 日期工具类
     *
     * @author wglbsr
     *
     */
    public static class DateUtil {

        /**
         *
         * @return
         */
        public static Date getNowDateTime() {
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = formatter.format(currentTime);
            ParsePosition pos = new ParsePosition(8);
            Date currentTime_2 = formatter.parse(dateString, pos);
            return currentTime_2;
        }

        /**
         *
         * @return
         */
        public static String getNowDate() {
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = formatter.format(currentTime);
            return dateString;
        }

        /**
         * 获取当前日期
         *
         * @param format
         * @return
         */
        public static String getNowDate(String format) {
            Date currentTime = new Date();
            if (!Tool.StringUtil.validStr(format)) {
                format = "yyyyMMdd";
            }
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            String dateString = formatter.format(currentTime);
            return dateString;
        }

        /**
         * 获取几天前的日期
         *
         * @param nDays
         * @param format
         * @return
         */
        public static String getNDaysString(int nDays, String format) {
            Calendar calendar = Calendar.getInstance();
            String thisFormat = Tool.StringUtil.validStr(format) ? format : "yyyyMMdd";
            SimpleDateFormat sdf2 = new SimpleDateFormat(thisFormat);
            calendar.add(Calendar.DATE, nDays);
            String three_days_after = sdf2.format(calendar.getTime());
            return three_days_after;
        }

        /**
         * 获取当前日期N天前的凌晨00:00:00的Date对象
         *
         * @param nDays
         * @return
         */
        public static Date getNDaysDate(int nDays) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            calendar.add(Calendar.DATE, nDays);
            return calendar.getTime();
        }

        /**
         * "yyyy-MM-dd HH:mm:ss" 根据格式返回当前时间
         *
         * @param pattern
         * @return
         */
        // private List<String> DatePatternList = null;
        public static String getNowDateStringByPattern(String pattern) {
            // 字符串是否合法
            if (!Tool.StringUtil.validStr(pattern))
                return null;
            Date currentTime = new Date();
            // 此处应该作格式合法判断
            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
            String dateString = formatter.format(currentTime);
            return dateString;
        }

        /**
         *
         * @param date
         * @param pattern
         * @return
         */
        public static String getDateStringByPattern(Date date, String pattern) {
            // 字符串是否合法
            if (!Tool.StringUtil.validStr(pattern))
                return null;
            // 此处应该作格式合法判断
            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
            String dateString = formatter.format(date);
            return dateString;
        }

        /**
         *
         * @param date
         * @param pattern
         * @return
         * @throws ParseException
         */
        public static Date getDateStringByPattern(String date, String pattern) throws ParseException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            return simpleDateFormat.parse(date);
        }

        /**
         * 根据字符串日期转换到另一个模式的字符串
         *
         * @param date
         * @param fromPattern
         * @param toPattern
         * @return
         * @throws ParseException
         */
        public static String getDateStringByPattern(String date, String fromPattern, String toPattern)
                throws ParseException {
            Date temp = Tool.DateUtil.getDateStringByPattern(date, fromPattern);
            return Tool.DateUtil.getDateStringByPattern(temp, toPattern);
        }

        // /**
        // * 根据时区和日期转换
        // *
        // * @param currentDate
        // * @param toTimeZone
        // * @return
        // */
        // public static String transferTimeZone(Date currentDate, String
        // toTimeZone) {
        // return null;
        // }
    }

    /**
     * 短信操作类
     *
     * @author wglbsr
     *
     */
    public static class MessageUtil {

    }
}
