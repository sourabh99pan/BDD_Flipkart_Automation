package com.java.ExcelUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReadWrite {
	
	public static void readWrite() throws IOException, ParseException
	{
		JSONParser jsonParser = new JSONParser();
		try  {
			FileReader reader = new FileReader("D:\\example_1.json");
			//Read JSON file
			            JSONObject jsonparse = (JSONObject)jsonParser.parse(reader);
			            //JSONArray usersList = (JSONArray) obj;
			            
			            String fruit = (String) jsonparse.get("fruit");
			            System.out.println("Users List-> "+fruit); //This prints the entire json file
			            /*for(int i=0;i<usersList.size();i++) {
			            JSONObject users = (JSONObject) usersList.get(i);
			            System.out.println("Users -> "+users);//This prints every block - one json object
			            JSONObject user = (JSONObject) users.get("users");
			            System.out.println("User -> "+user); //This prints each data in the block
			            String username = (String) user.get("username");
			            String password = (String) user.get("password");
			            //user.put("result", result);

			            //Write JSON file
			               try (FileWriter file = new FileWriter("Testdata1.json")) {

			                    file.append(usersList.toJSONString());
			                    file.flush();


			                } catch (IOException e) {
			                    e.printStackTrace();
			                }

			                System.out.println(user);


			            }*/

			} catch (FileNotFoundException e) {
			e.printStackTrace();
			}
			}
	}


