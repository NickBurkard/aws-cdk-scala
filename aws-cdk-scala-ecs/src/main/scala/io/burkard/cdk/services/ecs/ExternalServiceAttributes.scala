package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExternalServiceAttributes {

  def apply(
    serviceName: Option[String] = None,
    serviceArn: Option[String] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None
  ): software.amazon.awscdk.services.ecs.ExternalServiceAttributes =
    (new software.amazon.awscdk.services.ecs.ExternalServiceAttributes.Builder)
      .serviceName(serviceName.orNull)
      .serviceArn(serviceArn.orNull)
      .cluster(cluster.orNull)
      .build()
}
