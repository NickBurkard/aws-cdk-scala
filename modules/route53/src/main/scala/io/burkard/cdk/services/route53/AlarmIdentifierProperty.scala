package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AlarmIdentifierProperty {

  def apply(
    name: Option[String] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty =
    (new software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty.Builder)
      .name(name.orNull)
      .region(region.orNull)
      .build()
}
