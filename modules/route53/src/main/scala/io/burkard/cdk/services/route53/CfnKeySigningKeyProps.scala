package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnKeySigningKeyProps {

  def apply(
    name: Option[String] = None,
    hostedZoneId: Option[String] = None,
    keyManagementServiceArn: Option[String] = None,
    status: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnKeySigningKeyProps =
    (new software.amazon.awscdk.services.route53.CfnKeySigningKeyProps.Builder)
      .name(name.orNull)
      .hostedZoneId(hostedZoneId.orNull)
      .keyManagementServiceArn(keyManagementServiceArn.orNull)
      .status(status.orNull)
      .build()
}
