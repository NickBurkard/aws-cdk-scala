package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ShuffleConfig {

  def apply(
    seed: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig.Builder)
      .seed(seed.orNull)
      .build()
}
