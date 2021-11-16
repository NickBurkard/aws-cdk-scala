package io.burkard.cdk.services.mediaconvert

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPresetProps {

  def apply(
    settingsJson: AnyRef,
    name: Option[String] = None,
    category: Option[String] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.mediaconvert.CfnPresetProps =
    (new software.amazon.awscdk.services.mediaconvert.CfnPresetProps.Builder)
      .settingsJson(settingsJson)
      .name(name.orNull)
      .category(category.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .build()
}
