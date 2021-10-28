package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CheckpointConfigurationProperty {

  def apply(
    configurationType: Option[String] = None,
    checkpointingEnabled: Option[Boolean] = None,
    minPauseBetweenCheckpoints: Option[Number] = None,
    checkpointInterval: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder)
      .configurationType(configurationType.orNull)
      .checkpointingEnabled(checkpointingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minPauseBetweenCheckpoints(minPauseBetweenCheckpoints.orNull)
      .checkpointInterval(checkpointInterval.orNull)
      .build()
}
