package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ec2ServiceAttributes {

  def apply(
    cluster: software.amazon.awscdk.services.ecs.ICluster,
    serviceName: Option[String] = None,
    serviceArn: Option[String] = None
  ): software.amazon.awscdk.services.ecs.Ec2ServiceAttributes =
    (new software.amazon.awscdk.services.ecs.Ec2ServiceAttributes.Builder)
      .cluster(cluster)
      .serviceName(serviceName.orNull)
      .serviceArn(serviceArn.orNull)
      .build()
}
