package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ComputeEnvironmentOrderProperty {

  def apply(
    computeEnvironment: Option[String] = None,
    order: Option[Number] = None
  ): software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty =
    (new software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.Builder)
      .computeEnvironment(computeEnvironment.orNull)
      .order(order.orNull)
      .build()
}
