package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingTypeConfigProperty {

  def apply(
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty =
    (new software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty.Builder)
      .`type`(`type`.orNull)
      .build()
}
