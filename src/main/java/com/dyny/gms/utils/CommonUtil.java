package com.dyny.gms.utils;

import java.io.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;

import com.alibaba.fastjson.JSONObject;

/**
 * 2018-06-22 update
 *
 * @author wglbsr
 */
public class CommonUtil {
    private static Logger logger = Logger.getLogger(CommonUtil.class);

    public static void main(java.lang.String[] args) throws IOException {
    }

    /**
     * 文件工具类
     *
     * @author wglbsr
     */
    public static class File {
        /**
         * @param proPath
         * @return
         * @throws IOException
         */
        public static Properties getPros(java.lang.String proPath) throws IOException {
            java.lang.String userDir = System.getProperty("user.dir");
            java.lang.String prosFilePath1 = userDir + java.io.File.separator + proPath;
            java.lang.String prosFilePath2 = userDir + java.io.File.separator + "src" + java.io.File.separator + proPath;
            java.io.File test1 = new java.io.File(prosFilePath1);
            java.io.File test2 = new java.io.File(prosFilePath2);
            java.lang.String realPath = "";
            if (test1.exists()) {
                realPath = prosFilePath1;
            } else if (test2.exists()) {
                realPath = prosFilePath2;
            }
            if (String.validStr(realPath)) {
                FileInputStream fis = new FileInputStream(realPath);
                Properties emailPros = new Properties();
                emailPros.load(fis);
                return emailPros;
            }
            return null;
        }

        /**
         * @param filePath
         * @param fileContent
         * @throws IOException
         */
        public static void fileWrite(java.lang.String filePath, List<java.lang.String> fileContent) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            StringBuffer sb = new StringBuffer(4096);
            for (java.lang.String temp : fileContent) {
                if (String.validStr(temp.trim())) {
                    sb.append(temp.trim()).append("\r\n");
                }
            }
            bw.write(sb.toString());
            bw.close();
        }

        /**
         * @param filePath
         * @return
         * @throws IOException
         */
        public static List<java.lang.String> fileRead(java.lang.String filePath) throws IOException {
            List<java.lang.String> fileContent = new ArrayList<java.lang.String>();
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            java.lang.String temp = null;
            while ((temp = br.readLine()) != null) {
                fileContent.add(temp.trim());
            }
            br.close();
            return fileContent;
        }

