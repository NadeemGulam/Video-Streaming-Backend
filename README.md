
# Video-Streaming-Backend

## Overview
The Video-Streaming-Backend is a Spring Boot application designed to support video streaming functionalities. This backend service provides APIs for video upload, retrieval, metadata management, and user authentication. It utilizes Spring Boot, Spring Data JPA, MySQL, and other essential technologies to ensure a robust and scalable architecture.

## Features
- **Video Upload**: Allows users to upload videos with associated metadata.
- **Video Retrieval**: Supports streaming and downloading of videos.
- **Metadata Management**: Manage video metadata such as title, description, and tags.
- **User Authentication**: Provides user registration, login, and authentication services.
- **Secure APIs**: Utilizes JWT for secure communication.

## Prerequisites
- Java 17 or higher
- Maven 3.6+
- MySQL 5.7+ or 8.0+
- Spring Boot 2.7+

## Installation

### Clone the Repository
\`\`\`bash
git clone https://github.com/yourusername/Video-Streaming-Backend.git
cd Video-Streaming-Backend
\`\`\`

### Setup Database
1. Create a MySQL database:
   \`\`\`sql
   CREATE DATABASE video_streaming_db;
   \`\`\`
2. Update the database configuration in \`src/main/resources/application.properties\`:
   \`\`\`properties
   spring.datasource.url=jdbc:mysql://localhost:3306/video_streaming_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

   jwt.secret=your_jwt_secret
   \`\`\`

### Build and Run the Application
\`\`\`bash
mvn clean install
mvn spring-boot:run
\`\`\`

The application will start on \`http://localhost:8080\`.

## API Endpoints

### Authentication
- **POST /api/auth/register** - Register a new user
- **POST /api/auth/login** - Authenticate a user and return a JWT token

### Videos
- **POST /api/videos/upload** - Upload a new video
- **GET /api/videos/{id}** - Stream a specific video by ID
- **GET /api/videos** - Get a list of videos with metadata

### Metadata
- **GET /api/metadata/{id}** - Get metadata for a specific video
- **PUT /api/metadata/{id}** - Update metadata for a specific video
- **DELETE /api/metadata/{id}** - Delete a specific video's metadata

## Technologies Used
- **Spring Boot** - Core framework
- **Spring Data JPA** - Data access layer
- **MySQL** - Relational database
- **JWT** - JSON Web Tokens for authentication
- **Maven** - Build tool

## Development

### Running the Application in Development Mode
To run the application in development mode, use the following Maven command:

\`\`\`bash
mvn spring-boot:run
\`\`\`

### Running Tests
To run the unit and integration tests, use the following command:

\`\`\`bash
mvn test
\`\`\`

## Contributing
Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new feature branch (\`git checkout -b feature/your-feature\`).
3. Commit your changes (\`git commit -m 'Add some feature'\`).
4. Push to the branch (\`git push origin feature/your-feature\`).
5. Open a pull request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any inquiries or support, please contact [your_email@example.com](mailto:your_email@example.com).
