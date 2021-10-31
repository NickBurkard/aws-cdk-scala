package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AvailBlankingProperty {

  def apply(
    state: Option[String] = None,
    availBlankingImage: Option[software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty.Builder)
      .state(state.orNull)
      .availBlankingImage(availBlankingImage.orNull)
      .build()
}
