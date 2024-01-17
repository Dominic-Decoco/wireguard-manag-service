import axios from "axios";

const baseURL = 'api/';

export async function getAllUsers() {
    try {
        const response = await axios.get(baseURL+'all-users')
        return response.data;
    } catch (error) {
        console.error('Произошла ошибка при запросе к API:', error);
        throw error;
    }
}