# Pet Adoptions - Smart Pet Adoption Platform

## Description
This project is a **Smart Pet Adoption Platform** built with **Spring Boot**. It is designed to modernize the pet adoption process by leveraging **Artificial Intelligence**.

The goal is to move beyond simple filter-based searches (e.g., "Dog", "Golden Retriever") to a system that understands compatibility, finding the right pet for an adopter's specific lifestyle and personality.

## Key Features
- **Smart Recommendations**: The system recommends pets based on semantic matching (e.g., "Good for apartments," "High energy companion") using vector embeddings.
- **AI-Driven Profiling**: Analyzes user profiles to understand lifestyle, living conditions, and preferences.
- **Intelligent Search**: Utilizes PGVector for semantic search capabilities.

## Technology Stack
- **Java**: 24
- **Framework**: Spring Boot 3.4.12
- **AI Integration**: Spring AI 1.0.3
- **AI Infrastructure**: Amazon Bedrock
- **Vector Store**: PGVector
- **Database Access**: Spring Data JDBC

## Adoption Process
1. **User Registration & Profiling**: Adopters sign up and allow AI to analyze their profile.
2. **Browse & Match**: Users browse pets or get smart recommendations.
3. **Application**: Users submit adoption applications.
4. **Interaction**: Meet & Greets and AI-assisted Q&A.
5. **Approval**: Staff review and digital signing.
6. **Support**: Post-adoption resources.

## Getting Started

### Prerequisites
- Java 24
- Docker (for PGVector, if running locally via containers)
- Maven (Wrapper is included)

### Running the Application

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd PetAdoptions
   ```

2. **Build the project**
   ```bash
   ./mvnw clean install
   ```

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

The application will start on the default Spring Boot port (usually 8080).
