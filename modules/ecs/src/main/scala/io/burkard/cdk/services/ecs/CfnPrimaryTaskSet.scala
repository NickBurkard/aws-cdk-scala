package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPrimaryTaskSet {

  def apply(
    internalResourceId: String,
    service: String,
    cluster: String,
    taskSetId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet =
    software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet.Builder
      .create(stackCtx, internalResourceId)
      .service(service)
      .cluster(cluster)
      .taskSetId(taskSetId)
      .build()
}
