package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IamProperty {

  def apply(
    enabled: Boolean
  ): software.amazon.awscdk.services.msk.CfnCluster.IamProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.IamProperty.Builder)
      .enabled(enabled)
      .build()
}
