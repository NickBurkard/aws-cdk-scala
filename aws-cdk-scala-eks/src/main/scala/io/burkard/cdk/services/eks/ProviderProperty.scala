package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProviderProperty {

  def apply(
    keyArn: Option[String] = None
  ): software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty =
    (new software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty.Builder)
      .keyArn(keyArn.orNull)
      .build()
}
