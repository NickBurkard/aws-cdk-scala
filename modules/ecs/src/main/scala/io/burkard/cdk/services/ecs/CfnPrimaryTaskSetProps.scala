package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPrimaryTaskSetProps {

  def apply(
    service: Option[String] = None,
    cluster: Option[String] = None,
    taskSetId: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps =
    (new software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps.Builder)
      .service(service.orNull)
      .cluster(cluster.orNull)
      .taskSetId(taskSetId.orNull)
      .build()
}
