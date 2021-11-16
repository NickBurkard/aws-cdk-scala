package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UnauthenticatedProperty {

  def apply(
    enabled: Boolean
  ): software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty.Builder)
      .enabled(enabled)
      .build()
}
