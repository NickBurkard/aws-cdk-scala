package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnKeySigningKeyProps {

  def apply(
    name: String,
    hostedZoneId: String,
    keyManagementServiceArn: String,
    status: String
  ): software.amazon.awscdk.services.route53.CfnKeySigningKeyProps =
    (new software.amazon.awscdk.services.route53.CfnKeySigningKeyProps.Builder)
      .name(name)
      .hostedZoneId(hostedZoneId)
      .keyManagementServiceArn(keyManagementServiceArn)
      .status(status)
      .build()
}
