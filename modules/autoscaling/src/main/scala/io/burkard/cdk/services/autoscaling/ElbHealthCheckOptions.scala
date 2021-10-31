package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ElbHealthCheckOptions {

  def apply(
    grace: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions =
    (new software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions.Builder)
      .grace(grace.orNull)
      .build()
}
