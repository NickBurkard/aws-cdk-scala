package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ec2ServiceAttributes {

  def apply(
    serviceName: Option[String] = None,
    serviceArn: Option[String] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None
  ): software.amazon.awscdk.services.ecs.Ec2ServiceAttributes =
    (new software.amazon.awscdk.services.ecs.Ec2ServiceAttributes.Builder)
      .serviceName(serviceName.orNull)
      .serviceArn(serviceArn.orNull)
      .cluster(cluster.orNull)
      .build()
}
