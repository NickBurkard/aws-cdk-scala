package io.burkard.cdk.services.emrcontainers

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EksInfoProperty {

  def apply(
    namespace: String
  ): software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty =
    (new software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty.Builder)
      .namespace(namespace)
      .build()
}
