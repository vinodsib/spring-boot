package com.dev.reference.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.reference.api.domain.AiResult;
import com.dev.reference.api.domain.Billing;
import com.dev.reference.api.domain.Favourites;

import com.dev.reference.api.domain.User;
import com.dev.reference.api.repository.AiResultRepository;
import com.dev.reference.api.repository.BillingRepository;
import com.dev.reference.api.repository.FavouritesRepository;
import com.dev.reference.api.repository.UserRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BillingRepository billingRepository;
	@Autowired
	private AiResultRepository aiResultRepository;
	@Autowired
	private FavouritesRepository favouritesRepository;

	/*
	 * This API is used to fetch all the users
	 */

	@GetMapping("/all")
	@ApiOperation(value = "Fetch all users")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = User.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Error") })
	public List<User> allUsers() {
		System.out.println("==> Inside allUsers() <==");
		List<User> users = (List<User>) userRepository.findAll();

		return users;
	}

	/**
	 * Find by user <code>id</code>
	 * 
	 * @param id user's id
	 * 
	 * @return the {@link User} object
	 */
	@GetMapping("/{id}")
	@ApiOperation(value = "Fetch a User")
	public Optional<User> getUser(@PathVariable Long id) {
		System.out.println("==> Inside getUser() <==");
		return userRepository.findById(id);
	}

	/**
	 * This API is used to create a user
	 * 
	 * @param User
	 * @return User
	 */
	@RequestMapping(path = "/createUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Add a User")
	public User createUser(@RequestBody User user) {
		System.out.println("==> Inside createUser <== " + user);
		User savedUser = userRepository.save(user);

		return savedUser;
	}

	/**
	 * Updates the user
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(path = "/update", method = RequestMethod.PUT)
	@ApiOperation(value = "Update a User")
	public User update(@RequestBody User user) {
		User updatedUser = userRepository.save(user);

		return updatedUser;
	}

	/**
	 * Deletes user identified with <code>id</code>
	 * 
	 * @param id
	 */
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete a user")
	public void delete(@PathVariable Long id) {
		userRepository.deleteById(id);
	}
	/**
	 * This API is used to create a user
	 * 
	 * @param Billing
	 * @return Billing
	 */
	@RequestMapping(path = "/billing", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Billing ")
	public Billing createUser(@RequestBody Billing billing) {
		System.out.println("==> Inside Billing <== " + billing);
		Billing savedbilling = billingRepository.save(billing);

		return savedbilling;
	}
	/**
	 * This API is used to create AI Image result
	 * 
	 * @param AiResult
	 * @return AiResult
	 */
	@GetMapping("/airesult/all")
	@ApiOperation(value = "Fetch all Ai Images")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = AiResult.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Error") })
	public List<AiResult> allAiresults() {
		System.out.println("==> Inside allAiresults() <==");
		List<AiResult> AiResult1 = (List<AiResult>) aiResultRepository.findAll();

		return AiResult1;
	}
	/**
	 * This API is used to update AI Image result
	 * 
	 * @param AiResult
	 * @return AiResult
	 */
	@RequestMapping(path = "/airesult/update", method = RequestMethod.PUT)
	@ApiOperation(value = "Update a Ai Result")
	public AiResult update(@RequestBody AiResult aiResult) {
		AiResult updatedAiresult = aiResultRepository.save(aiResult);

		return updatedAiresult;
	}
	/**
	 * This API is used to add favourites
	 * 
	 * @param User
	 * @return User
	 */
	@RequestMapping(path = "/addfavourites", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Add a Favourites")
	public Favourites addfavourites(@RequestBody Favourites favourites) {
		System.out.println("==> Inside Favourites <== " + favourites);
		Favourites addfavourites = favouritesRepository.save(favourites);

		return addfavourites;
	}
	/**
	 * This API is used to Fetch all result
	 * 
	 * @param Favourites
	 * @return Favourites
	 */
	@GetMapping("/favourites")
	@ApiOperation(value = "Fetch all userPreferances ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Favourites.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Error") })
	public List<Favourites> allfavourites() {
		System.out.println("==> Inside allfavourites() <==");
		List<Favourites> favourites = (List<Favourites>) favouritesRepository.findAll();

		return favourites;
	}
	
}
