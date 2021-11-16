package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlertTargetProperty {

  def apply(
    alertTargetArn: String,
    roleArn: String
  ): software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty =
    (new software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty.Builder)
      .alertTargetArn(alertTargetArn)
      .roleArn(roleArn)
      .build()
}
