package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ElbHealthCheckOptions {

  def apply(
    grace: software.amazon.awscdk.Duration
  ): software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions =
    (new software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions.Builder)
      .grace(grace)
      .build()
}