        /**
         * @param filePath
         * @return
         * @throws IOException
         */
        public static java.lang.String readFile(java.lang.String filePath) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            java.lang.String temp = null;
            StringBuffer sb = new StringBuffer();
            while ((temp = br.readLine()) != null) {
                sb.append(temp.trim());
            }
            br.close();
            return sb.toString();
        }

        /**
         * @return
         */
        public static java.lang.String getProjectPath() {
            return System.getProperty("user.dir");
        }

        /**
         * 读取XML
         *
         * @param filename
         * @return
         * @throws IOException
         */
        public static Document readXml(java.lang.String filename) throws IOException {
            java.io.File f = new java.io.File(filename);
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
        public static java.lang.String getPros(java.lang.String key, java.lang.String filePath) throws IOException {
            Properties prop = new Properties();// 属性集合对象
            FileInputStream fis = new FileInputStream(filePath);// 属性文件流
            prop.load(fis);// 将属性文件流装载到Properties对象中
            return prop.getProperty(key);
        }

        /**
         * 保存文件
         *
         * @param file
         * @param filePath
         * @param fileName
         * @throws Exception
         */
        public static void uploadFile(byte[] file, java.lang.String filePath, java.lang.String fileName) throws Exception {
            java.io.File targetFile = new java.io.File(filePath);
            if (!targetFile.exists()) {
                targetFile.mkdirs();
            }
            FileOutputStream out = new FileOutputStream(filePath + fileName);
            out.write(file);
            out.flush();
            out.close();
        }

    }


    /**
     * 字符串工具类
     *
     * @author wglbsr
     */
    public static class String {
        /**
         * 不为null,但等于""
         *
         * @param str
         * @return
         */
        public static boolean hasEmptyStr(java.lang.String str) {
            if (str != null && !"".equals(str)) {
                return false;
            }
            return true;
        }


        public static boolean equalsAll(java.lang.String target, java.lang.String... str) {
            for (java.lang.String temp : str) {
                if (!temp.equals(target)) {
                    return false;
                }
            }
            return true;
        }

        public static boolean equalsOne(java.lang.String target, java.lang.String... str) {
            for (java.lang.String temp : str) {
                if (temp.equals(target)) {
                    return true;
                }
            }
            return false;
        }

        public static java.lang.String getRandomNum(int num) {
            return "" + (int) (Math.random() * Math.pow(10, num));
        }

        /**
         * 返回json,含错误信息
         *
         * @param success
         * @param data
         * @param errorMsg
         * @return
         */
        public static java.lang.String returnJson(boolean success, Object data, java.lang.String errorMsg) {
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
        public static java.lang.String returnSimpleJson(boolean success, Object data) {
            return String.returnJson(success, data, "");
        }

        /**
         * 是否为邮箱地址
         *
         * @param mailAddress
         * @return
         */
        public static boolean isMailAddress(java.lang.String mailAddress) {
            // TODO Auto-generated method stub
            if (String.matchStrByRegEx(mailAddress,
                    "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$")) {
                return true;
            }
            return false;
        }

        public static boolean isAllMailAddress(java.lang.String... mailAddress) {
            // TODO Auto-generated method stub
            for (java.lang.String temp : mailAddress) {
                if (!String.isMailAddress(temp)) {
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
        public static boolean validStr(java.lang.String str) {
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
        public static boolean validStr(java.lang.String... str1) {
            for (java.lang.String temp : str1) {
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
        public static boolean lengthEq(java.lang.String[]... str1) {
            int length = str1[0].length;
            for (java.lang.String[] temp : str1) {
                if (temp.length != length) {
                    return false;
                }
            }
            return true;
        }

        /**
         * @param str
         * @return
         */
        public static boolean isNum(java.lang.String str) {
            java.lang.String regExp = "^\\d+$";
            if (validStr(str) && str.matches(regExp)) {
                return true;
            }
            return false;
        }

        public static boolean isNum(java.lang.String... str) {
            for (java.lang.String temp : str) {
                if (!String.isNum(temp)) return false;
            }

            return true;
        }

        /**
         * @param content
         * @param regEx
         * @return
         */
        public static java.lang.String findStrByRegEx(java.lang.String content, java.lang.String regEx) {
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
        public static java.lang.String unicode2String(java.lang.String unicode) {

            StringBuffer string = new StringBuffer();

            java.lang.String[] hex = unicode.split("\\\\u");

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
        public static java.lang.String findStrByRegExMul(java.lang.String content, java.lang.String regEx, int index) {
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(content);
            if (m.find(index)) {
                System.out.println(m.end());
                return m.group(index);
            }
            return null;
        }

        /**
         * @param content
         * @param regEx
         * @return
         */
        public static boolean matchStrByRegEx(java.lang.String content, java.lang.String regEx) {
            return String.findStrByRegEx(content, regEx) != null;
        }

        /**
         * 是否为是11位电话号码,未完成,验证条件不够严谨
         *
         * @param content
         * @return
         */
        public static boolean isPhone(java.lang.String content) {
            java.lang.String regExp = "^\\d{11}$";
            return content.matches(regExp);

        }

        /**
         * 是否包含,只要有一个包含,即返回true
         *
         * @param str1
         * @param keyword
         * @return
         */
        public static boolean contains(java.lang.String str1, java.lang.String... keyword) {
            if (StringUtils.isEmpty(str1)) {
                return false;
            }
            for (java.lang.String temp : keyword) {
                if (str1.contains(temp)) {
                    return true;
                }
            }
            return false;
        }

        /**
         * 字符串转换unicode
         */
        public static java.lang.String string2Unicode(java.lang.String string) {

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
        public static java.lang.String getValidOne(java.lang.String... str1) {
            for (java.lang.String temp : str1) {
                if (String.validStr(temp)) {
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
     */
    public static class Date {

        /**
         * @return
         */
        public static java.util.Date getNowDateTime() {
            java.util.Date currentTime = new java.util.Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            java.lang.String dateString = formatter.format(currentTime);
            ParsePosition pos = new ParsePosition(8);
            java.util.Date currentTime_2 = formatter.parse(dateString, pos);
            return currentTime_2;
        }

        /**
         * 时间戳转字符串
         *
         * @param timeStamp
         * @return
         */
        public static java.lang.String timestampToStr(long timeStamp) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//这个是你要转成后的时间的格式
            java.lang.String sd = sdf.format(new java.util.Date(timeStamp));   // 时间戳转换成时间
            return sd;
        }


        /**
         * 时间戳转date
         *
         * @param timestamp
         * @return
         * @throws ParseException
         */
        public static java.util.Date timestampToDate(long timestamp) throws ParseException {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            java.lang.String dateStr = format.format(timestamp);
            java.util.Date date = format.parse(dateStr);
            return date;
        }

        /**
         * @return
         */
        public static java.lang.String getNowDate() {
            java.util.Date currentTime = new java.util.Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            java.lang.String dateString = formatter.format(currentTime);
            return dateString;
        }

        /**
         * 获取当前日期
         *
         * @param format
         * @return
         */
        public static java.lang.String getNowDate(java.lang.String format) {
            java.util.Date currentTime = new java.util.Date();
            if (!String.validStr(format)) {
                format = "yyyyMMdd";
            }
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            java.lang.String dateString = formatter.format(currentTime);
            return dateString;
        }

        /**
         * 获取几天前的日期
         *
         * @param nDays
         * @param format
         * @return
         */
        public static java.lang.String getNDaysString(int nDays, java.lang.String format) {
            Calendar calendar = Calendar.getInstance();
            java.lang.String thisFormat = String.validStr(format) ? format : "yyyyMMdd";
            SimpleDateFormat sdf2 = new SimpleDateFormat(thisFormat);
            calendar.add(Calendar.DATE, nDays);
            java.lang.String three_days_after = sdf2.format(calendar.getTime());
            return three_days_after;
        }

        /**
         * 获取当前日期N天前的凌晨00:00:00的Date对象
         *
         * @param nDays
         * @return
         */
        public static java.util.Date getNDaysDate(int nDays) {
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
        public static java.lang.String getNowDateStringByPattern(java.lang.String pattern) {
            // 字符串是否合法
            if (!String.validStr(pattern))
                return null;
            java.util.Date currentTime = new java.util.Date();
            // 此处应该作格式合法判断
            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
            java.lang.String dateString = formatter.format(currentTime);
            return dateString;
        }

        /**
         * @param date
         * @param pattern
         * @return
         */
        public static java.lang.String getDateStringByPattern(java.util.Date date, java.lang.String pattern) {
            // 字符串是否合法
            if (!String.validStr(pattern))
                return null;
            // 此处应该作格式合法判断
            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
            java.lang.String dateString = formatter.format(date);
            return dateString;
        }

        /**
         * @param date
         * @param pattern
         * @return
         * @throws ParseException
         */
        public static java.util.Date getDateStringByPattern(java.lang.String date, java.lang.String pattern) throws ParseException {
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
        public static java.lang.String getDateStringByPattern(java.lang.String date, java.lang.String fromPattern, java.lang.String toPattern)
                throws ParseException {
            java.util.Date temp = Date.getDateStringByPattern(date, fromPattern);
            return Date.getDateStringByPattern(temp, toPattern);
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

}
