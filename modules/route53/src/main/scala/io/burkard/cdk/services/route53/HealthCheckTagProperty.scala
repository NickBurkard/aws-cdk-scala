package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HealthCheckTagProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckTagProperty =
    (new software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckTagProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
