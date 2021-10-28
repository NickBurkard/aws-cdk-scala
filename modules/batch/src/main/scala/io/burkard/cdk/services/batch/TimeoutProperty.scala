package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TimeoutProperty {

  def apply(
    attemptDurationSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty.Builder)
      .attemptDurationSeconds(attemptDurationSeconds.orNull)
      .build()
}
