# Use uma imagem oficial do OpenJDK como imagem base
FROM openjdk:latest
# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo JAR da sua aplicação para o diretório de trabalho no contêiner
COPY target/apirest-0.0.1-SNAPSHOT.jar /app/apirest-0.0.1-SNAPSHOT.jar

# Exponha a porta 8080, que é a porta em que sua aplicação está ouvindo
EXPOSE 8080

# Comando para executar a aplicação quando o contêiner for iniciado
CMD ["java", "-jar", "apirest-0.0.1-SNAPSHOT.jar"]