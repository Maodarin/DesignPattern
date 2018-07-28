package darin.designPattern.AbstractFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DataAccess {
	private static String db = "sqlserver";
	public static IUser createUser() {
		IUser result = null;
		switch(db) {
		case "sqlserver":
			result = new SqlServerIUser();
			break;
		case "accessServer":
			result = new AccessIUser();
			break;
		}
		return result;
	}
	//利用反射来实例化类
	public static IUser createUserRef() {
		Class<?> iUser;
		IUser result=null;
		try {
			try {
				iUser = Class.forName(getValue("sqlserver"));
				result= (IUser)iUser.newInstance();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	
	
	public static IProduct createProduct() {
		IProduct result = null;
		switch(db) {
		case "sqlserver":
			result = new SqlServerIProduct();
			break;
		case "accessServer":
			result = new AccessIProduct();
			break;
		}
		return result;
	}
	
	public static String getValue(String key) throws IOException {
		Properties properties = new Properties();
		FileReader in =new FileReader("D:\\Workspace\\DesignPattern\\src\\darin\\designPattern\\AbstractFactory\\db.properties");
		properties.load(in);
		in.close();
		return properties.getProperty(key);
	}

}
