package io.burkard.cdk.services.mediaconvert

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPreset {

  def apply(
    internalResourceId: String,
    settingsJson: AnyRef,
    name: Option[String] = None,
    category: Option[String] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediaconvert.CfnPreset =
    software.amazon.awscdk.services.mediaconvert.CfnPreset.Builder
      .create(stackCtx, internalResourceId)
      .settingsJson(settingsJson)
      .name(name.orNull)
      .category(category.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .build()
}
