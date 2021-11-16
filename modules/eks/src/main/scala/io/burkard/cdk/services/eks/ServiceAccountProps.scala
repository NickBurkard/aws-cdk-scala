package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceAccountProps {

  def apply(
    cluster: software.amazon.awscdk.services.eks.ICluster,
    name: Option[String] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.eks.ServiceAccountProps =
    (new software.amazon.awscdk.services.eks.ServiceAccountProps.Builder)
      .cluster(cluster)
      .name(name.orNull)
      .namespace(namespace.orNull)
      .build()
}
