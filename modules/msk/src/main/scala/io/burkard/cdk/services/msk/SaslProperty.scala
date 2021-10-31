package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SaslProperty {

  def apply(
    iam: Option[software.amazon.awscdk.services.msk.CfnCluster.IamProperty] = None,
    scram: Option[software.amazon.awscdk.services.msk.CfnCluster.ScramProperty] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.SaslProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.SaslProperty.Builder)
      .iam(iam.orNull)
      .scram(scram.orNull)
      .build()
}
