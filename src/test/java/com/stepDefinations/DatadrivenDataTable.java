package com.stepDefinations;

import java.util.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

/**
 * Represents DataDriven functionality using DataTable. This class collects
 * login credentials from the feature file and perform the datadriven testing.
 * 
 * @author Nisha Vekariya
 * @version 1.0
 */
public class DatadrivenDataTable {

	@Given("the test data table for software engineers")
	public void the_test_data_table_for_software_engineers() {
		System.out.println(" Inside the testdata table for software engineer");
	}

	@When("verify the login values")
	public void verify_the_login_values(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		// Using List<List<E>>
		System.out.print("\n=======Verify data using  List<List<E>>===========");
		List<List<String>> listRows = dataTable.asLists(String.class);
		for (List<String> columns : listRows) {
			System.out.print("\nEngineer name : ");
			for (String data : columns) {
				System.out.print(data + "   ");
			}
		}

		// Using List<Map<K,V>>
		System.out.print("\n=======Verify data using  List<Map<K,V>> ===========");
		List<Map<String, String>> listMapRows = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapColumns : listMapRows) {
			System.out.print(
					"\n Engineer Name : " + mapColumns.get("name") + " and Age : " + mapColumns.get("experience"));
		}
	}

	@Then("data received succefully")
	public void data_received_succefully() {
		System.out.println(" INside the testdata received successfully for software engineer");
	}

	// --------------------Scenario : Exmple with data table ---------------------------

	@Given("email address of new user as {string}")
	public void email_address_of_new_user_as(String custEmail) {
		System.out.println(" Entered the new email of customer : " + custEmail);
	}

	@When("I enter my personal informations")
	public void i_enter_my_personal_informations(DataTable dataTable) {
		List<Map<String, String>> listMapRows = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapColumns : listMapRows) {
			System.out
					.print("\n Customer FirstName : " + mapColumns.get("customerFirstName") + " , Customer LastName : "
							+ mapColumns.get("customerLastName") + " , and title : " + mapColumns.get("title"));

		}
	}

	@And("I enter my address informations")
	public void i_enter_my_address_informations(io.cucumber.datatable.DataTable dataTable) {

		System.out.print("\n=======Verify data using  List<Map<K,V>> ===========");
		List<Map<String, String>> listMapRows = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapColumns : listMapRows) {
			System.out.print("\n FirstName : " + mapColumns.get("firstName") + " , LastName : "
					+ mapColumns.get("lastName") + " , and Company : " + mapColumns.get("company"));

		}
	}

	@Then("successfully submitted the application")
	public void successfully_submitted_the_application() {
		System.out.println("Successfully submitted the form.");
	}
}
