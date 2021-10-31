package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ec2HealthCheckOptions {

  def apply(
    grace: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions =
    (new software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions.Builder)
      .grace(grace.orNull)
      .build()
}
