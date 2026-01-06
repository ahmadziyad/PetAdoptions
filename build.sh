#!/bin/bash

# Build the Spring Boot application
./mvnw clean package -DskipTests

# Create output directory
mkdir -p dist

# Copy the JAR file
cp target/adoptions-0.0.1-SNAPSHOT.jar dist/

# Create a simple start script
cat > dist/start.sh << 'EOF'
#!/bin/bash
java -jar adoptions-0.0.1-SNAPSHOT.jar --server.port=${PORT:-8080}
EOF

chmod +x dist/start.sh

echo "Build completed. JAR file is in dist/ directory."