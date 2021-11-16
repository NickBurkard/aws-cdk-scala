package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnJobProps {

  def apply(
    role: String,
    command: software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty,
    notificationProperty: Option[software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty] = None,
    numberOfWorkers: Option[Number] = None,
    executionProperty: Option[software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty] = None,
    timeout: Option[Number] = None,
    glueVersion: Option[String] = None,
    connections: Option[software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty] = None,
    name: Option[String] = None,
    maxCapacity: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    allocatedCapacity: Option[Number] = None,
    defaultArguments: Option[AnyRef] = None,
    securityConfiguration: Option[String] = None,
    logUri: Option[String] = None,
    workerType: Option[String] = None,
    maxRetries: Option[Number] = None
  ): software.amazon.awscdk.services.glue.CfnJobProps =
    (new software.amazon.awscdk.services.glue.CfnJobProps.Builder)
      .role(role)
      .command(command)
      .notificationProperty(notificationProperty.orNull)
      .numberOfWorkers(numberOfWorkers.orNull)
      .executionProperty(executionProperty.orNull)
      .timeout(timeout.orNull)
      .glueVersion(glueVersion.orNull)
      .connections(connections.orNull)
      .name(name.orNull)
      .maxCapacity(maxCapacity.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .allocatedCapacity(allocatedCapacity.orNull)
      .defaultArguments(defaultArguments.orNull)
      .securityConfiguration(securityConfiguration.orNull)
      .logUri(logUri.orNull)
      .workerType(workerType.orNull)
      .maxRetries(maxRetries.orNull)
      .build()
}
