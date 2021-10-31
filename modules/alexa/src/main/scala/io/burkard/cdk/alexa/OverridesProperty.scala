package io.burkard.cdk.alexa

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OverridesProperty {

  def apply(
    manifest: Option[AnyRef] = None
  ): software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty =
    (new software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty.Builder)
      .manifest(manifest.orNull)
      .build()
}
