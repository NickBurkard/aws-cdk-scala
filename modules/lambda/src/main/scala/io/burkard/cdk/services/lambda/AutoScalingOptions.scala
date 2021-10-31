package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoScalingOptions {

  def apply(
    maxCapacity: Option[Number] = None,
    minCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.lambda.AutoScalingOptions =
    (new software.amazon.awscdk.services.lambda.AutoScalingOptions.Builder)
      .maxCapacity(maxCapacity.orNull)
      .minCapacity(minCapacity.orNull)
      .build()
}
