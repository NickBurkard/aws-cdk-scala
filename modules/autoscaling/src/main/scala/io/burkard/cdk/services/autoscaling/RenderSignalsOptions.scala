package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RenderSignalsOptions {

  def apply(
    minCapacity: Option[Number] = None,
    desiredCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.RenderSignalsOptions =
    (new software.amazon.awscdk.services.autoscaling.RenderSignalsOptions.Builder)
      .minCapacity(minCapacity.orNull)
      .desiredCapacity(desiredCapacity.orNull)
      .build()
}
