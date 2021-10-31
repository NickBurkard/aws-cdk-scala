package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionConfig {

  def apply(
    configuration: Option[AnyRef] = None
  ): software.amazon.awscdk.services.codepipeline.ActionConfig =
    (new software.amazon.awscdk.services.codepipeline.ActionConfig.Builder)
      .configuration(configuration.orNull)
      .build()
}
