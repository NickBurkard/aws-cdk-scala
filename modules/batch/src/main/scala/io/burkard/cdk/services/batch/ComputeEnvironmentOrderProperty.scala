package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ComputeEnvironmentOrderProperty {

  def apply(
    computeEnvironment: String,
    order: Number
  ): software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty =
    (new software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.Builder)
      .computeEnvironment(computeEnvironment)
      .order(order)
      .build()
}
