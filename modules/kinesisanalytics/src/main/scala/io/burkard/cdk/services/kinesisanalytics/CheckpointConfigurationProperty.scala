package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CheckpointConfigurationProperty {

  def apply(
    configurationType: String,
    checkpointingEnabled: Option[Boolean] = None,
    minPauseBetweenCheckpoints: Option[Number] = None,
    checkpointInterval: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder)
      .configurationType(configurationType)
      .checkpointingEnabled(checkpointingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minPauseBetweenCheckpoints(minPauseBetweenCheckpoints.orNull)
      .checkpointInterval(checkpointInterval.orNull)
      .build()
}
