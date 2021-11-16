package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlarmIdentifierProperty {

  def apply(
    name: String,
    region: String
  ): software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty =
    (new software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty.Builder)
      .name(name)
      .region(region)
      .build()
}
