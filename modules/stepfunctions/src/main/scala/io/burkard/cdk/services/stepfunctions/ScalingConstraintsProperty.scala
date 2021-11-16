package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingConstraintsProperty {

  def apply(
    maxCapacity: Number,
    minCapacity: Number
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty.Builder)
      .maxCapacity(maxCapacity)
      .minCapacity(minCapacity)
      .build()
}
