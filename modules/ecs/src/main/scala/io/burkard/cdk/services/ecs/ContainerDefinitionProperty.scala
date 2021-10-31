package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContainerDefinitionProperty {

  def apply(
    name: Option[String] = None,
    stopTimeout: Option[Number] = None,
    hostname: Option[String] = None,
    dnsSearchDomains: Option[List[String]] = None,
    systemControls: Option[List[_]] = None,
    command: Option[List[String]] = None,
    interactive: Option[Boolean] = None,
    links: Option[List[String]] = None,
    memoryReservation: Option[Number] = None,
    environmentFiles: Option[List[_]] = None,
    dependsOn: Option[List[_]] = None,
    workingDirectory: Option[String] = None,
    extraHosts: Option[List[_]] = None,
    startTimeout: Option[Number] = None,
    user: Option[String] = None,
    dockerSecurityOptions: Option[List[String]] = None,
    ulimits: Option[List[_]] = None,
    mountPoints: Option[List[_]] = None,
    repositoryCredentials: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty] = None,
    healthCheck: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty] = None,
    secrets: Option[List[_]] = None,
    entryPoint: Option[List[String]] = None,
    portMappings: Option[List[_]] = None,
    essential: Option[Boolean] = None,
    readonlyRootFilesystem: Option[Boolean] = None,
    image: Option[String] = None,
    volumesFrom: Option[List[_]] = None,
    linuxParameters: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty] = None,
    pseudoTerminal: Option[Boolean] = None,
    cpu: Option[Number] = None,
    environment: Option[List[_]] = None,
    dockerLabels: Option[Map[String, String]] = None,
    resourceRequirements: Option[List[_]] = None,
    privileged: Option[Boolean] = None,
    logConfiguration: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty] = None,
    firelensConfiguration: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty] = None,
    disableNetworking: Option[Boolean] = None,
    memory: Option[Number] = None,
    dnsServers: Option[List[String]] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder)
      .name(name.orNull)
      .stopTimeout(stopTimeout.orNull)
      .hostname(hostname.orNull)
      .dnsSearchDomains(dnsSearchDomains.map(_.asJava).orNull)
      .systemControls(systemControls.map(_.asJava).orNull)
      .command(command.map(_.asJava).orNull)
      .interactive(interactive.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .links(links.map(_.asJava).orNull)
      .memoryReservation(memoryReservation.orNull)
      .environmentFiles(environmentFiles.map(_.asJava).orNull)
      .dependsOn(dependsOn.map(_.asJava).orNull)
      .workingDirectory(workingDirectory.orNull)
      .extraHosts(extraHosts.map(_.asJava).orNull)
      .startTimeout(startTimeout.orNull)
      .user(user.orNull)
      .dockerSecurityOptions(dockerSecurityOptions.map(_.asJava).orNull)
      .ulimits(ulimits.map(_.asJava).orNull)
      .mountPoints(mountPoints.map(_.asJava).orNull)
      .repositoryCredentials(repositoryCredentials.orNull)
      .healthCheck(healthCheck.orNull)
      .secrets(secrets.map(_.asJava).orNull)
      .entryPoint(entryPoint.map(_.asJava).orNull)
      .portMappings(portMappings.map(_.asJava).orNull)
      .essential(essential.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .readonlyRootFilesystem(readonlyRootFilesystem.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .image(image.orNull)
      .volumesFrom(volumesFrom.map(_.asJava).orNull)
      .linuxParameters(linuxParameters.orNull)
      .pseudoTerminal(pseudoTerminal.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cpu(cpu.orNull)
      .environment(environment.map(_.asJava).orNull)
      .dockerLabels(dockerLabels.map(_.asJava).orNull)
      .resourceRequirements(resourceRequirements.map(_.asJava).orNull)
      .privileged(privileged.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .logConfiguration(logConfiguration.orNull)
      .firelensConfiguration(firelensConfiguration.orNull)
      .disableNetworking(disableNetworking.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .memory(memory.orNull)
      .dnsServers(dnsServers.map(_.asJava).orNull)
      .build()
}
