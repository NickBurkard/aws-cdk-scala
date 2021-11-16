package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ShuffleConfig {

  def apply(
    seed: Number
  ): software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig.Builder)
      .seed(seed)
      .build()
}
