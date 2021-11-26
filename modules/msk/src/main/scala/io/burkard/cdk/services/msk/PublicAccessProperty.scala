package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublicAccessProperty {

  def apply(
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.PublicAccessProperty.Builder)
      .`type`(`type`.orNull)
      .build()
}
