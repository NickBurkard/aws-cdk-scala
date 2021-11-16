package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScramProperty {

  def apply(
    enabled: Boolean
  ): software.amazon.awscdk.services.msk.CfnCluster.ScramProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.ScramProperty.Builder)
      .enabled(enabled)
      .build()
}
