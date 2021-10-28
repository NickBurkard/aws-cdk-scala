package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPrimaryTaskSet {

  def apply(
    internalResourceId: String,
    service: Option[String] = None,
    cluster: Option[String] = None,
    taskSetId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet =
    software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet.Builder
      .create(stackCtx, internalResourceId)
      .service(service.orNull)
      .cluster(cluster.orNull)
      .taskSetId(taskSetId.orNull)
      .build()
}
