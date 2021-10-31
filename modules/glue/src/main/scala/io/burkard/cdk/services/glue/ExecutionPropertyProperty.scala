package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExecutionPropertyProperty {

  def apply(
    maxConcurrentRuns: Option[Number] = None
  ): software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty =
    (new software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty.Builder)
      .maxConcurrentRuns(maxConcurrentRuns.orNull)
      .build()
}
