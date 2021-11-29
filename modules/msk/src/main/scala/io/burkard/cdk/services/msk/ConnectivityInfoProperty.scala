package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectivityInfoProperty {

  def apply(
    publicAccess: Option[software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.ConnectivityInfoProperty.Builder)
      .publicAccess(publicAccess.orNull)
      .build()
}
