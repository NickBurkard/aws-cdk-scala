package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IamUserProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty.Builder)
      .arn(arn.orNull)
      .build()
}
