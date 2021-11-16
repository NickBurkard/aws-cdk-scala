package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnKeySigningKey {

  def apply(
    internalResourceId: String,
    name: String,
    hostedZoneId: String,
    keyManagementServiceArn: String,
    status: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CfnKeySigningKey =
    software.amazon.awscdk.services.route53.CfnKeySigningKey.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .hostedZoneId(hostedZoneId)
      .keyManagementServiceArn(keyManagementServiceArn)
      .status(status)
      .build()
}
