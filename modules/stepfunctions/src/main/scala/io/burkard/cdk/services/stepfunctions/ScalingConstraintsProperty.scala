package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingConstraintsProperty {

  def apply(
    maxCapacity: Option[Number] = None,
    minCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty.Builder)
      .maxCapacity(maxCapacity.orNull)
      .minCapacity(minCapacity.orNull)
      .build()
}
