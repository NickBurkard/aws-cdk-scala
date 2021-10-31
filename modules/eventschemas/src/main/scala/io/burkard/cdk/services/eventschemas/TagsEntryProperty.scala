package io.burkard.cdk.services.eventschemas

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagsEntryProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty =
    (new software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
