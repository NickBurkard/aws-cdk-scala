package io.burkard.cdk.services.mediaconvert

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPreset {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    settingsJson: Option[AnyRef] = None,
    category: Option[String] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediaconvert.CfnPreset =
    software.amazon.awscdk.services.mediaconvert.CfnPreset.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .settingsJson(settingsJson.orNull)
      .category(category.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .build()
}
