package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServiceAccount {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    cluster: Option[software.amazon.awscdk.services.eks.ICluster] = None,
    namespace: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.ServiceAccount =
    software.amazon.awscdk.services.eks.ServiceAccount.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .cluster(cluster.orNull)
      .namespace(namespace.orNull)
      .build()
}
