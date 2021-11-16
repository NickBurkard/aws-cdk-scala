package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnableScalingProps {

  def apply(
    maxCapacity: Number,
    minCapacity: Number
  ): software.amazon.awscdk.services.dynamodb.EnableScalingProps =
    (new software.amazon.awscdk.services.dynamodb.EnableScalingProps.Builder)
      .maxCapacity(maxCapacity)
      .minCapacity(minCapacity)
      .build()
}
