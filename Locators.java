package wisdom;

import org.openqa.selenium.By;

public class Locators {

	public static By create_account = By.xpath(Json_Reader.fetch("create_account"));
	public static By email = By.xpath(Json_Reader.fetch("email"));
	public static By submit = By.xpath(Json_Reader.fetch("submit"));
	public static By password = By.xpath(Json_Reader.fetch("password"));
	public static By login = By.xpath(Json_Reader.fetch("login"));
	public static By skip = By.xpath(Json_Reader.fetch("skip"));
	public static By sidemenu = By.xpath(Json_Reader.fetch("sidemenu"));
	public static By setting = By.xpath(Json_Reader.fetch("setting"));
	public static By logout = By.xpath(Json_Reader.fetch("logout"));
	public static By yes = By.xpath(Json_Reader.fetch("yes"));
	/*
	 * public static By create =By.xpath(Json_Reader.fetch("create_account"));
	 * public static By create =By.xpath(Json_Reader.fetch("create_account"));
	 */
	public static By name = By.xpath(Json_Reader.fetch("name"));
	public static By phonenumber = By.xpath(Json_Reader.fetch("phonenumber"));
	public static By spassword = By.xpath(Json_Reader.fetch("spassword"));
	public static By screateaccount = By.xpath(Json_Reader.fetch("screateaccount"));
}
