package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoTerminationPolicyProperty {

  def apply(
    idleTimeout: software.amazon.awscdk.Duration
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoTerminationPolicyProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoTerminationPolicyProperty.Builder)
      .idleTimeout(idleTimeout)
      .build()
}
