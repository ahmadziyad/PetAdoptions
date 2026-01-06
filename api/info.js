module.exports = async (req, res) => {
  res.status(200).json({
    message: "Spring Boot Adoptions API",
    status: "Configuration Ready",
    note: "This is a Java Spring Boot application. Vercel doesn't natively support Java.",
    deployment_options: {
      recommended: [
        {
          platform: "Railway",
          url: "https://railway.app",
          steps: "Connect GitHub repo, Railway auto-detects Java and deploys"
        },
        {
          platform: "Render", 
          url: "https://render.com",
          steps: "Create web service, connect repo, use 'java -jar target/adoptions-0.0.1-SNAPSHOT.jar'"
        },
        {
          platform: "Heroku",
          url: "https://heroku.com", 
          steps: "Create app, add Java buildpack, deploy via Git"
        }
      ],
      docker_platforms: [
        "Google Cloud Run",
        "AWS App Runner", 
        "DigitalOcean App Platform"
      ]
    },
    project_info: {
      type: "Spring Boot 3.4.12",
      java_version: "24",
      dependencies: ["Spring Web", "Spring Data JDBC", "Spring AI", "PostgreSQL"]
    }
  });
};