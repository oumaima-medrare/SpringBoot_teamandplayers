const axios = require("axios");

// Replace this with your Spring Boot base URL
const baseUrl = "http://localhost:8080";

// Function to handle errors
const handleError = (error) => {
  console.error("Error:", error.response ? error.response.data : error.message);
};

// CRUD for Team
// Create a new team
async function createTeam(teamData) {
  try {
    const response = await axios.post(`${baseUrl}/teams`, teamData);
    console.log("Team created:", response.data);
    return response.data;
  } catch (error) {
    handleError(error);
  }
}

// Get all teams
async function getAllTeams() {
  try {
    const response = await axios.get(`${baseUrl}/teams`);
    console.log("All teams:", response.data);
    return response.data;
  } catch (error) {
    handleError(error);
  }
}

// Update a team by ID
async function updateTeam(teamId, updatedTeamData) {
  try {
    const response = await axios.put(
      `${baseUrl}/teams/${teamId}`,
      updatedTeamData
    );
    console.log("Team updated:", response.data);
    return response.data;
  } catch (error) {
    handleError(error);
  }
}

// Delete a team by ID
async function deleteTeam(teamId) {
  try {
    const response = await axios.delete(`${baseUrl}/teams/${teamId}`);
    console.log("Team deleted:", response.data);
    return response.data;
  } catch (error) {
    handleError(error);
  }
}

// CRUD for Players

// Create a new player
const createPlayer = async (player) => {
  try {
    const response = await axios.post(`${baseUrl}/players`, player);
    console.log("Player created:", response.data);
    return response.data;
  } catch (error) {
    handleError(error);
  }
};

// Get all players
const getAllPlayers = async () => {
  try {
    const response = await axios.get(`${baseUrl}/players`);
    console.log("All Players:", response.data);
    return response.data;
  } catch (error) {
    handleError(error);
  }
};

// Get player by ID
const getPlayerById = async (playerId) => {
  try {
    const response = await axios.get(`${baseUrl}/players/${playerId}`);
    console.log("Player:", response.data);
    return response.data;
  } catch (error) {
    handleError(error);
  }
};

// Update player by ID
const updatePlayer = async (playerId, updatedPlayer) => {
  try {
    const response = await axios.put(
      `${baseUrl}/players/${playerId}`,
      updatedPlayer
    );
    console.log("Player updated:", response.data);
    return response.data;
  } catch (error) {
    handleError(error);
  }
};

// Delete player by ID
const deletePlayer = async (playerId) => {
  try {
    const response = await axios.delete(`${baseUrl}/players/${playerId}`);
    console.log("Player deleted:", response.data);
    return response.data;
  } catch (error) {
    handleError(error);
  }
};

// Usage example
async function main() {
  console.log("CRUD teams ");

  const newTeam = {
    t_name: "Sample Team",
  };

  const createdTeam = await createTeam(newTeam);
  await getAllTeams();
  const updatedTeam = await updateTeam(createdTeam.t_id, {
    t_name: "Updated Team Name",
  });
  await deleteTeam(updatedTeam.t_id);
  await getAllTeams();

  console.log("\n");
  console.log("CRUD players ");

  const newPlayer = { p_name: "New Player" };

  const createdPlayer = await createPlayer(newPlayer);
  await getAllPlayers();
  const updatedPlayer = await updatePlayer(createdPlayer.p_id, {
    p_name: "Updated Player",
  });
  await deletePlayer(updatedPlayer);
  await getAllPlayers();
}

main();
