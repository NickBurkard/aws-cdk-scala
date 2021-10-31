package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigurationInfoProperty {

  def apply(
    arn: Option[String] = None,
    revision: Option[Number] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty.Builder)
      .arn(arn.orNull)
      .revision(revision.orNull)
      .build()
}
