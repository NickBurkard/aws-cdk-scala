package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExternalServiceAttributes {

  def apply(
    cluster: software.amazon.awscdk.services.ecs.ICluster,
    serviceName: Option[String] = None,
    serviceArn: Option[String] = None
  ): software.amazon.awscdk.services.ecs.ExternalServiceAttributes =
    (new software.amazon.awscdk.services.ecs.ExternalServiceAttributes.Builder)
      .cluster(cluster)
      .serviceName(serviceName.orNull)
      .serviceArn(serviceArn.orNull)
      .build()
}
