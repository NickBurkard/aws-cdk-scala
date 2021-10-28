package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnKeySigningKey {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    hostedZoneId: Option[String] = None,
    keyManagementServiceArn: Option[String] = None,
    status: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CfnKeySigningKey =
    software.amazon.awscdk.services.route53.CfnKeySigningKey.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .hostedZoneId(hostedZoneId.orNull)
      .keyManagementServiceArn(keyManagementServiceArn.orNull)
      .status(status.orNull)
      .build()
}
