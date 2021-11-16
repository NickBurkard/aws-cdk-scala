package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPrimaryTaskSetProps {

  def apply(
    service: String,
    cluster: String,
    taskSetId: String
  ): software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps =
    (new software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps.Builder)
      .service(service)
      .cluster(cluster)
      .taskSetId(taskSetId)
      .build()
}
