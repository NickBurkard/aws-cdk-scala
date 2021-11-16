package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceAccount {

  def apply(
    internalResourceId: String,
    cluster: software.amazon.awscdk.services.eks.ICluster,
    name: Option[String] = None,
    namespace: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.ServiceAccount =
    software.amazon.awscdk.services.eks.ServiceAccount.Builder
      .create(stackCtx, internalResourceId)
      .cluster(cluster)
      .name(name.orNull)
      .namespace(namespace.orNull)
      .build()
}
