package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlertTargetProperty {

  def apply(
    alertTargetArn: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty =
    (new software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty.Builder)
      .alertTargetArn(alertTargetArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
